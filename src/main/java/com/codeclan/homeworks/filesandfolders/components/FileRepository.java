package com.codeclan.homeworks.filesandfolders.components;

import com.codeclan.homeworks.filesandfolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository  extends JpaRepository<File, Long> {
}
