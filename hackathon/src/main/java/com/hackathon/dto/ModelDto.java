package com.hackathon.dto;

import com.hackathon.model.Model;

import lombok.Data;

@Data
public class ModelDto {
	private Long id;
	private String nome;
	
	public Model toModel() {
		Model model = new Model();
		model.setId(getId());
		model.setNome(getNome());
		return model;
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
	
	
}
