package com.example.chat_application;

import com.google.type.Date;

class Message {
    private String senderId;
    private String content;
    private String type;
    private Date timestamp;

    public Message(String senderId, String content, String type, Date timestamp) {
        this.senderId = senderId;
        this.content = content;
        this.type = type;
        this.timestamp = timestamp;
    }

    // Getters
    public String getSenderId() {
        return senderId;
    }

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
