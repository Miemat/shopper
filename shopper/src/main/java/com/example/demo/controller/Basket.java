package com.example.demo.controller;


import com.example.demo.model.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Basket {

    private final Map<Item, Integer> order = new TreeMap<>();

    public void add(Item item){
        add(item, 1);
    }


    public void add(Item item, int quantity){
        if(quantity <+ 0){
            throw new IllegalArgumentException(String.format("Illegal quantity %d!", quantity));
        }
        if(order.containsKey(item)){
            quantity = order.get(item)+quantity;
        }
        order.put(item, quantity);
    }
}
