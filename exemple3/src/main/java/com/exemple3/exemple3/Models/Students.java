package com.exemple3.exemple3.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String studentname;

    @ManyToMany
    @JoinTable(name = "tabela_auxiliar",
               joinColumns = {@JoinColumn(name = "student_Id", referencedColumnName = "studentId")},
            inverseJoinColumns = {@JoinColumn(name = "course_Id", referencedColumnName = "courseId")}
    )
    private List<Courses> coursesList = new ArrayList<>();
}
