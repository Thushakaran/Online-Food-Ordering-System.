package com.se.Online.Food.Ordering.System.repository;

import com.se.Online.Food.Ordering.System.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    @Query("SELECT r from Restaurant r where lower(r.name) like lower(concat('%',:query,'%')) or lower(r.cuisineType) like lower(concat('%',:query,'%') ) ")
    List<Restaurant> findBySearchQuery(String query);

    Restaurant findByOwnerId(Long userId);

    Optional<Restaurant> findById(Long restaurantId);
}
