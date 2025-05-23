package com.se.Online.Food.Ordering.System.controller;

import com.se.Online.Food.Ordering.System.model.Food;
import com.se.Online.Food.Ordering.System.model.User;
import com.se.Online.Food.Ordering.System.service.FoodService;
import com.se.Online.Food.Ordering.System.service.RestaurantService;
import com.se.Online.Food.Ordering.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @Autowired
    private UserService userService;

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/search")
    public ResponseEntity<List<Food>> searchFood(@RequestParam String name, @RequestHeader("Authorization") String jwt) throws Exception {

        User user = userService.findUserByJwtToken(jwt);
        List<Food> foods = foodService.searchFood(name);

        return new ResponseEntity<>(foods, HttpStatus.OK);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public ResponseEntity<List<Food>> getRestaurantFood(@RequestParam boolean vegetarian, @RequestParam boolean seasional, @RequestParam boolean nonveg, @RequestParam(required = false) String food_category, @PathVariable Long restaurantId, @RequestHeader("Authorization") String jwt) throws Exception {

        User user = userService.findUserByJwtToken(jwt);
        List<Food> foods = foodService.getRestaurantsFood(restaurantId, vegetarian, nonveg, seasional, food_category);

        return new ResponseEntity<>(foods, HttpStatus.OK);
    }
}
