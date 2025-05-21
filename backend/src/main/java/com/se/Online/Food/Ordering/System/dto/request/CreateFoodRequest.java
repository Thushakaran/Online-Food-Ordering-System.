package com.se.Online.Food.Ordering.System.dto.request;

import com.se.Online.Food.Ordering.System.model.Category;
import com.se.Online.Food.Ordering.System.model.IngredientsItems;
import lombok.Data;

import java.util.List;

@Data
public class CreateFoodRequest {
    private String name;
    private String description;
    private Long price;

    private Category category;
    private List<String> images;

    private Long restaurantId;
    private boolean vegetarian;
    private boolean seasonal;
    private List<IngredientsItems> ingredients;
}
