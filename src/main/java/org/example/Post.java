package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    private int id;
    private String title;
    private String body;
    private int userId;

    public Post(
            @JsonProperty("userId") int userId,
            @JsonProperty("id") int id,
            @JsonProperty("title") String title,
            @JsonProperty("body") String body
    ) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;

    }

    @Override
    public String toString() {
        return "Json:" +
                "\n userId=" + userId +
                "\n id=" + id +
                "\n title=" + title +
                "\n body=" + body;
    }
}
