package com.example.A2.Persistence.Entity;

import javax.persistence.*;


@Entity
@Table(name = "course")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCourse;

    @Column
    private String name;

    @Column
    private Integer idTeacher;

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer id) {
        this.idCourse = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Course{" +
                "id=" + idCourse +
                ", name='" + name + '\'' +
                ", idTeacher=" + idTeacher +
                '}';
    }
}
