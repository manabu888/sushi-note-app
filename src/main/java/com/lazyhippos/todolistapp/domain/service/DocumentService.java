package com.lazyhippos.todolistapp.domain.service;

import com.lazyhippos.todolistapp.domain.model.Documents;
import com.lazyhippos.todolistapp.domain.repository.DocumentJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    public final DocumentJpaRepository documentJpaRepository;

    DocumentService (DocumentJpaRepository documentJpaRepository) {
        this.documentJpaRepository = documentJpaRepository;
    }

    public void save(Documents documents) {
        documentJpaRepository.save(documents);
    }

    public List<Documents> retrieveAll () {
        return documentJpaRepository.findAll();
    }
}
