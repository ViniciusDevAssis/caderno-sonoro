package com.viniciusdevassis.project.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@NoArgsConstructor @AllArgsConstructor
public class ProgressoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	@Getter @Setter private String observacao;
	@Getter @Setter private Date data;
	@Getter @Setter private TutorDTO tutor;
}
