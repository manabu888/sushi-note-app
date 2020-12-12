package com.lazyhippos.todolistapp.domain.service;

import com.lazyhippos.todolistapp.application.resource.ArticleRequest;
import com.lazyhippos.todolistapp.application.resource.ArticleSummary;
import com.lazyhippos.todolistapp.domain.model.Articles;
import com.lazyhippos.todolistapp.domain.repository.ArticleJpaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    private final ArticleJpaRepository articleJpaRepository;

    public ArticleService(ArticleJpaRepository articleJpaRepository){
        this.articleJpaRepository = articleJpaRepository;
    }

    public List<Articles> retrieveAll() {
        return articleJpaRepository.findAll();
    }

    public List<Articles> retrieveByTopicId(String topicId) {
        return articleJpaRepository.findByTopicId(topicId);
    }

    public Optional<Articles> retrieveByArticleId(String articleId) {
        return articleJpaRepository.findById(articleId);
    }

    public List<Articles> retrieveByUserId(String userId) {
        return articleJpaRepository.findByUserId(userId);
    }

    public void save(ArticleRequest request, LocalDateTime now) {
        // TODO Generating summary of article
        String foo = "";
        // TODO Check the count of the words

        // TODO If exceeding 50 words, cut off the rest.

        articleJpaRepository.save(new Articles(
                request.getArticleId(),
                request.getUserId(),
                request.getTopicId(),
                request.getTitle(),
                request.getTextBody(),
                foo,
                false,
                now,
                now
        ));
    }

    public void update(ArticleRequest request, LocalDateTime now) {
        // TODO Generating summary of article
        articleJpaRepository.updateArticle(
                request.getArticleId(), request.getTopicId(), request.getTitle(), request.getTextBody(), now);
    }
}
