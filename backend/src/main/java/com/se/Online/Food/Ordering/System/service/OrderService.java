package com.se.Online.Food.Ordering.System.service;

import com.se.Online.Food.Ordering.System.dto.request.OrderRequest;
import com.se.Online.Food.Ordering.System.model.Order;
import com.se.Online.Food.Ordering.System.model.User;

import java.util.List;

public interface OrderService {
    Order createOrder(OrderRequest order, User user) throws Exception;

    Order updateOrder(Long orderId, String orderStatus) throws Exception;

    void cancelOrder(Long orderId) throws Exception;

    List<Order> getUsersOrder(Long userId) throws Exception;

    List<Order> getRestaurantOrder(Long restaurantId, String orderStatus) throws Exception;

    Order findOrderById(Long orderId) throws Exception;
}
