package com.kelsianelima.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "user")
public class Item {
	@Id
	private ObjectId id;
		
	private String nome;
	private String observacao;
	private String categoria;
	private int quantidade;
	private int valor_unitario;
	private int preco_medio;
	
	
	
	public Item() {}

	public Item(ObjectId id, String nome, String observacao, String categoria, int quantidade, int valor_unitario,
				int preco_medio) {
			super();
			this.id = id;
			this.nome = nome;
			this.observacao = observacao;
			this.categoria = categoria;
			this.quantidade = quantidade;
			this.valor_unitario = valor_unitario;
			this.preco_medio = preco_medio;
		}

	public String getId() {
		return id.toHexString();
	}
	
	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getValor_unitario() {
		return valor_unitario;
	}

	public void setValor_unitario(int valor_unitario) {
		this.valor_unitario = valor_unitario;
	}

	public int getPreco_medio() {
		return preco_medio;
	}

	public void setPreco_medio(int preco_medio) {
		this.preco_medio = preco_medio;
	}
	
	
}
