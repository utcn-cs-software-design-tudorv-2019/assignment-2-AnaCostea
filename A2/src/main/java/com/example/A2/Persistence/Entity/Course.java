package com.example.A2.Persistence.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCourse;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "teacher")
    @NotNull
    private Teacher teacher;

   /* @ManyToOne
    @JoinColumn(name = "student")
    @NotNull
    private Student student;*/

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

    public Teacher getTeacher() { return teacher; }

    public void setTeacher(Teacher teacher) {this.teacher = teacher;}

  /*  public Student getStudent() { return student; }

    public void setStudent(Student student) {this.student = student;} */


    @Override
    public String toString() {
        return "course[" + idCourse + "] " + name + " ---> " + teacher;
    }

}
