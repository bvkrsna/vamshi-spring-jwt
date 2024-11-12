package com.springsecurity.demo.repo;

import com.springsecurity.demo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUserName(String username);
}
