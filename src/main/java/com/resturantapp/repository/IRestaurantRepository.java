package com.resturantapp.repository;

import com.resturantapp.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantRepository extends JpaRepository<Restaurant,Integer> {
}
