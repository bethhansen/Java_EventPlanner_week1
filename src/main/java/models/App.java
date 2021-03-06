package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("How many people are going to be coming to your event?");
            String stringGuests = bufferedReader.readLine();

            System.out.println("What type of food would you like to serve at your event? Choose from the following: 1 = Dinner, 2 = Lunch");
            String stringMeals = bufferedReader.readLine();

            System.out.println("What type of drinks would you like to serve at your event? Choose from the following: 1 = Full Bar, 2 = Soda.");
            String stringBeverages = bufferedReader.readLine();

            System.out.println("What type of entertainment would you like to have at your event? Please choose one of the following: 1 = Live Band, 2 = DJ");
            String stringEntertainment = bufferedReader.readLine();

            System.out.println("Are you a member of our Frequent Party Club or are you an Employee? Please choose one of the following: 1 = Member, 2 = Employee.");
            String stringCoupons = bufferedReader.readLine();




            EventPlanner event = new EventPlanner(Integer.parseInt(stringGuests), Integer.parseInt(stringMeals), Integer.parseInt(stringBeverages), Integer.parseInt(stringEntertainment), Integer.parseInt(stringCoupons));


            event.finalCost();
            event.chooseMeal();
            event.chooseBeverage();
            event.chooseEntertainment();
            event.chooseCoupon();

            System.out.println('\n' + "Number of guests: " + event.getPeople() + '\n' + "Here are your options you have selected: " + '\n' + "Meal time: " + event.getMealOption() + '\n' + "Beverage choice: " + event.getBeverageOption() + '\n' + "Entertainment selection: " + event.getEntertainmentOption() + '\n' + "Coupon group: " + event.getCoup());
            System.out.println("Your event will cost: " + "$" + event.getPrice() + ".00");

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
