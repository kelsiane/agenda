package com.kelsianelima.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lista")
public class Lista {
	@Id
	private ObjectId id;
	private String descricao;
	private String observacao;

	 private List<Item> item;
	 
	
	 
	 
	 
	 public Lista() {}
	 
	 
		public Lista(ObjectId id, String descricao, String observacao, List<Item> item) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.observacao = observacao;
		this.item = item;
	}

		public String getId() {
			return id.toHexString();
		}

		public void setId(ObjectId id) {
			this.id = id;
		}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}



}
