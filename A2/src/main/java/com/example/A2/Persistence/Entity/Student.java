package com.example.A2.Persistence.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.FetchType;

import java.util.List;

@Entity
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStudent;

    @Column
    private String name;

    @Column
    private int group;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private List<Course> courses;

    @Column
    private int grades;


    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer id) {
        this.idStudent = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }


    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }


    @Override
    public String toString() {
        return "student[" + idStudent + "] " + name + " " ;
    }


}
