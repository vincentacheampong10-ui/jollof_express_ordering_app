package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class JollofMeal extends Meal {
    private String type;
    private double basePrice;
    private String size;
    private double sizeMultiplier;
    private String riceType;
    private double riceCost;
    private String protein;
    private double proteinCost;
    private List<AddOn> addOns = new ArrayList<>();

    public JollofMeal(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}


