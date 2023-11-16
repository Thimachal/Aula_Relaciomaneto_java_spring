package com.exemple1.exemple1.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employess")
public class Employee {
    private Long employeeId;
    private String employeeName;
}
