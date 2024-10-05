package com.resturantapp;

import com.resturantapp.model.Item;
import com.resturantapp.model.Restaurant;
import com.resturantapp.service.IRestaurantService;
import com.resturantapp.service.RestaurantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class OneToManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyMappingApplication.class, args);
	}

	@Autowired
    private IRestaurantService iRestaurantService;
	@Override
	public void run(String... args) throws Exception {
		Item item1 = new Item("Pizza","50","Sea food","Afro");
		Item item2 = new Item("Burger","10","Crap","Afro-China");
		Item item3 = new Item("Rice","30","Frog","Cameroon");
		List<Item> itemList = Arrays.asList(item1,item2,item3);
		Set<Item> items = new HashSet<>(itemList);

		Restaurant restaurant = new Restaurant("Food Resta","non-Veg","Berlin",items);
          iRestaurantService.addRestaurant(restaurant);
	}
}
