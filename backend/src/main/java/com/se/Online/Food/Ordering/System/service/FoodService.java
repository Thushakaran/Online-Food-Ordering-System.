package com.se.Online.Food.Ordering.System.service;

import com.se.Online.Food.Ordering.System.dto.request.CreateFoodRequest;
import com.se.Online.Food.Ordering.System.model.Category;
import com.se.Online.Food.Ordering.System.model.Food;
import com.se.Online.Food.Ordering.System.model.Restaurant;

import java.util.List;

public interface FoodService {
    Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId) throws Exception;

    List<Food> getRestaurantsFood(Long restaurantId, boolean isVegetarian, boolean isNonVeg, boolean isSeasonal, String foodCategory);

    List<Food> searchFood(String keyword);

    Food findFoodByID(Long foodId) throws Exception;

    Food updateAvailabilityStatus(Long foodId) throws Exception;
}
