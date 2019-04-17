package com.example.A2.Persistence.Repo;

import com.example.A2.Persistence.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    //public List<Student> findAllByStudentId(Integer id);
}
