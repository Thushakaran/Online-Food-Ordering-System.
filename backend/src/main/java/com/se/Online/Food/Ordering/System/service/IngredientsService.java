package com.se.Online.Food.Ordering.System.service;

import com.se.Online.Food.Ordering.System.model.IngredientCategory;
import com.se.Online.Food.Ordering.System.model.IngredientsItems;

import java.util.List;

public interface IngredientsService {
    IngredientCategory createiIngredientCategory(String name, Long restaurantId) throws Exception;

    IngredientCategory findIngredientCategoryById(Long id) throws Exception;

    List<IngredientCategory> findIngredientCategoriesByRestaurantId(Long Id) throws Exception;

    IngredientsItems createIngredientsItems(Long restaurantId, String ingredientName, Long categoryId) throws Exception;

    List<IngredientsItems> findRestaurantIngredients(Long restaurantId);

    IngredientsItems updateStock(Long Id) throws Exception;
}
