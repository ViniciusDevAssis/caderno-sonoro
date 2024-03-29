package com.viniciusdevassis.project.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import com.viniciusdevassis.project.domain.enums.Cargo;
import com.viniciusdevassis.project.domain.enums.Instrumento;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="usuario")
@NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode(of="id")
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Getter @Setter private String id;
	@Getter @Setter private String nome;
	
	@Field(targetType = FieldType.STRING)
	@Getter @Setter private Cargo cargo;
	
	@Field(targetType = FieldType.STRING)
	@Getter @Setter private Instrumento instrumento;
	@Getter @Setter private String contato;
	
}
