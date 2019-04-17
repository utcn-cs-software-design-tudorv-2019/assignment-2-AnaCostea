package com.example.A2.Persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column
    private String studentName;

    @Column
    private Integer studentGroup;

    @Column
    private String courseName;

    @Column
    private Integer studentGrades;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public Integer getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(Integer group) {
        this.studentGroup = group;
    }

    public String getCourseName() { return courseName;}

    public void setCourseName(String courseName) {this.courseName = courseName;}

    public Integer getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(Integer grades) {
        this.studentGrades = grades;
    }



    @Override
    public String toString() {
        return "student[" + id + "] " + studentName + " " ;
    }


}
