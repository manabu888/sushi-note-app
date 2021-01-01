package com.lazyhippos.todolistapp.domain.service;

import com.lazyhippos.todolistapp.domain.model.Articles;
import com.lazyhippos.todolistapp.domain.model.Documents;
import com.lazyhippos.todolistapp.domain.repository.DocumentJpaRepository;
import com.lazyhippos.todolistapp.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {

    public final DocumentJpaRepository documentJpaRepository;

    DocumentService (DocumentJpaRepository documentJpaRepository) {
        this.documentJpaRepository = documentJpaRepository;
    }

    public Boolean save(Documents documents) {
        try {
            documentJpaRepository.save(documents);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<Documents> retrieveAll () {
        return documentJpaRepository.findAll();
    }

    public Long getDocumentIdByFilePath(String filePath) {
        return documentJpaRepository.getDocumentIdByFilePath(filePath);
    }

    public Optional<Documents> retrieveById(Long documentId) {
        Optional<Documents> retrievedItem = documentJpaRepository.findById(documentId);
        if (!retrievedItem.isPresent()) {
            throw new EntityNotFoundException(Documents.class, "documentId", documentId.toString());
        }
        return retrievedItem;
    }
}
