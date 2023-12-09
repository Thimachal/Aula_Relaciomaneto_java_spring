package com.exemple3.exemple3.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;
    private String courseName;
}