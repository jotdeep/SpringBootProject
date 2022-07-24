package com.project.first.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.project.first.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
