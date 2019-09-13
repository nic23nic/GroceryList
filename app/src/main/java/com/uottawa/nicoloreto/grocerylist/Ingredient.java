package com.uottawa.nicoloreto.grocerylist;

 class Ingredient { // Object, contains the name of the ingredient (name), and the most recent price (price).
                    // TODO: Add ability to show a history of prices, maybe?

     //-------------------------------------------------- Variables

     private String name;
     private double price;

     //-------------------------------------------------- Constructors

    protected Ingredient(String name){
        this.name = name;
        price = -1;
    }
    protected Ingredient(String name, double price){
         this.name = name;
         this.price = price;
    }

    //--------------------------------------------------- Getters/Setters

    protected String getName(){
        return name;
    }

    protected double getPrice(){
        return price;
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setPrice(double price){
        this.price = price;
    }

    public String toString(){
        return name;
    }

}
