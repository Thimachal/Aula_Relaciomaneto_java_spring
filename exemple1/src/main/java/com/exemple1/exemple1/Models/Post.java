package com.exemple1.exemple1.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;
    private String postName;
    private Double postSalary;

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Employee> employee;

        public  Post(){

    }
    public Post(Long postId, String postName, Double postSalary) {
        this.postId = postId;
        this.postName = postName;
        this.postSalary = postSalary;
    }


    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public Double getPostSalary() {
        return postSalary;
    }

    public void setPostSalary(Double postSalary) {
        this.postSalary = postSalary;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
