package com.se.Online.Food.Ordering.System.controller;

import com.se.Online.Food.Ordering.System.model.Category;
import com.se.Online.Food.Ordering.System.model.User;
import com.se.Online.Food.Ordering.System.service.CategoryService;
import com.se.Online.Food.Ordering.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private UserService userService;

    @PostMapping("/admin/category")
    public ResponseEntity<Category> createCategory(@RequestHeader("Authorization") String jwt, @RequestBody Category category) throws Exception {

        User user = userService.findUserByJwtToken(jwt);
        Category createCategory = categoryService.createCategory(category.getName(), user.getId());

        return new ResponseEntity<>(createCategory, HttpStatus.CREATED);

    }

    @GetMapping("/category/restaurant")
    public ResponseEntity<List<Category>> getRestaurantCategory(@RequestHeader("Authorization") String jwt) throws Exception {

        User user = userService.findUserByJwtToken(jwt);
        List<Category> Categories = categoryService.findCategoryByRestaurantId(user.getId());

        return new ResponseEntity<>(Categories, HttpStatus.OK);

    }
}
