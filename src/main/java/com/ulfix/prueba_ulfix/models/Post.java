package com.ulfix.prueba_ulfix.models;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private int likes;
    @Column
    private int authors_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getAuthors_id() {
        return authors_id;
    }

    public void setAuthors_id(int authors_id) {
        this.authors_id = authors_id;
    }
}
