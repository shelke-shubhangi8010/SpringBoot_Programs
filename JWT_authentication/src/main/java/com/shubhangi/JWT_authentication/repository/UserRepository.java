package com.shubhangi.JWT_authentication.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.shubhangi.JWT_authentication.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
