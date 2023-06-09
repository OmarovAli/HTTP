package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    private final int id;
    private final String title;
    private final String body;
    private final int userId;
    private final Integer upvotes;

    public Post(
            @JsonProperty("userId") int userId,
            @JsonProperty("id") int id,
            @JsonProperty("title") String title,
            @JsonProperty("body") String body,
            @JsonProperty("upvotes") Integer upvotes
        ) {

        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        this.upvotes = upvotes;
    }
    public int getUserId() {
        return userId;
    }
    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }
    public String getBody() {
        return body;
    }
        public Integer getUpvotes() {
        return upvotes;
        }

    @Override
    public String toString() {
        return "Json:" +
                "\n userId=" + userId +
                "\n id=" + id +
                "\n title=" + title +
                "\n body=" + body +
                "\n upvotes=" + upvotes;
    }
}
