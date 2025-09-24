package org.example;

import java.util.List;

public class Checkout {
    public static final double APPLE_PRICE = 0.60;   // £0.60
    public static final double ORANGE_PRICE = 0.25;  // £0.25

    public static double total(List<String> items) {
        if (items == null) throw new IllegalArgumentException("items cannot be null");

        int apples = 0, oranges = 0;

        for (String s : items) {
            if (s == null) continue;
            String n = s.trim().toLowerCase();
            if (n.equals("apple")) apples++;
            else if (n.equals("orange")) oranges++;
            else throw new IllegalArgumentException("Unknown item: " + s);
        }

        return apples * APPLE_PRICE + oranges * ORANGE_PRICE;
    }

}
