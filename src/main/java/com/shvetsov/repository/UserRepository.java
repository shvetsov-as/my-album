package com.shvetsov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shvetsov.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

    Optional<User> findUserById (Long id);
    Optional<User> findUserByUserName (String username);
    Optional<User> findUserByEmail (String email);
}
