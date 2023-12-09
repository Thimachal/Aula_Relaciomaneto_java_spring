package com.exemple3.exemple3.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;
    private String courseName;
    @ManyToMany(mappedBy = "coursesList")//o mesmo nome da lista na entidade Students
    private List<Students> studentsList = new ArrayList<>();
}