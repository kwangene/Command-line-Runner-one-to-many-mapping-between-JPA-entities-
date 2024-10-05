package com.resturantapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int itemId;

    private  String itemName;
    private  String price;
    private  String cuisine;
    private  String category;

    public Item() {
    }

    public Item(String itemName, String price, String cuisine, String category) {
        this.itemName = itemName;
        this.price = price;
        this.cuisine = cuisine;
        this.category = category;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getPrice() {
        return price;
    }

    public String getCuisine() {
        return cuisine;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", price='" + price + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
