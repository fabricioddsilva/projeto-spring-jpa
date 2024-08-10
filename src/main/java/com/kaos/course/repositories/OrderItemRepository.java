package com.kaos.course.repositories;

import com.kaos.course.entities.OrderItem;
import com.kaos.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
