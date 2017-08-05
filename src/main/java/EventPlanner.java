import java.io.Console;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class EventPlanner {

    private int guestNumber;
    private String mealOption;
    private String beverageOption;
    private String entertainmentOption;
    private int initialCost;
    private int couponOne;
    private int couponTwo;
    private int finalCost;

    public EventPlanner(int guest, String meal, String beverage, String entertainment, int cost, int coupon1, int coupon2, int adjustedCost) {
        guestNumber = guest;
        mealOption = meal;
        beverageOption = beverage;
        entertainmentOption = entertainment;
        initialCost = cost;
        couponOne = coupon1;
        couponTwo = coupon2;
        finalCost = adjustedCost;
    }
    public int getGuestNumber() {
        return guestNumber * 1;
    }
    public String getMealOption() {
        return mealOption;
    }
    public String getBeverageOption() {
        return beverageOption;
    }
    public String getEntertainmentOption() {
        return entertainmentOption;
    }
    public int getInitialCost() {
        return initialCost;
    }
    public int getCouponOne() {
        return couponOne;
    }
    public int getCouponTwo() {
        return couponTwo;
    }
    public int getFinalCost() {
        return finalCost;
    }

    public static String isCorrectType(List<String> types, String type, String input) {
        Console myConsole = System.console();
        if (!types.contains(input)) {
            boolean typeBoolean = false;
            while (!typeBoolean) {
                System.out.println("Please select a type of " + type + " from the above list.");
                input = myConsole.readLine();
                if (types.contains(input)) {
                    typeBoolean = true;
                }
            }
        }
        return input;
    }

    public static int calculateEventCost(int guest, String meal, String beverage, String entertainment) {
        Map<String, Integer> typeValues = new HashMap<String, Integer>();
        typeValues.put("Dinner", 20);
        typeValues.put("Lunch", 13);
        typeValues.put("Appitizers", 8);
        typeValues.put("None", 0);
        typeValues.put("Full Bar", 15);
        typeValues.put("Beer and Wine", 10);
        typeValues.put("Soda", 3);
        typeValues.put("Live Band", 300);
        typeValues.put("DJ", 200);
        typeValues.put("Karaoke", 100);
        typeValues.

        int costs = (guest * typeValues.get(meal)) + (guest * typeValues.get(beverage)) + typeValues.get(entertainment);

        return cost;
    }
}





//    public String getMealOption() {
//        if (mealOption.equals("Full Dinner")) {
//            mealCost = 15;
//        } else if (mealOption.equals("Lunch")) {
//            mealCost = 10;
//        } else if (mealOption.equals("Appitizers")) {
//            mealCost = 5;
//        } else
//            mealCost = 0;
//        return mealOption;
//
//    }
