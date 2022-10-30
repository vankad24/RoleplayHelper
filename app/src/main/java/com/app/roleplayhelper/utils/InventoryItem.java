package com.app.roleplayhelper.utils;

public class InventoryItem {
    public String name;
    public String description;
    public int amount;
    public float weight;

    public InventoryItem(String name, String description, int amount, float weight) {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.weight = weight;
    }
}
