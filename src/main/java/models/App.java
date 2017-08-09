package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("How many people are going to be coming to your event?");
            String guestNumber = bufferedReader.readLine();

            System.out.println("What type of food would you like to serve at your event? Choose from the following: 1 for Dinner, 2 for Lunch");
            String stringMealOption = bufferedReader.readLine();

            System.out.println("What type of drinks would you like to serve at your event? Choose from the following: 1 for Full Bar, 2 for Soda.");
            String stringBeverageOption = bufferedReader.readLine();

            System.out.println("What type of entertainment would you like to have at your event? Please choose one of the following: 1 for Live Band, 2 for DJ");
            String stringEntertainmentOption = bufferedReader.readLine();

            System.out.println("Are you a member of our Frequent Party Club? Please choose 1 for yes, 2 for no.");
            String stringCoupon1 = bufferedReader.readLine();

            System.out.println("Are you a Employee? Please choose 1 for yes, 2 for no");
            String stringCoupon2 = bufferedReader.readLine();

            EventPlanner newEventPlanner = new EventPlanner(guestNumber, mealOption, beverageOption, entertainmentOption, initialCost, coupon1, coupon2, );

            System.out.println("Number of guests:" + "guestNumber");
            System.out.println("Your meal choice is:" + "mealOption");
            System.out.println("Your beverage choice is:" + "beverageOption");
            System.out.println("Your entrainment choice is:" + "entertainmentOption");
            System.out.println("You qualify for the Frequent Party Club discount:" + "coupon1");
            System.out.println("You qualify for the Frequent Party Club discount:" + "coupon2");


            System.out.println("\nYour total cost is $" + costs + ".00.\n");
        }
    }

    }

