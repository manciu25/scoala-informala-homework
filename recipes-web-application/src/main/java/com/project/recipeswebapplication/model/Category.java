package com.project.recipeswebapplication.model;

/**
 * Enumeration of recipes categories
 */

public enum Category {

    SOUP("Soup"),
    MAIN_DISH("Main dish"),
    SALAD("Salad"),
    DESSERT("Dessert"),
    MISCELLANEOUS("Miscellaneous");

    private final String displayValue;

    private Category(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

}

