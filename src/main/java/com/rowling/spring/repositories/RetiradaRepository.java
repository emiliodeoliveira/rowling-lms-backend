package com.rowling.spring.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rowling.spring.domain.Cliente;
import com.rowling.spring.domain.Retirada;

@Repository
public interface RetiradaRepository extends JpaRepository<Retirada, Integer> {

	@Transactional(readOnly=true)
	Page<Retirada> findByCliente(Cliente cliente, Pageable pageRequest);
}
