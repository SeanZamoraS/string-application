package com.pluralsight;

public class VariableApp {

    public static void main(String[] args) {
        //step one
        String favoriteColor;
        String yearStarted;
        char middleInitial;
        boolean hasPets;
        String niceMessage;
        //step two
        final int DAYS_IN_WEEK = 7;
        double coffeePrice = 4.99;
        char favoriteLetter = 'Z';
        boolean isRaining = false;

        //added for step 3
        String messageRaining;
        if (!isRaining) {
            messageRaining = "It's not raining today!";
        }
        else {
            messageRaining = "It's raining today....";
        }

        //step three pt 1
        favoriteColor = "Purple";
        yearStarted = "2026";
        middleInitial = 'S';
        hasPets = true;
        niceMessage = "You're super cool!";

        //creating a message depending on if I have pets or not
        String messagePets;
        if (hasPets) {
            messagePets = "I have a pet!";
        }
        else {
            messagePets = "I don't have a pet...";
        }

        //step three pt 2
        System.out.println("The number of days in a week is: \n" + DAYS_IN_WEEK + "\n");
        System.out.println("The price of a coffee is: \n" + "$" + coffeePrice + "\n");
        System.out.println("My favorite letter is: \n" + favoriteLetter + "\n");
        System.out.println("Let's check the weather... \n" + messageRaining + "\n");
        System.out.println("My favorite color is: \n" + favoriteColor + "\n");
        System.out.println("The year I started Year Up was/is: \n" + yearStarted + "\n");
        System.out.println("My middle initial is: \n" + middleInitial + "\n");
        System.out.println("Checking if I have a pet... \n" + messagePets + "\n");
        System.out.println("I have something nice to say to you... \n" + niceMessage);





    }
}