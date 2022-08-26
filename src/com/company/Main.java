package com.company;

import Restaurant.MenuItem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<MenuItem> menu = new ArrayList<>();

        MenuItem corndog = new MenuItem("Corndog", "A hotdog in a corn meal wrapping, on a stick",
                2.99, "appetizer", true);
        MenuItem hamburger = new MenuItem("Hamburger", "A burger, on a bun", 7.99,
                "main course", true);

        MenuItem spaghetti = new MenuItem("Spaghetti", "pasta and stuff", 4.99,
                "main course", false);

        MenuItem cake = new MenuItem("Chocolate Cake", "A chocolate fudge cake with buttercream icing",
                3.99, "dessert", false);
        
        menu.add(corndog);
        menu.add(hamburger);
        menu.add(spaghetti);
        menu.add(cake);

        System.out.println(menu.get(0).getItemName());
    }
}
