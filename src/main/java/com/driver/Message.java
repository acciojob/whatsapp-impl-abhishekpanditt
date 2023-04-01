package com.driver;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Message {
    private int id;
    private String content;
    private Date timestamp;

    public Message() {
    }

    public Message(int id, String content) {
        this.id = id;
        this.content = content;
        LocalDate localDate = LocalDate.now();
        this.timestamp = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
