package com.dailycodework.sbend2endapplication.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Sampson Alfred
 */

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}