package com.exemple1.exemple1.Models;

import jakarta.persistence.*;

public class EmployeeDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeIDDTO;
    private String employeeNameDTO;

    private Post postDTO;

    public EmployeeDTO() {
    }
    public EmployeeDTO(Employee obj) {
        this.employeeIDDTO = obj.getEmployeeId();
        this.employeeNameDTO = obj.getEmployeeName();
        this.postDTO = obj.getPost();
    }

    public Long getEmployeeIDDTO() {
        return employeeIDDTO;
    }

    public void setEmployeeIDDTO(Long employeeIDDTO) {
        this.employeeIDDTO = employeeIDDTO;
    }

    public String getEmployeeNameDTO() {
        return employeeNameDTO;
    }

    public void setEmployeeNameDTO(String employeeNameDTO) {
        this.employeeNameDTO = employeeNameDTO;
    }

    public Post getPostDTO() {
        return postDTO;
    }

    public void setPostDTO(Post postDTO) {
        this.postDTO = postDTO;
    }
}
