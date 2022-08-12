package com.masai.service;

import org.springframework.stereotype.Service;

import com.masai.entity.FoodCart;
import com.masai.entity.Item;

@Service
public interface FoodCartService {
    public FoodCart addItemToCart(FoodCart cart, Item item);
    public FoodCart inceraseQuantity(FoodCart cart, Item item, int quantity);
    public FoodCart reduceQuantity(FoodCart cart, Item item, int quantity);
    public FoodCart removeItem(FoodCart cart, Item item);
    public FoodCart clearCart(FoodCart cart);
    
}
