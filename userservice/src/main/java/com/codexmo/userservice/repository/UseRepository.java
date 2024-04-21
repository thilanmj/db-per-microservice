package com.codexmo.userservice.repository;

import com.codexmo.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UseRepository extends JpaRepository<User,Long> {
}
