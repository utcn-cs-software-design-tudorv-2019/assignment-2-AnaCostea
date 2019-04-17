package com.example.A2.Persistence.Repo;

import com.example.A2.Persistence.Entity.Grades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradesRepository extends JpaRepository<Grades, Integer> {
}
