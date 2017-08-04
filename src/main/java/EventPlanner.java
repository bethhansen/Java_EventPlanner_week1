
public class EventPlanner {

    private int guestNumber;
    private String mealOption;
    private String beverageOption;
    private String entertainmentOption;


    public EventPlanner(int guest, String meal, String beverage, String entertainment) {
        guestNumber = guest;
        mealOption = meal;
        beverageOption = beverage;
        entertainmentOption = entertainment;
    }
    public int getGuest()  {
        return guestNumber;
    }
    public String getMeal()  {
        return mealOption;
    }
    public String getBeverage()  {
        return beverageOption;
    }
}