package com.app.Akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Akash.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
