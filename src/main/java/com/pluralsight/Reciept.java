package com.pluralsight;

public class Reciept {

    public static void main(String[] args) {

        String itemType = "apples";
        int itemQuantity = 3;
        double itemPrice = 0.75;

        double itemTotalPrice = itemQuantity * itemPrice;

        System.out.println("The total price for " + itemQuantity + " " + itemType + " is $" + itemTotalPrice + ".");
    }
}