package com.lazyhippos.todolistapp.application.resource;

import org.springframework.web.multipart.MultipartFile;

public class ImageRequest {

    private MultipartFile file;
    private String userId;

    public ImageRequest() {
    }

    public ImageRequest(MultipartFile file, String userId) {
        this.file = file;
        this.userId = userId;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
