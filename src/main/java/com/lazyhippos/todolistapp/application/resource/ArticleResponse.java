package com.lazyhippos.todolistapp.application.resource;

import java.time.LocalDateTime;

public class ArticleResponse {

    private String articleId;
    private String userId;
    private String topicId;
    private String title;
    private String textBody;
    private Boolean isDeleted;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;

    public ArticleResponse() {
    }

    public ArticleResponse(String articleId, String userId, String topicId, String title,
                           String textBody, Boolean isDeleted, LocalDateTime createdDateTime,
                           LocalDateTime updatedDateTime) {
        this.articleId = articleId;
        this.userId = userId;
        this.topicId = topicId;
        this.title = title;
        this.textBody = textBody;
        this.isDeleted = isDeleted;
        this.createdDateTime = createdDateTime;
        this.updatedDateTime = updatedDateTime;
    }

    public String getArticleId() {
        return articleId;
    }

    public String getUserId() {
        return userId;
    }

    public String getTopicId() {
        return topicId;
    }

    public String getTitle() {
        return title;
    }

    public String getTextBody() {
        return textBody;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public static String convertToHtml(String rawData) {

        final String P_OPEN_TAG = "<p>";
        final String P_CLOSE_TAG = "</p>";
        final String LINE_BREAK = "<br />";
        // Check
        if (rawData == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String[] paragraph = rawData.split("\\r\\n\\r\\n");
        for (int i = 0; i < paragraph.length; i++) {
            stringBuilder.append(P_OPEN_TAG);
            stringBuilder.append(paragraph[i]);
            stringBuilder.append(P_CLOSE_TAG);
        }
        String taggedText = stringBuilder.toString();
        taggedText = taggedText.replace("\r\n", LINE_BREAK);
        return taggedText;
    }
}
