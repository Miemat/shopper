package com.example.demo;

import com.example.demo.controller.Basket;
import com.example.demo.model.Item;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    private static final Map<Item, Integer> order = new TreeMap<>();
    
    @BeforeAll
    public static void Init(){
        order.put(new Item("item1", 123), 1);
    }

    @Test
    public void twoBasketShouldBeEqual(){
        assertEquals("test", "test");
    }
}
