package com.example.demo.controller;


import com.example.demo.model.Item;

import java.util.Map;
import java.util.TreeMap;

public class Basket {

    private final Map<Item, Integer> order = new TreeMap<>();

    public void add(Item item){
        add(item, 1);
    }

    public void add(Item item, int quantity){
        if(quantity < 0){
            throw new IllegalArgumentException(String.format("Illegal quantity %d!", quantity));
        }
        if(order.containsKey(item)){
            quantity = order.get(item)+quantity;
        }
        order.put(item, quantity);
    }

    public void remove(Item item){
        if(item == null){
            throw new NullPointerException(String.format("Item is null"));
        }

        if(!order.isEmpty()) {
            order.remove(item);
        }else{
            throw new IllegalArgumentException(String.format("List of orders is empty"));
        }
    }

    public boolean orderIsEmpty(){
        if(order.isEmpty()){
            return true;
        }
        return false;
    }

    public Map<Item, Integer> getOrder() {
        return order;
    }


}
