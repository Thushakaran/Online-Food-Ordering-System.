package com.se.Online.Food.Ordering.System.service;

import com.se.Online.Food.Ordering.System.model.IngredientCategory;
import com.se.Online.Food.Ordering.System.model.IngredientsItems;
import com.se.Online.Food.Ordering.System.repository.IngredientCategoryRepository;
import com.se.Online.Food.Ordering.System.repository.IngredientItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientsServiceImp implements IngredientsService {
    @Autowired
    private IngredientItemsRepository ingredientItemsRepository;

    @Autowired
    private IngredientCategoryRepository ingredientCategoryRepository;

    @Autowired
    private RestaurantService restaurantService;

    @Override
    public IngredientCategory createiIngredientCategory(String name, Long restaurantId) throws Exception {
        return null;
    }

    @Override
    public IngredientCategory findIngredientCategoryById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<IngredientCategory> findIngredientCategoriesByRestaurantId(Long Id) throws Exception {
        return List.of();
    }

    @Override
    public IngredientsItems createIngredientsItems(Long restaurantId, String ingredientName, Long categoryId) throws Exception {
        return null;
    }

    @Override
    public List<IngredientsItems> findRestaurantIngredients(Long restaurantId) {
        return List.of();
    }

    @Override
    public IngredientsItems updateStock(Long Id) throws Exception {
        return null;
    }
}
