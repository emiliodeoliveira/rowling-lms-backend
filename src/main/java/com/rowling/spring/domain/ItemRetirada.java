package com.rowling.spring.domain;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ItemRetirada implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@EmbeddedId
	private ItemRetiradaPK id = new ItemRetiradaPK();

	private Integer quantidade;

	
	public ItemRetirada() {
	}

	public ItemRetirada(Retirada retirada, Livro livro, Integer quantidade) {
		super();
		id.setRetirada(retirada);
		id.setLivro(livro);
		this.quantidade = quantidade;
	
	}

	
	@JsonIgnore
	public Retirada getRetirada() {
		return id.getRetirada();
	}
	
	public void setRetirada(Retirada Retirada) {
		id.setRetirada(Retirada);
	}
	
	public Livro getLivro() {
		return id.getLivro();
	}
	
	public void setLivro(Livro Livro) {
		id.setLivro(Livro);
	}
	
	public ItemRetiradaPK getId() {
		return id;
	}

	public void setId(ItemRetiradaPK id) {
		this.id = id;
	}

	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ItemRetirada other = (ItemRetirada) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		StringBuilder builder = new StringBuilder();
		builder.append(getLivro().getNome());
		builder.append(", Qte: ");
		builder.append(getQuantidade());
		builder.append("\n");
		return builder.toString();
	}
}
