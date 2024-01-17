package com.viniciusdevassis.project.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.viniciusdevassis.project.domain.Aluno;
import com.viniciusdevassis.project.domain.Usuario;
import com.viniciusdevassis.project.domain.enums.Cargo;
import com.viniciusdevassis.project.domain.enums.Instrumento;
import com.viniciusdevassis.project.domain.enums.Nivel;
import com.viniciusdevassis.project.dto.ProgressoDTO;
import com.viniciusdevassis.project.dto.TutorDTO;
import com.viniciusdevassis.project.repositories.AlunoRepository;
import com.viniciusdevassis.project.repositories.UsuarioRepository;
import com.viniciusdevassis.project.services.CollectionService;

@Configuration
public class InstantiationTest implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
    private CollectionService collectionService;

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		collectionService.criarColecao("usuario");
		collectionService.criarColecao("aluno");
		collectionService.criarColecao("progresso");
		
		usuarioRepository.deleteAll();
		alunoRepository.deleteAll();
		
		Usuario u1 = new Usuario(null, "Vinícius Assis", Cargo.INSTRUTOR, Instrumento.SAX_SOPRANO, "75991934597");
		
		usuarioRepository.saveAll(Arrays.asList(u1));
		
		Aluno a1 = new Aluno(null, "Samuel Pereira", Cargo.ALUNO, Instrumento.CORNET, Nivel.OFICIALIZADO, "7512345678", sdf.parse("05/05/2018"), new TutorDTO(u1));
		
		ProgressoDTO p1 = new ProgressoDTO("Teste de Oficialização", sdf.parse("03/09/2022"), new TutorDTO(u1));
		
		a1.getProgresso().addAll(Arrays.asList(p1));
		alunoRepository.saveAll(Arrays.asList(a1));
	}
}
