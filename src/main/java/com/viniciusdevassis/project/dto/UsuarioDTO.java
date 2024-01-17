package com.viniciusdevassis.project.dto;

import java.io.Serializable;

import com.viniciusdevassis.project.domain.Usuario;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class UsuarioDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Getter @Setter private String id;
	@Getter @Setter private String nome;
	@Getter @Setter private String cargo;
	@Getter @Setter private String contato;
	
	public UsuarioDTO(Usuario obj) {
		id = obj.getId();
		nome = obj.getNome();
		cargo = obj.getCargo().name();
		contato = obj.getContato();
	}
}
