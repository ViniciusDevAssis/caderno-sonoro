package com.viniciusdevassis.project.dto;

import java.io.Serializable;

import com.viniciusdevassis.project.domain.Aluno;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class AlunoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Getter @Setter private String id;
	@Getter @Setter private String nome;
	
	public AlunoDTO(Aluno obj) {
		id = obj.getId();
		nome = obj.getNome();
	}
}
