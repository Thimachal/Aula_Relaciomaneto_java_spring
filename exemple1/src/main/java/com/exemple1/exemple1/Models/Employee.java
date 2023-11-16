package com.exemple1.exemple1.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "employess")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String employeeName;
}
