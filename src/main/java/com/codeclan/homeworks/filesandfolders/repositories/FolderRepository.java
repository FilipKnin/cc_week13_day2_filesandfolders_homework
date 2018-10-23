package com.codeclan.homeworks.filesandfolders.repositories;

import models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
