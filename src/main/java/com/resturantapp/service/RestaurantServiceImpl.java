package com.resturantapp.service;

import com.resturantapp.model.Restaurant;
import com.resturantapp.repository.IRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class RestaurantServiceImpl implements IRestaurantService{
    @Autowired
    private IRestaurantRepository iRestaurantRepository;
    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
     return iRestaurantRepository.save(restaurant);
    }

    @Override
    public void updateRestaurant(Restaurant restaurant) {
           iRestaurantRepository.save(restaurant);
    }

    @Override
    public void deleteRestaurant(int restaurantId) {
          iRestaurantRepository.deleteById(restaurantId);
    }

    @Override
    public List<Restaurant> getAll() {
        return iRestaurantRepository.findAll();
    }

    @Override
    public Restaurant getById(int restaurantId) {
        return iRestaurantRepository.findById(restaurantId)
                .orElseThrow(()->new RuntimeException("Id not found: "));
    }

    @Override
    public List<Restaurant> getByCity(String city) {
        return List.of();
    }

    @Override
    public List<Restaurant> getByType(String type) {
        return List.of();
    }

    @Override
    public List<Restaurant> getByItemName(String itemName) {
        return List.of();
    }

    @Override
    public List<Restaurant> getByCuisine(String cuisine) {
        return List.of();
    }
}
