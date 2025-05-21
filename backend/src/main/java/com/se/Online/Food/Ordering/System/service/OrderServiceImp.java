package com.se.Online.Food.Ordering.System.service;

import com.se.Online.Food.Ordering.System.dto.request.OrderRequest;
import com.se.Online.Food.Ordering.System.model.Order;
import com.se.Online.Food.Ordering.System.model.User;
import com.se.Online.Food.Ordering.System.repository.AddressRepository;
import com.se.Online.Food.Ordering.System.repository.OrderItemRepository;
import com.se.Online.Food.Ordering.System.repository.OrderRepository;
import com.se.Online.Food.Ordering.System.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private CartService cartService;

    @Override
    public Order createOrder(OrderRequest order, User user) throws Exception {
        return null;
    }

    @Override
    public Order updateOrder(Long orderId, String orderStatus) throws Exception {
        return null;
    }

    @Override
    public void cancelOrder(Long orderId) throws Exception {

    }

    @Override
    public List<Order> getUsersOrder(Long userId) throws Exception {
        return List.of();
    }

    @Override
    public List<Order> getRestaurantOrder(Long restaurantId, String orderStatus) throws Exception {
        return List.of();
    }

    @Override
    public Order findOrderById(Long orderId) throws Exception {
        return null;
    }
}
