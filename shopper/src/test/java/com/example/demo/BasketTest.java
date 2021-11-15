package com.example.demo;

import com.example.demo.controller.Basket;
import com.example.demo.model.Item;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BasketTest {

    private static Basket basket;
    private static Item toy;

    @BeforeAll
    public static void setUp() {
        toy = new Item("toy", 39.99);
        basket = new Basket();
    }

    @Test
    public void add() {
        basket.add(toy);
        Map<Item, Integer> expected = createOrder(toy, 1);
        assertEquals(expected, basket.getOrder());
    }

    @Test
    void getOrder() {
        basket.add(toy);
        assertEquals(1, basket.getOrder());
    }

    @Test
    void remove() {
        Basket localBasket = new Basket();
        localBasket.add(toy);
        localBasket.remove(toy);
        assertEquals(localBasket.getOrder(), basket.getOrder());
    }

    private static Map<Item, Integer> createOrder(Object ... mapContent) {
        Map<Item, Integer> result = new HashMap<>();

        for (int index = 0; index < mapContent.length; index += 2) {
            Item item = (Item) mapContent[index];
            Integer quantity = (Integer) mapContent[index + 1];
            result.put(item, quantity);
        }

        return result;
    }
}
