package com.arashad.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arashad.main.entity.User;

public interface userRepository extends JpaRepository<User, Integer>{

}
