package com.example.A2.Persistence.Repo;

import com.example.A2.Persistence.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer>{

    public List<Course> findAllByTeacherId(Integer id);
}
