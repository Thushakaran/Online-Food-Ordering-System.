package com.se.Online.Food.Ordering.System.dto.response;

import com.se.Online.Food.Ordering.System.model.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private String message;
    private USER_ROLE role;
}
