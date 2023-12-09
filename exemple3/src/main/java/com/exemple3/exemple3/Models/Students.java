package com.exemple3.exemple3.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "alunos")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String studentname;

    @ManyToMany
    private List<Courses> coursesList = new ArrayList<>();
}
