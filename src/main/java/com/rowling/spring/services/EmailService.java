package com.rowling.spring.services;

import org.springframework.mail.SimpleMailMessage;

import com.rowling.spring.domain.Cliente;
import com.rowling.spring.domain.Retirada;

public interface EmailService {

	void sendOrderConfirmationEmail(Retirada obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
