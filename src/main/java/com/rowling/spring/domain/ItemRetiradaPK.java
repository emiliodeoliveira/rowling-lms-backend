package com.rowling.spring.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemRetiradaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="retirada_id")
	private Retirada retirada;
	
	@ManyToOne
	@JoinColumn(name="Livro_id")
	private Livro livro;
	
	public Retirada getRetirada() {
		return retirada;
	}
	public void setRetirada(Retirada retirada) {
		this.retirada = retirada;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((retirada == null) ? 0 : retirada.hashCode());
		result = prime * result + ((livro == null) ? 0 : livro.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemRetiradaPK other = (ItemRetiradaPK) obj;
		if (retirada == null) {
			if (other.retirada != null)
				return false;
		} else if (!retirada.equals(other.retirada))
			return false;
		if (livro == null) {
			if (other.livro != null)
				return false;
		} else if (!livro.equals(other.livro))
			return false;
		return true;
	}
	
	
	
}
