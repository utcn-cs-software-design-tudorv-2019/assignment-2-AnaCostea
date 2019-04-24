package com.example.A2.Persistence.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teacher12")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_id_seq")
    @SequenceGenerator(name="teacher_id_seq", sequenceName = "teacher_id_seq", allocationSize=1)
    @Column(name = "id", nullable = false)
    public Integer idTeacher;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @OneToMany(mappedBy = "teacher", fetch = FetchType.EAGER)
    private List<Course> courses;

    public Teacher(){
        this.idTeacher = 0;
    }

    public Integer getId() {
        return idTeacher;
    }

    public void setId(Integer id) {
        this.idTeacher = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    @Override
    public String toString() {
        return "teacher[" + idTeacher + "] " + firstName + " " + lastName;
    }


}
