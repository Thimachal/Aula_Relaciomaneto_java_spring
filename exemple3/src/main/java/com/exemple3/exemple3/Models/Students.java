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
    @JoinTable(name = "students_x_courses",
               joinColumns = {@JoinColumn(name = "student_Id", referencedColumnName = "studentId")},
            inverseJoinColumns = {@JoinColumn(name = "course_Id", referencedColumnName = "courseId")}
    )
    private List<Courses> coursesList = new ArrayList<>();

    public Students() {
    }

    public Students(Long studentId, String studentname, List<Courses> coursesList) {
        this.studentId = studentId;
        this.studentname = studentname;
        this.coursesList = coursesList;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }
}
