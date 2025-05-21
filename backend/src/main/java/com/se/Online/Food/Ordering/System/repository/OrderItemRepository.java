package com.se.Online.Food.Ordering.System.repository;

import com.se.Online.Food.Ordering.System.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
