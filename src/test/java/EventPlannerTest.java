import org.junit.*;
import static org.junit.Assert.*;

public class EventPlannerTest {

    @Test
    public void Event_instantiatesCorrectly() {
        EventPlanner testEvent = new EventPlanner(2, "mealOption", "beverageOption", "entertainmentOption", 0, 1, 2, 4);
        assertEquals(true, testEvent instanceof EventPlanner);
    }
    @Test
    public void getGuestNumber_recieveGuestCount_20() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption", 0, 1, 2, 4);
        assertEquals(20, testEventPlanner.getGuestNumber());
    }
    @Test
    public void getMeal_recieveMealCoice_FullDinner() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption", 0, 1, 2, 4);
        assertEquals("FullDinner", testEventPlanner.getMealOption() );
    }
    @Test
    public void getBeverage_recieveBeverageChoice_BeverageChoice() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption", 0, 1, 2, 4);
        assertEquals("beverageOption", testEventPlanner.getBeverageOption());
    }
    @Test
    public void getEntertainment_recieveEntertainmentChoice_EntertainmentChoice() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption", 0, 1, 2, 4);
        assertEquals("entertainmentOption", testEventPlanner.getEntertainmentOption());
    }
    @Test
    public void getTotalCost_recieveTotalCost_Cost() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption", 0, 1, 2, 4);
        assertEquals(0, testEventPlanner.getInitialCost());
    }
    @Test
    public void getCouponOne_recieveCouponOne_Discount() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption", 0, 1, 2, 4);
        assertEquals(1, testEventPlanner.getCouponOne());
    }
    @Test
    public void getCouponTwo_recieveCouponTwo_Discount() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption", 0, 1, 2, 4
        );
        assertEquals(2, testEventPlanner.getCouponTwo());
    }
    @Test
    public void finalCost_recieveFinalAdjustedCost_Cost() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption", 0, 1, 2, 4);
        assertEquals(4, testEventPlanner.getFinalCost());
    }
}