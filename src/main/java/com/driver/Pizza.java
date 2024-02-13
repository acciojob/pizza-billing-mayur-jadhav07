package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price = isVeg ? 300 : 400;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!this.bill.contains("Extra Cheese Added")) {
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!this.bill.contains("Extra Toppings Added")) {
            this.price += (this.isVeg ? 70 : 120);
            this.bill += "Extra Toppings Added: " + (this.isVeg ? 70 : 120) + "\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!this.bill.contains("Paperbag Added")) {
            this.price += 20;
            this.bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
