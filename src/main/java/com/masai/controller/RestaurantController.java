package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Restaurant;
import com.masai.service.RestaurantService;

@RestController
@RequestMapping("/restaurents")
public class RestaurantController {

	@Autowired
	private RestaurantService rService;
	
	@PostMapping("/")
	public Restaurant addRestaurantHandler(@RequestBody Restaurant restaurant) {
		return rService.addRestaurant(restaurant);
	}
	
	@GetMapping("/{id}")
	public Restaurant viewRestaurant(@PathVariable("id") Integer id) {
		return rService.viewRestaurant(id);
	}
	
}
