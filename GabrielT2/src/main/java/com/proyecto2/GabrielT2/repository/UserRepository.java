package com.proyecto2.GabrielT2.repository;

import com.proyecto2.GabrielT2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
