package com.se.Online.Food.Ordering.System.dto.request;

import com.se.Online.Food.Ordering.System.model.Address;
import com.se.Online.Food.Ordering.System.model.ContactInformation;
import lombok.Data;

import java.util.List;

@Data
public class CreateRestaurantRequest {
    private Long id;
    private String name;
    private String description;
    private String cuisineType;
    private Address address;
    private ContactInformation contactInformation;
    private String openingHours;
    private List<String> images;
}
