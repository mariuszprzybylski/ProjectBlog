package pl.akademiakodu.springExample.model;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private String title;
    private String content;
    private String author;

    private static List<Post> posts = new ArrayList<>();

    public static List<Post> findAll() {
        return posts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Post() {
        posts.add(this);
    }

    public Post(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
        posts.add(this);
    }

    public String toString() {
        return getAuthor() + " " + getTitle() + " " + getContent();
    }
}


