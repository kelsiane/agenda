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
		private String email;
		private String senha;
		 private List<Lista> lista;
		  
		public User(){}		
		
	

		public User(ObjectId id, String nome, String email, String senha, List<Lista> lista) {
			super();
			this.id = id;
			this.nome = nome;
			this.email = email;
			this.senha = senha;
			this.lista = lista;
		}




		public String getEmail() {
			return email;
		}




		public void setEmail(String email) {
			this.email = email;
		}




		public String getSenha() {
			return senha;
		}




		public void setSenha(String senha) {
			this.senha = senha;
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
