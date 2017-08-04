
public class EventPlanner {

    private int guestNumber;
    private String mealOption;
    private String beverageOption;
    private String entertainmentOption;
    private int initialCost;
    private int couponOne;
    private int couponTwo;


    public EventPlanner(int guest, String meal, String beverage, String entertainment, int cost, int coupon1, int coupon2) {
        guestNumber = guest;
        mealOption = meal;
        beverageOption = beverage;
        entertainmentOption = entertainment;
        initialCost = cost;
        couponOne = coupon1;
        couponTwo = coupon2;
    }

    public int getGuest() {
        return guestNumber;
    }

    public String getMeal() {
        return mealOption;
    }

    public String getBeverage() {
        return beverageOption;
    }

    public String getEntertainment() {
        return entertainmentOption;
    }

    public int getCost() {
        return initialCost;
    }
    public int getCoupon1() {
        return couponOne;
    }
    public int getCoupon2() {
        return couponTwo;
    }
}