package com.viniciusdevassis.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.viniciusdevassis.project.domain.Usuario;
import com.viniciusdevassis.project.domain.enums.Cargo;
import com.viniciusdevassis.project.repositories.UsuarioRepository;

@Configuration
public class InstantiationTest implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {
		
		usuarioRepository.deleteAll();
		
		Usuario u1 = new Usuario(null, "Vinícius Assis", Cargo.INSTRUTOR, "75991934597");
		
		usuarioRepository.saveAll(Arrays.asList(u1));
	}
}
