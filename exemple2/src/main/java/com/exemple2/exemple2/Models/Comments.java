package com.exemple2.exemple2.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "comentários")

public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commentID;
    private String commentAutor;
    private String commentText;

    public Comments() {
    }

    public Comments(Long commentID, String commentAutor, String commentText) {
        this.commentID = commentID;
        this.commentAutor = commentAutor;
        this.commentText = commentText;
    }

    public Long getCommentID() {
        return commentID;
    }

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
    }

    public String getCommentAutor() {
        return commentAutor;
    }

    public void setCommentAutor(String commentAutor) {
        this.commentAutor = commentAutor;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
}
