package com.se.Online.Food.Ordering.System.repository;

import com.se.Online.Food.Ordering.System.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByRestaurantId(Long id);
}
