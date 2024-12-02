package com.tap.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tap.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
