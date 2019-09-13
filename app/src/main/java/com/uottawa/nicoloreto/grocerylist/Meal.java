package com.uottawa.nicoloreto.grocerylist;

import java.util.ArrayList;

 class Meal { // Meal object, with String name, an array list Ingredients containing the meal's constituent parts, and ability to return total price of all ingredients.

    private String name;
    private ArrayList<Ingredient> ingredients;

    protected Meal(String name){
        this.name = name;
        ingredients = new ArrayList<Ingredient>();
    }
    protected Meal(String name, ArrayList<Ingredient> ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }


    protected String getName(){
        return name;
    }
    protected ArrayList<Ingredient> getIngredients(){
        return ingredients;
    }

    protected void setName(String name){
        this.name = name;
    }
    protected void addIngredients(ArrayList<Ingredient> ingredients){
        this.ingredients = ingredients;
    }
    protected void addIngredients(Ingredient ingredient){
        ingredients.add(ingredient);
    }











 }
