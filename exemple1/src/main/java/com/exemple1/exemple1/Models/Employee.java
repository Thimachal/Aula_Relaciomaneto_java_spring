package com.exemple1.exemple1.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "employess")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String employeeName;

    @OneToOne
    @JoinColumn(name = "post_id",referencedColumnName = "postId")
    private Post post;

    public Employee(){

    }
    public Employee(Long employeeId, String employeeName, Post post) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.post = post;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }


}
