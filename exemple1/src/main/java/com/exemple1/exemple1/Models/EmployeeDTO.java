package com.exemple1.exemple1.Models;

import jakarta.persistence.*;

public class EmployeeDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeIDDTO;
    private String employeeNameDTO;
    private PostDTO postDTO;

    public EmployeeDTO() {
    }
    public EmployeeDTO(Employee obj, PostDTO obj2) {
        this.employeeIDDTO = obj.getEmployeeId();
        this.employeeNameDTO = obj.getEmployeeName();
        this.postDTO = obj2;
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


}
