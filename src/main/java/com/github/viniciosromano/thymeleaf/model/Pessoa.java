package com.github.viniciosromano.thymeleaf.model;

public class Pessoa {
	private Long id;
	private String nome;
	private SexoTipo sexo;
		
	public Pessoa(Long id, String nome, SexoTipo sexo) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		//SexoTipo.ValueOf() caso seja uma String e queira converter em um objeto
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public SexoTipo getSexo() {
		return sexo;
	}
	public void setSexo(SexoTipo sexo) {
		this.sexo = sexo;
	}
	
	
}
