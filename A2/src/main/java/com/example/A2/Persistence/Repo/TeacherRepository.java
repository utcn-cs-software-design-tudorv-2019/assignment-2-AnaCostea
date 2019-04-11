package com.example.A2.Persistence.Repo;

import com.example.A2.Persistence.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}