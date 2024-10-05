package com.resturantapp.service;

import com.resturantapp.model.Restaurant;

import java.util.List;

public interface IRestaurantService {
  // In build methods

    Restaurant addRestaurant(Restaurant restaurant);
    void updateRestaurant(Restaurant restaurant);
    void  deleteRestaurant(int RestaurantId);
    List<Restaurant> getAll();
     Restaurant getById(int restaurantId);

      // derived query
       List<Restaurant>  getByCity(String city);
       List<Restaurant>  getByType(String  type);

     //Custom queries
     List<Restaurant>  getByItemName(String itemName);
    List<Restaurant>  getByCuisine(String cuisine);



}
