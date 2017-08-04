public class EventPlanner {

    public int guestNumber;
    public String mealOption;
    public String beverageOption;
    public String entertainmentOption;


    public EventPlanner(int guest, String meal, String beverage, String entertainment) {
        guestNumber = guest;
        mealOption = meal;
        beverageOption = beverage;
        entertainmentOption = entertainment;

    }
    public int getGuest()  {
        return guestNumber;
    }
}