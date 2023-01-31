package com.example.files_and_folders.files_and_folders.repositories;

import com.example.files_and_folders.files_and_folders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
