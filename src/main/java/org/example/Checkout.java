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
    public static double totalWithOffers(List<String> items) {
        if (items == null) throw new IllegalArgumentException("items cannot be null");

        int apples = 0, oranges = 0;

        for (String s : items) {
            if (s == null) continue;
            String n = s.trim().toLowerCase();
            if (n.equals("apple")) apples++;
            else if (n.equals("orange")) oranges++;
            else throw new IllegalArgumentException("Unknown item: " + s);
        }

        // Apples: Buy One Get One Free
        int applesToPay = (apples + 1) / 2;
        double appleTotal = applesToPay * APPLE_PRICE;

        // Oranges: 3 for the price of 2
        int orangeTriples = oranges / 3;
        int orangeRemainder = oranges % 3;
        double orangeTotal = orangeTriples * 2 * ORANGE_PRICE + orangeRemainder * ORANGE_PRICE;

        return appleTotal + orangeTotal;
    }

}
