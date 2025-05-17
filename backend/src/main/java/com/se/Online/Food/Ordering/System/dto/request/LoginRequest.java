package com.se.Online.Food.Ordering.System.dto.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
