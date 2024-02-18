package com.viniciusdevassis.project.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import com.viniciusdevassis.project.domain.enums.Cargo;
import com.viniciusdevassis.project.domain.enums.Instrumento;
import com.viniciusdevassis.project.domain.enums.Nivel;
import com.viniciusdevassis.project.dto.ProgressoDTO;
import com.viniciusdevassis.project.dto.TutorDTO;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="aluno")
@NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode(of="id")
public class Aluno implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Getter @Setter private String id;
	@Getter @Setter private String nome;
	
	@Field(targetType = FieldType.STRING)
	@Getter @Setter private Cargo cargo;
	
	@Field(targetType = FieldType.STRING)
	@Getter @Setter private Instrumento instrumento;
	
	@Field(targetType = FieldType.STRING)
	@Getter @Setter private Nivel nivel;
	
	@Getter @Setter private String contato;
	
	@Getter @Setter private Instant inicio;
	
	@Getter @Setter private TutorDTO tutor;
	
	@Getter @Setter private List<ProgressoDTO> progresso = new ArrayList<>();

	public Aluno(String id, String nome, Cargo cargo, Instrumento instrumento, Nivel nivel, String contato, Instant inicio,
			TutorDTO tutor) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.instrumento = instrumento;
		this.nivel = nivel;
		this.contato = contato;
		this.inicio = inicio;
		this.tutor = tutor;
	}
}
