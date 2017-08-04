
public class EventPlanner {

    private int guestNumber;
    private String mealOption;
    private String beverageOption;
    private String entertainmentOption;
    private int initialCost;


    public EventPlanner(int guest, String meal, String beverage, String entertainment, int cost) {
        guestNumber = guest;
        mealOption = meal;
        beverageOption = beverage;
        entertainmentOption = entertainment;
        initialCost = cost;
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
}