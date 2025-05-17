package com.se.Online.Food.Ordering.System.repository;

import com.se.Online.Food.Ordering.System.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Cart findByCustomerId(Long userId);
}
