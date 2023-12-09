package com.exemple3.exemple3.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String studentname;
}
