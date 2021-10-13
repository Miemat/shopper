package com.example.demo.model;

import java.util.Objects;

public class Item implements Comparable<Item>{

    private Double price;
    private String name;

    public Item(String item, double v) {
        this.name = item;
        this.price = v;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || ! (otherObject instanceof Item)) {
            return false;
        }

        Item item = (Item) otherObject;

        if (Double.compare(item.price, price) != 0) {
            return false;
        }
        return name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode();
    }

    @Override
    public int compareTo(Item other) {
        if (other == null) {
            return 1;
        }
        int comparision = this.getName().compareTo(other.getName());
        if (comparision != 0) {
            return comparision;
        }
        return Double.compare(this.getPrice(), other.getPrice());
    }
}
