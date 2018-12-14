package com.rowling.spring.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.rowling.spring.domain.Categoria;
import com.rowling.spring.domain.Cidade;
import com.rowling.spring.domain.Cliente;
import com.rowling.spring.domain.Endereco;
import com.rowling.spring.domain.Estado;
import com.rowling.spring.domain.ItemRetirada;
import com.rowling.spring.domain.Retirada;
import com.rowling.spring.domain.Livro;
import com.rowling.spring.domain.enums.Perfil;
import com.rowling.spring.domain.enums.TipoCliente;
import com.rowling.spring.repositories.CategoriaRepository;
import com.rowling.spring.repositories.CidadeRepository;
import com.rowling.spring.repositories.ClienteRepository;
import com.rowling.spring.repositories.EnderecoRepository;
import com.rowling.spring.repositories.EstadoRepository;
import com.rowling.spring.repositories.ItemRetiradaRepository;
import com.rowling.spring.repositories.RetiradaRepository;
import com.rowling.spring.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private BCryptPasswordEncoder pe;
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository LivroRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private RetiradaRepository RetiradaRepository;
	@Autowired
	private ItemRetiradaRepository itemRetiradaRepository;
	
	public void instantiateTestDatabase() throws ParseException {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Construção");
		Categoria cat3 = new Categoria(null, "Direito");
		Categoria cat4 = new Categoria(null, "Gastronomia");
		Categoria cat5 = new Categoria(null, "Desenvolvimento de software");
		Categoria cat6 = new Categoria(null, "Ficção");
		Categoria cat7 = new Categoria(null, "Design");
		
		Livro p1 = new Livro(null, "Titulo 1");
		Livro p2 = new Livro(null, "Titulo 2");
		Livro p3 = new Livro(null, "Titulo 3");
		Livro p4 = new Livro(null, "Titulo 4");
		Livro p5 = new Livro(null, "Livro 5");
		Livro p6 = new Livro(null, "Livro 6");
		Livro p7 = new Livro(null, "Livro 7");
		Livro p8 = new Livro(null, "Livro 8");
		Livro p9 = new Livro(null, "Livro 9");
		Livro p10 = new Livro(null, "Livro 10");
		Livro p11 = new Livro(null, "Livro 11");
		
		Livro p12 = new Livro(null, "Livro 12");
		Livro p13 = new Livro(null, "Livro 13");
		Livro p14 = new Livro(null, "Livro 14");
		Livro p15 = new Livro(null, "Livro 15");
		Livro p16 = new Livro(null, "Livro 16");
		Livro p17 = new Livro(null, "Livro 17");
		Livro p18 = new Livro(null, "Livro 18");
		Livro p19 = new Livro(null, "Livro 19");
		Livro p20 = new Livro(null, "Livro 20");
		Livro p21 = new Livro(null, "Livro 21");
		Livro p22 = new Livro(null, "Livro 22");
		Livro p23 = new Livro(null, "Livro 23");
		Livro p24 = new Livro(null, "Livro 24");
		Livro p25 = new Livro(null, "Livro 25");
		Livro p26 = new Livro(null, "Livro 26");
		Livro p27 = new Livro(null, "Livro 27");
		Livro p28 = new Livro(null, "Livro 28");
		Livro p29 = new Livro(null, "Livro 29");
		Livro p30 = new Livro(null, "Livro 30");
		Livro p31 = new Livro(null, "Livro 31");
		Livro p32 = new Livro(null, "Livro 32");
		Livro p33 = new Livro(null, "Livro 33");
		Livro p34 = new Livro(null, "Livro 34");
		Livro p35 = new Livro(null, "Livro 35");
		Livro p36 = new Livro(null, "Livro 36");
		Livro p37 = new Livro(null, "Livro 37");
		Livro p38 = new Livro(null, "Livro 38");
		Livro p39 = new Livro(null, "Livro 39");
		Livro p40 = new Livro(null, "Livro 40");
		Livro p41 = new Livro(null, "Livro 41");
		Livro p42 = new Livro(null, "Livro 42");
		Livro p43 = new Livro(null, "Livro 43");
		Livro p44 = new Livro(null, "Livro 44");
		Livro p45 = new Livro(null, "Livro 45");
		Livro p46 = new Livro(null, "Livro 46");
		Livro p47 = new Livro(null, "Livro 47");
		Livro p48 = new Livro(null, "Livro 48");
		Livro p49 = new Livro(null, "Livro 49");
		Livro p50 = new Livro(null, "Livro 50");
		
		
		cat1.getLivros().addAll(Arrays.asList(p12, p13, p14, p15, p16, p17, p18, p19, p20,
		p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p34, p35, p36, p37, p38,
		p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		
		p12.getCategorias().add(cat1);
		p13.getCategorias().add(cat2);
		p14.getCategorias().add(cat1);
		p15.getCategorias().add(cat7);
		p16.getCategorias().add(cat6);
		p17.getCategorias().add(cat3);
		p18.getCategorias().add(cat2);
		p19.getCategorias().add(cat1);
		p20.getCategorias().add(cat1);
		p21.getCategorias().add(cat1);
		p22.getCategorias().add(cat5);
		p23.getCategorias().add(cat6);
		p24.getCategorias().add(cat6);
		p25.getCategorias().add(cat4);
		p26.getCategorias().add(cat4);
		p27.getCategorias().add(cat3);
		p28.getCategorias().add(cat7);
		p29.getCategorias().add(cat7);
		p30.getCategorias().add(cat5);
		p31.getCategorias().add(cat5);
		p32.getCategorias().add(cat6);
		p33.getCategorias().add(cat6);
		p34.getCategorias().add(cat2);
		p35.getCategorias().add(cat1);
		p36.getCategorias().add(cat1);
		p37.getCategorias().add(cat4);
		p38.getCategorias().add(cat1);
		p39.getCategorias().add(cat3);
		p40.getCategorias().add(cat3);
		p41.getCategorias().add(cat7);
		p42.getCategorias().add(cat7);
		p43.getCategorias().add(cat6);
		p44.getCategorias().add(cat2);
		p45.getCategorias().add(cat2);
		p46.getCategorias().add(cat4);
		p47.getCategorias().add(cat4);
		p48.getCategorias().add(cat4);
		p49.getCategorias().add(cat3);
		p50.getCategorias().add(cat2);	
		
		cat1.getLivros().addAll(Arrays.asList(p1, p2, p3));
		cat2.getLivros().addAll(Arrays.asList(p2, p4));
		cat3.getLivros().addAll(Arrays.asList(p5, p6));
		cat4.getLivros().addAll(Arrays.asList(p1, p2, p3, p7));
		cat5.getLivros().addAll(Arrays.asList(p8));
		cat6.getLivros().addAll(Arrays.asList(p9, p10));
		cat7.getLivros().addAll(Arrays.asList(p11));
		
		p1.getCategorias().addAll(Arrays.asList(cat1, cat4));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2, cat4));
		p3.getCategorias().addAll(Arrays.asList(cat1, cat4));
		p4.getCategorias().addAll(Arrays.asList(cat2));
		p5.getCategorias().addAll(Arrays.asList(cat3));
		p6.getCategorias().addAll(Arrays.asList(cat3));
		p7.getCategorias().addAll(Arrays.asList(cat4));
		p8.getCategorias().addAll(Arrays.asList(cat5));
		p9.getCategorias().addAll(Arrays.asList(cat6));
		p10.getCategorias().addAll(Arrays.asList(cat6));
		p11.getCategorias().addAll(Arrays.asList(cat7));
				
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
		LivroRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));

		LivroRepository.saveAll(Arrays.asList(p12, p13, p14, p15, p16, p17, p18, p19, p20,
				p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38,
				p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));

		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria.silva@gmail.com", "36378912377", TipoCliente.PESSOAFISICA, pe.encode("123456"));
		
		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
		
		Cliente cli2 = new Cliente(null, "Admin", "admin@rowling.com", "31628382740", TipoCliente.PESSOAFISICA, pe.encode("123456"));
		cli2.getTelefones().addAll(Arrays.asList("93883321", "34252625"));
		cli2.addPerfil(Perfil.ADMIN);
		
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);
		Endereco e3 = new Endereco(null, "Avenida Floriano", "2106", null, "Centro", "281777012", cli2, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		cli2.getEnderecos().addAll(Arrays.asList(e3));
		
		clienteRepository.saveAll(Arrays.asList(cli1, cli2));
		enderecoRepository.saveAll(Arrays.asList(e1, e2, e3));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Retirada ped1 = new Retirada(null, sdf.parse("30/09/2017 10:32"), cli1);
		Retirada ped2 = new Retirada(null, sdf.parse("10/10/2017 19:35"), cli1);
		

		
		cli1.getRetiradas().addAll(Arrays.asList(ped1, ped2));
		
		RetiradaRepository.saveAll(Arrays.asList(ped1, ped2));
		
		ItemRetirada ip1 = new ItemRetirada(ped1, p1, 1 );
		ItemRetirada ip2 = new ItemRetirada(ped1, p3, 2);
		ItemRetirada ip3 = new ItemRetirada(ped2, p2, 1);
		
		ped1.getItens().addAll(Arrays.asList(ip1, ip2));
		ped2.getItens().addAll(Arrays.asList(ip3));
		
		p1.getItens().addAll(Arrays.asList(ip1));
		p2.getItens().addAll(Arrays.asList(ip3));
		p3.getItens().addAll(Arrays.asList(ip2));
		
		itemRetiradaRepository.saveAll(Arrays.asList(ip1, ip2, ip3));		
	}
}
