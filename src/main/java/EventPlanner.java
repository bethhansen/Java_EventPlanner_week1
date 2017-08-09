package models;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class EventPlanner {

    private int guestNumber;
    private String mealOption;
    private String beverageOption;
    private String entertainmentOption;
    private int initialCost;
    private int coupon1;
    private int coupon2;
    private int finalCost;

    public EventPlanner(int guestNumber, String mealOption, String beverageOption, String entertainmentOption, int initialCost, int coupon1, int coupon2, int adjustedCost) {
        this.guestNumber = guestNumber;
        this.mealOption = mealOption;
        this.beverageOption = beverageOption;
        this.entertainmentOption = entertainmentOption;
        this.initialCost = initialCost;
        this.coupon1 = coupon1;
        this.coupon2 = coupon2;
        this.finalCost = adjustedCost;
    }
    public int getGuestNumber() {
        return guestNumber;
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
    public int getCoupon1() {
        return coupon1;
    }
    public int getCoupon2() {
        return coupon2;
    }
    public int getFinalCost() {
        return finalCost;
    }



    public static int calculateEventCost(int guest, String meal, String beverage, String entertainment, int cost, String coupon1, String coupon2, int finalcost) {
        Map<String, Integer> typeValues = new HashMap<String, Integer>();
        typeValues.put("Dinner", 20);
        typeValues.put("Lunch", 13);
        typeValues.put("Full Bar", 15);
        typeValues.put("Soda", 3);
        typeValues.put("Live Band", 300);
        typeValues.put("DJ", 200);
        typeValues.put("yes", 100);
        typeValues.put("no", 0);
        typeValues.put("Family member", 50);
        typeValues.put("Employee", 40);


        int costs = (guest * typeValues.get(meal)) + (guest * typeValues.get(beverage)) + typeValues.get(entertainment)  - typeValues.get(coupon1) - typeValues.get(coupon2);

        return costs;
    }
}

