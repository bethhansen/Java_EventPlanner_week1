package models;

import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {

        System.out.println("How many people are going to be coming to your event?");
        String guestNumber = bufferedReader.read();

        System.out.println("What type of food would you like to serve at your event? Choose from the following: 1 for Dinner, 2 for Lunch");
        String stringMealOption = bufferedReader.readLine();

        System.out.println("What type of drinks would you like to serve at your event? Choose from the following: 1 for Full Bar, 2 for Soda.");
        String stringBeverageOption = bufferedReader.readLine();

        System.out.println("What type of entertainment would you like to have at your event? Please choose one of the following: 1 for Live Band, 2 for DJ");
        String stringEntertainmentOption = bufferedReader.readLine();

        System.out.println("Are you a member of our Frequent Party Club? Please choose 1 for yes, 2 for no.");
        String stringCoupon1= bufferedReader.readLine();

        System.out.println("Are you a Employee? Please choose 1 for yes, 2 for no");
        String stringCoupon2 = bufferedReader.readLine();

        EventPlanner newEventPlanner = new EventPlanner(guestNumber, mealOption, beverageOption, entertainmentOption, coupon1, coupon2();

        System.out.println("Number of guests:" + guestNumber);
        System.out.println("Your meal choice is:" + mealOption);
        System.out.println("Your beverage choice is:" + beverageOption);
        System.out.println("Your entrainment choice is:" + entertainmentOption);
        System.out.println("You qualify for the Frequent Party Club discount:" + coupon1);
        System.out.println("You qualify for the Frequent Party Club discount:" + coupon2);



//        String stringGuestNumber = myConsole.readLine();
//
//
//        int guestNumber = Integer.parseInt(stringGuestNumber);



//        List<String> meal = asList("Dinner", "Lunch", "Appetizers", "None");
////        String meal = EventPlanner.isCorrectType(meal, "food", stringMeal);
//
//        String stringBeverageOption = myConsole.readLine();
//        List<String> beverageOption = asList("Full Bar", "Beer and Wine", "Soda", "None");
//        EventPlanner.isCorrectType(beverageOption, "beverage", stringBeverageOption);
//
//        String stringEntertainmentOption = myConsole.readLine();
//        List<String> entertainmentOption = asList("Live Band", "DJ", "Karaoke", "None");
//        EventPlanner.isCorrectType(entertainmentOption, "entertainment", stringEntertainmentOption);
//
//        String stringCoupon1 = myConsole.readLine();
//        List<String> coupon1 = asList("yes", "no");
////        String coupon1 = EventPlanner.isCorrectType(coupon1, "coupon1", stringCoupon1);
//
//       String stringCoupon2 = myConsole.readLine();
//        List<String> coupon2 = asList("Family", "Employee");
//        EventPlanner.isCorrectType(coupon2, "coupon2", stringCoupon2);
//
//
//        EventPlanner userEvent = new EventPlanner(int guestOption, string mealOption, string beverageOption, string entertainmentOption, int initalCost, int coupon1, int coupon2, int finalCost);

//        int eventCost = EventPlanner.calculateEventCost(userEvent.getGuestNumber(), userEvent.getMealOption(), userEvent.getBeverageOption(), userEvent.getEntertainmentOption(), userEvent.getInitialCost(), userEvent.getCouponOne(), userEvent.getCouponTwo(), userEvent.getFinalCost() );

        System.out.println("\nYour total cost is $" + costs + ".00.\n");
        }
    }

    }






































//        System.out.println("Hi, Welcome to our event handling application. We are here to help you with all your special event handling needs.");
//        System.out.println("How many guest will be attending your event?");
//        try{
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            String stringNumber = bufferedReader.readLine();
//            Integer yourNumber = Integer.parseInt(stringNumber);
//            Integer yourMultipliedNumber = yourNumber * 15;
//            System.out.println("This is out beginning price per person: $" + yourMultipliedNumber + ". As we add choices, your price per person will flucuate.");
//                    catch(IOException e)
//            {
//                e.printStackTrace();
//            }
//        }
//    }