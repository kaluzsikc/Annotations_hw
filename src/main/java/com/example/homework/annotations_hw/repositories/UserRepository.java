package com.example.homework.annotations_hw.repositories;

import com.example.homework.annotations_hw.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
