package com.andrespring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrespring.course.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{

}
