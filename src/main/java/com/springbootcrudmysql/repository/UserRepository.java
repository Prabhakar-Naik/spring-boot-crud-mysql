package com.springbootcrudmysql.repository;

import com.springbootcrudmysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
