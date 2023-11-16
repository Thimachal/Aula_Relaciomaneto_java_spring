package com.exemple1.exemple1.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private String namePost;
    private Double salaryPost;

    public  Post(){

    }
    public Post(Long postId, String namePost, Double salaryPost) {
        this.postId = postId;
        this.namePost = namePost;
        this.salaryPost = salaryPost;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public Double getSalaryPost() {
        return salaryPost;
    }

    public void setSalaryPost(Double salaryPost) {
        this.salaryPost = salaryPost;
    }
}
