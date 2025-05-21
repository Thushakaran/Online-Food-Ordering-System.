package com.se.Online.Food.Ordering.System.repository;

import com.se.Online.Food.Ordering.System.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
