package com.example.A2.Persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "grades")
public class Grades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idStudent;

    @Column
    public String nameStudent;

    @Column
    public String nameCourse;

    @Column
    public Integer grades;

    public Integer getId_student() {
        return idStudent;
    }

    public void setId_student(Integer id_student) {
        this.idStudent = id_student;
    }

    public String getName_student() {
        return nameStudent;
    }

    public void setName_student(String name_student) {
        this.nameCourse = name_student;
    }

    public String getName_course() {
        return nameCourse;
    }

    public void setName_course(String name_course) {
        this.nameCourse = name_course;
    }

    public Integer getGrades() {
        return grades;
    }

    public void setGrades(Integer grades) {
        this.grades = grades;
    }
}
