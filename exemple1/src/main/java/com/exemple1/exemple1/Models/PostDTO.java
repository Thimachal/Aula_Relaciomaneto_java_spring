package com.exemple1.exemple1.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PostDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postIdDTO;

    public PostDTO() {
    }

    public PostDTO(Long postIdDTO) {
        this.postIdDTO = postIdDTO;
    }

    public Long getPostIdDTO() {
        return postIdDTO;
    }

    public void setPostIdDTO(Long postIdDTO) {
        this.postIdDTO = postIdDTO;
    }
}
