package com.se.Online.Food.Ordering.System.repository;

import com.se.Online.Food.Ordering.System.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomerId(Long userId);

    List<Order> findByRestaurantId(Long restaurantId);
}
