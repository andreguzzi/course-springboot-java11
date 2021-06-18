package com.andrespring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrespring.course.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
