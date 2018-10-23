package com.codeclan.homeworks.filesandfolders.repositories;

import com.codeclan.homeworks.filesandfolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
