package com.example.recycler_view_1;

public class MessageModel {
    private String name;
    private String message;
    private int pictureId;

    public MessageModel(String name, String message, int pictureId) {
        this.name = name;
        this.message = message;
        this.pictureId = pictureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
}
