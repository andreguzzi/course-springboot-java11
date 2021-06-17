package com.andrespring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrespring.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
