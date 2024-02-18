package com.viniciusdevassis.project.services;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciusdevassis.project.domain.Aluno;
import com.viniciusdevassis.project.repositories.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repo;
	
	public List<Aluno> findAll(){
		return repo.findAll();
	}
	
	public Aluno inserirAluno(Aluno obj) {
		obj.setInicio(Instant.now());
		obj.setTutor(null);
		obj.setProgresso(null);
		return repo.insert(obj);
	}
}
