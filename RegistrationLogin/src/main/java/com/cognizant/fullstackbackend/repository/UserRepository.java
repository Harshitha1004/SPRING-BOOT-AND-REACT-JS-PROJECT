package com.cognizant.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
