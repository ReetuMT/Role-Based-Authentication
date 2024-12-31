package com.role.implementation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.role.implementation.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
