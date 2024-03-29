package com.lazyhippos.sushinote.application.resource;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ArticleRequest {
    @NotBlank
    private String articleId;
    @NotBlank
    private String userId;
    @Size(max = 200)
    @NotBlank
    private String topicId;
    @NotBlank
    @Size(max = 200)
    private String title;
    @NotBlank
    private String textBody;

    private Long documentId;

    public ArticleRequest() {}

    public ArticleRequest(String articleId, String userId, String topicId, String title, String textBody,
                          Long documentId) {
        this.articleId = articleId;
        this.userId = userId;
        this.topicId = topicId;
        this.title = title;
        this.textBody = textBody;
        this.documentId = documentId;
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

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    @Override
    public String toString() {
        return "ArticleRequest{" +
                "articleId='" + articleId + '\'' +
                "userId='" + userId + '\'' +
                ", topicId='" + topicId + '\'' +
                ", title='" + title + '\'' +
                ", textBody='" + textBody + '\'' +
                ", documentId='" + documentId + '\'' +
                '}';
    }
}
