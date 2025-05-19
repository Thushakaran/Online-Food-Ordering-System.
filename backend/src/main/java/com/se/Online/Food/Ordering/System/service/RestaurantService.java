package com.se.Online.Food.Ordering.System.service;

import com.se.Online.Food.Ordering.System.dto.RestaurantDto;
import com.se.Online.Food.Ordering.System.dto.request.CreateRestaurantRequest;
import com.se.Online.Food.Ordering.System.model.Restaurant;
import com.se.Online.Food.Ordering.System.model.User;

import java.util.List;

public interface RestaurantService {
    Restaurant createRestaurant(CreateRestaurantRequest req, User user);

    Restaurant updateRestaurant(Long restaurantId, CreateRestaurantRequest updateRestaurantRequest) throws Exception;

    void deleteRestaurant(Long restaurantId) throws Exception;

    List<Restaurant> getAllRestaurant();

    List<Restaurant> searchRestaurant(String keyword);

    Restaurant findRestaurantById(Long restaurantId) throws Exception;

    Restaurant findRestaurantByUserId(Long userId) throws Exception;

    RestaurantDto addToFavorites(Long restaurantId, User user) throws Exception;

    Restaurant updateRestaurantStatus(Long id) throws Exception;

}
