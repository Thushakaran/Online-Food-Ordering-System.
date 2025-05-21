package com.se.Online.Food.Ordering.System.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class AddCardItemRequest {
    private Long foodId;
    private int quantity;
    private List<String> ingredients;
}
