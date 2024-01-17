package com.viniciusdevassis.project.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import com.viniciusdevassis.project.domain.enums.Cargo;
import com.viniciusdevassis.project.domain.enums.Instrumento;
import com.viniciusdevassis.project.domain.enums.Nivel;
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
	
	@Getter @Setter private Date inicio;
	
	@Getter @Setter private TutorDTO tutor;
}
