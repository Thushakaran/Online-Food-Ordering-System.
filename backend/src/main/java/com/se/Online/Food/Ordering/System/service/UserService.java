package com.se.Online.Food.Ordering.System.service;

import com.se.Online.Food.Ordering.System.model.User;

public interface UserService {
    User findUserByJwtToken(String jwt) throws Exception;

    User findUserByEmail(String email) throws Exception;
}
