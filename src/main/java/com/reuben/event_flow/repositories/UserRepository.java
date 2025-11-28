package com.reuben.event_flow.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reuben.event_flow.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByEmail(String email);
}
