package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.entity.Restaurant;

@Service
public interface RestaurantService {
	
	public Restaurant addRestaurant(Restaurant res);
	public Restaurant updateRestaurant(Integer id,Restaurant res);
	public String removeRestaurant(Integer id);
	public Restaurant viewRestaurant (Integer id);
//	public Restaurant viewBearByRestaurant (List<Restaurant> location);
	public List<Restaurant> viewRestaurantByItemName (String name);
}
