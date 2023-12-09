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

    public Courses() {
    }

    public Courses(Long courseId, String courseName, List<Students> studentsList) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.studentsList = studentsList;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }
}