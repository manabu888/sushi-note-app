package com.lazyhippos.todolistapp.application.resource;

import com.lazyhippos.todolistapp.domain.model.Todos;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TodoRequest implements Serializable {

    private String todoId;
    private String title;
    private String description;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime deadlineDate;
    private boolean isCompleted;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;
    private String labelId;

    public TodoRequest() {
    }

    public TodoRequest(String todoId, String title, String description, LocalDateTime deadlineDate,
                       boolean isCompleted, LocalDateTime createdDateTime,
                       LocalDateTime updatedDateTime, String labelId) {
        this.todoId = todoId;
        this.title = title;
        this.description = description;
        this.deadlineDate = deadlineDate;
        this.isCompleted = isCompleted;
        this.createdDateTime = createdDateTime;
        this.updatedDateTime = updatedDateTime;
        this.labelId = labelId;
    }

    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDateTime deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
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

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public static TodoRequest generateTodoRequest(Todos entity){

        TodoRequest request = new TodoRequest();
        request.setCompleted(entity.getIsCompleted());

        if(entity.getTitle() != null){
            request.setTitle(entity.getTitle());
        }
        if(entity.getTodoId() != null){
            request.setTodoId(entity.getTodoId());
        }
        if(entity.getDescription() != null) {
            request.setDescription(entity.getDescription());
        }
        if(entity.getDeadlineDate() != null) {
            request.setDeadlineDate(entity.getDeadlineDate());
        }
        if(entity.getLabelId() != null) {
            request.setLabelId(entity.getLabelId());
        }
        return request;
    }
}
