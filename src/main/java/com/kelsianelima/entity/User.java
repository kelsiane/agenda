package com.kelsianelima.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "user")
public class User {
		@Id
		private ObjectId id;
		private String nome;
		 private List<Lista> lista;
		  
		public User(){}		
		
		public User(ObjectId id, String nome) {
			super();
			this.id = id;
			this.nome = nome;
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

		public List<Lista> getLista() {
			return lista;
		}

		public void setLista(List<Lista> lista) {
			this.lista = lista;
		}
		
		
		
}
