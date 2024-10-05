package com.resturantapp.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int restaurantId;
    private String restaurantName;
    private String type;//weather it's a veg or non veg
    private String city;
    @OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name="Item_Id")
    Set<Item> items  = new HashSet<>();


    public Restaurant() {
    }

    public Restaurant(String restaurantName, String type, String city, Set<Item> items) {
        this.restaurantName = restaurantName;
        this.type = type;
        this.city = city;
        this.items = items;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getType() {
        return type;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + restaurantId +
                ", restaurantName='" + restaurantName + '\'' +
                ", type='" + type + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
