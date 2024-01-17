package com.viniciusdevassis.project.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class CollectionService {

	@Autowired
    private MongoTemplate mongoTemplate;

    public void criarColecao(String nomeColecao) {
        if (!mongoTemplate.collectionExists(nomeColecao)) {
            mongoTemplate.createCollection(nomeColecao);
            System.out.println("Coleção criada: " + nomeColecao);
        } else {
            System.out.println("Coleção já existe: " + nomeColecao);
        }
    }
}

