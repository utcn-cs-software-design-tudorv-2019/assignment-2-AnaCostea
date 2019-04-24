package com.example.A2.Persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "grades")
public class Grades {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grades_id_seq")
    @SequenceGenerator(name="grades_id_seq", sequenceName = "grades_id_seq", allocationSize=1)
    @Column(name = "id_grade", nullable = false)
    public Integer idGrades;

    @Column
    public String nameStudent;

    @Column
    public String nameCourse;

    @Column
    public Integer grades;

    public Grades(){}

    public Grades(String nameStudent, String nameCourse, Integer grades) {
        this.nameStudent = nameStudent;
        this.nameCourse = nameCourse;
        this.grades = grades;
    }

    public Integer getIdGrades() {
        return idGrades;
    }

    public void setIdGrades(Integer idGrades) {
        this.idGrades = idGrades;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public Integer getGrades() {
        return grades;
    }

    public void setGrades(Integer grades) {
        this.grades = grades;
    }
}
