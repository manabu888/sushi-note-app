package com.lazyhippos.sushinote.domain.repository;

import com.lazyhippos.sushinote.domain.model.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

public interface ArticleJpaRepository extends JpaRepository<Articles, String> {
    List<Articles> findByTopicId(String topicId);
    List<Articles> findByUserId(String userId);
    @Transactional
    @Modifying
    @Query("UPDATE Articles a SET a.title = :title,"
            + "a.textBody = :textBody,"
            + "a.summary = :summary,"
            + "a.topicId = :topicId,"
            + "a.documentId = :documentId,"
            + "a.updatedDateTime = :updatedDatetime"
            + " WHERE a.articleId = :articleId")
    void updateArticle(@Param(value = "articleId") String articleId,
                       @Param(value = "topicId") String topicId,
                       @Param(value = "title") String title,
                       @Param(value = "textBody") String textBody,
                       @Param(value = "summary")String summary,
                       @Param(value = "documentId") Long documentId,
                       @Param(value = "updatedDatetime") LocalDateTime updatedDatetime);
}
