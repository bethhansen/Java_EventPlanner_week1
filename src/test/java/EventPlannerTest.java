import org.junit.*;
import static org.junit.Assert.*;

public class EventPlannerTest {

    @Test
    public void Event_instantiatesCorrectly() {
        EventPlanner testEvent = new EventPlanner(2, "mealOption", "beverageOption", "entertainmentOption", 0);
        assertEquals(true, testEvent instanceof EventPlanner);
    }
    @Test
    public void getGuestNumber_recieveGuestCount_20() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption", 0);
        assertEquals(20, testEventPlanner.getGuest());
    }
    @Test
    public void getMeal_recieveMealCoice_FullDinner() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption", 0);
        assertEquals("FullDinner", testEventPlanner.getMeal());
    }
    @Test
    public void getBeverage_recieveBeverageChoice_BeverageChoice() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption", 0);
        assertEquals("beverageOption", testEventPlanner.getBeverage());
    }
    @Test
    public void getEntertainment_recieveEntertainmentChoice_EntertainmentChoice() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption", 0);
        assertEquals(0, testEventPlanner.getCost());
    }
}