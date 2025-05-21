package com.se.Online.Food.Ordering.System.repository;

import com.se.Online.Food.Ordering.System.model.IngredientsItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientItemsRepository extends JpaRepository<IngredientsItems, Long> {
    List<IngredientsItems> findByRestaurantId(Long id);
}
