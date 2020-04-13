package com.ulfix.prueba_ulfix.models;

import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Authors {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String user_name;
    @Column
    private String email;
    @Column
    private String authorscol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthorscol() {
        return authorscol;
    }

    public void setAuthorscol(String authorscol) {
        this.authorscol = authorscol;
    }
}
