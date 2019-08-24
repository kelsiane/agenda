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
	private double valor_unitario;
	private double preco_medio;
	
	
	
	public Item() {}
	double total (int quantidade, double valor_unitario) {
		this.quantidade=quantidade;
		this.valor_unitario=valor_unitario;
		return preco_medio;
	}
	public Item(ObjectId id, String nome, String observacao, String categoria, int quantidade, double valor_unitario) {
			super();
			this.id = id;
			this.nome = nome;
			this.observacao = observacao;
			this.categoria = categoria;
			this.quantidade = quantidade;
			this.valor_unitario = valor_unitario;
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
	public double getValor_unitario() {
		return valor_unitario;
	}
	public void setValor_unitario(double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}



	
	
}
