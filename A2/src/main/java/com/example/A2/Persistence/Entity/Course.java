package com.example.A2.Persistence.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "course12")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_id_course_seq")
    @SequenceGenerator(name="course_id_course_seq", sequenceName = "course_id_course_seq", allocationSize=1)
    public Integer id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "teacher")
    @NotNull
    private Teacher teacher;

    public Integer getIdCourse() {
        return id;
    }

    public void setIdCourse(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() { return teacher; }

    public void setTeacher(Teacher teacher) {this.teacher = teacher;}


    @Override
    public String toString() {
        return "course[" + id + "] " + name + " ---> " + teacher;
    }

}
