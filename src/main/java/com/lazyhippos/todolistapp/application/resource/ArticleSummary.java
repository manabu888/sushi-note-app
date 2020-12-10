package com.lazyhippos.todolistapp.application.resource;

import java.time.LocalDateTime;

public class ArticleSummary {

    private String articleId;
    private String userId;
    private String topicId;
    private String title;
    private LocalDateTime updatedDateTime;

    public ArticleSummary() {
    }

    public ArticleSummary(String articleId, String userId, String topicId, String title, LocalDateTime updatedDateTime) {
        this.articleId = articleId;
        this.userId = userId;
        this.topicId = topicId;
        this.title = title;
        this.updatedDateTime = updatedDateTime;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }
}