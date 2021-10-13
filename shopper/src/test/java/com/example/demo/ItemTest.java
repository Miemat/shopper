package com.example.demo;

import com.example.demo.model.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ItemTest {

    @Test
    public void twoItemsWIthTheSamePriceAndNameShouldBeEqual() {
        assertEquals(new Item("item", 123.12), new Item("item", 123.12));
    }

    @Test
    public void itemsWIthDifferentNamesArentEqual() {
        assertNotEquals(new Item("item1", 123.12), new Item("item2", 123.12));
    }

    @Test
    public void itemsWIthDiffereePriceArentEqual() {
        assertNotEquals(new Item("item", 123.12), new Item("item", 321.12));
    }

    @Test
    public void itemsWithTheSameNameShouldHaveTheSameHashCode() {
        assertEquals(new Item("item", 123).hashCode(), new Item("item", 321).hashCode());
    }

    @Test
    public void itemsWithDifferentNameShouldHaveDifferentHashCode() {
        assertNotEquals(new Item("item1", 123).hashCode(), new Item("item2", 321).hashCode());
    }

    @Test
    public void itemsWithDifferentPriceAndTheSameNameShouldBeOrdered() {
        assertEquals(-1, new Item("item1", 0.1).compareTo(new Item("item1", 0.2)));
    }
}
