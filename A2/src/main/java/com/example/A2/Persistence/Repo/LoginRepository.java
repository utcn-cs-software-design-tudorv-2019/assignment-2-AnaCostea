package com.example.A2.Persistence.Repo;

import com.example.A2.Persistence.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Integer> {
}
