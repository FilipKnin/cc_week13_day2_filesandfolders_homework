package com.codeclan.homeworks.filesandfolders.repositories;

import com.codeclan.homeworks.filesandfolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
