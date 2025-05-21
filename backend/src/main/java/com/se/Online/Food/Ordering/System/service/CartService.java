package com.se.Online.Food.Ordering.System.service;

import com.se.Online.Food.Ordering.System.dto.request.AddCardItemRequest;
import com.se.Online.Food.Ordering.System.model.Cart;
import com.se.Online.Food.Ordering.System.model.CartItem;

public interface CartService {
    CartItem addItemToCart(AddCardItemRequest req, String jwt) throws Exception;

    CartItem updateCartItemQuantity(Long cartItemId, int quantity) throws Exception;

    Cart removeItemFromCart(Long cartItemId, String jwt) throws Exception;

    Long calculateCartTotals(Cart cart) throws Exception;

    Cart findCartById(Long id) throws Exception;

    Cart findCartByUserId(Long userId) throws Exception;

    Cart clearCart(Long userId) throws Exception;
}
