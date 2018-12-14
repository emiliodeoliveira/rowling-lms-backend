package com.rowling.spring.services;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.rowling.spring.domain.Cliente;
import com.rowling.spring.domain.ItemRetirada;
import com.rowling.spring.domain.Retirada;
import com.rowling.spring.domain.enums.EstadoPagamento;
import com.rowling.spring.repositories.ItemRetiradaRepository;
import com.rowling.spring.repositories.RetiradaRepository;
import com.rowling.spring.security.UserSS;
import com.rowling.spring.services.exceptions.AuthorizationException;
import com.rowling.spring.services.exceptions.ObjectNotFoundException;

@Service
public class RetiradaService {
	
	@Autowired
	private RetiradaRepository repo;
	
	@Autowired
	private ItemRetiradaRepository itemRetiradaRepository;
	
	@Autowired
	private LivroService LivroService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private EmailService emailService;
	
	public Retirada find(Integer id) {
		Optional<Retirada> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Retirada.class.getName()));
	}
	
	public Retirada insert(Retirada obj) {
		obj.setId(null);
		obj.setInstante(new Date());
		obj.setCliente(clienteService.find(obj.getCliente().getId()));
		
		obj = repo.save(obj);
		
		for (ItemRetirada ip : obj.getItens()) {
			ip.setLivro(LivroService.find(ip.getLivro().getId()));
			ip.setRetirada(obj);
		}
		itemRetiradaRepository.saveAll(obj.getItens());
		emailService.sendOrderConfirmationEmail(obj);
		return obj;
	}
	
	public Page<Retirada> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		UserSS user = UserService.authenticated();
		if (user == null) {
			throw new AuthorizationException("Acesso negado");
		}
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		Cliente cliente =  clienteService.find(user.getId());
		return repo.findByCliente(cliente, pageRequest);
	}
}
