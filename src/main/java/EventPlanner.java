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
    public int getCouponOne() {
        return couponOne;
    }
    public int getCouponTwo() {
        return couponTwo;
    }
    public int getFinalCost() {
        return finalCost;
    }
 }