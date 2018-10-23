package com.example.homework.annotations_hw.repositories;

import com.example.homework.annotations_hw.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
