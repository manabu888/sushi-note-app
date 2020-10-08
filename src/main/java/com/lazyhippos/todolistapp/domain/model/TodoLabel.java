package com.lazyhippos.todolistapp.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class TodoLabel {
    // TODO Composite ID class
    @Id
    private String todoId;
    @Id
    private String labelId;
    private String description;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;
    private Boolean isDeleted;

    public TodoLabel() {
    }

    public TodoLabel(String todoId, String labelId, String description, LocalDateTime createdDateTime,
                     LocalDateTime updatedDateTime, Boolean isDeleted) {
        this.todoId = todoId;
        this.labelId = labelId;
        this.description = description;
        this.createdDateTime = createdDateTime;
        this.updatedDateTime = updatedDateTime;
        this.isDeleted = isDeleted;
    }

    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
