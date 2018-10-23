package com.example.homework.annotations_hw.repositories;

import com.example.homework.annotations_hw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
