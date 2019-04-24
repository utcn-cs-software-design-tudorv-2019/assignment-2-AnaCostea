package com.example.A2.Persistence.Repo;

import com.example.A2.Persistence.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

    public List<Course> findAllByTeacherFirstName(String firstName);
}

