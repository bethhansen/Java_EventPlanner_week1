import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class App {
    public static void main(String[] args) {

        Console myConsole = System.console();

        System.out.println("How many people are going to be coming to your event?");
        String stringGuestNumber = myConsole.readLine();
        int guestNumber = Integer.parseInt(stringGuestNumber);

        System.out.println("What type of food would you like to serve at your event? Choose from the following: Dinner, Lunch, Appitizers, or None.");
        String stringMealOption = myConsole.readLine();
        List<String> mealOption = asList("Dinner", "Lunch", "Appetizers", "None");
        String mealOption = EventPlanner.isCorrectType(mealOption, "food", stringMealOption);

        System.out.println("What type of drinks would you like to serve at your event? Choose from the following: Full Bar, Beer and Wine, Soda or none.");
        String stringBeverageOption = myConsole.readLine();
        List<String> beverageOption = asList("Full Bar", "Beer and Wine", "Soda", "none");
        EventPlanner.isCorrectType(beverageOption, "beverage", stringBeverageOption);

        System.out.println("What type of entertainment would you like to have at your event? Please choose one of the following: Live Band, DJ, ,Karaoke or None");
        String stringEntertainmentOption = myConsole.readLine();
        List<String> entertainmentOption = asList("Live Band", "DJ", "Karaoke", "None");
        EventPlanner.isCorrectType(entertainmentOption, "entertainment", stringEntertainmentOption);

        System.out.println("Are you a member of our Frequent Party Club?.");
        String stringCoupon1 = myConsole.readLine();
        List<String> coupton1 = asList("yes", "no");
        String coupon1 = EventPlanner.isCorrectType(coupon1, "food", stringMealOption);

        System.out.println("What type of drinks would you like to serve at your event? Choose from the following: Full Bar, Beer and Wine, Soda or none.");
        String stringBeverageOption = myConsole.readLine();
        List<String> beverageOption = asList("Full Bar", "Beer and Wine", "Soda", "none");
        EventPlanner.isCorrectType(beverageOption, "beverage", stringBeverageOption);

        System.out.println("What type of entertainment would you like to have at your event? Please choose one of the following: Live Band, DJ, ,Karaoke or None");
        String stringEntertainmentOption = myConsole.readLine();
        List<String> entertainmentOption = asList("Live Band", "DJ", "Karaoke", "None");
        EventPlanner.isCorrectType(entertainmentOption, "entertainment", stringEntertainmentOption);


        EventPlanner userEvent = new EventPlanner(int guestOption, string mealOption, string beverageOption, string entertainmentOption, int cost, int coupon1, int coupon2, int adjustedCost);

        int eventCost = EventPlanner.calculateEventCost(userEvent.getGuestNumber(), userEvent.getMealOption(), userEvent.getBeverageOption(), userEvent.getEntertainmentOption());

        System.out.println("\nYour total cost is $" + eventCost + ".00.\n");

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