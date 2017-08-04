import org.junit.*;
import static org.junit.Assert.*;

public class EventPlannerTest {

    @Test
    public void Event_instantiatesCorrectly() {
        EventPlanner testEvent = new EventPlanner(2, "mealOption", "beverageOption", "entertainmentOption");
        assertEquals(true, testEvent instanceof EventPlanner);
    }
    @Test
    public void getGuestNumber_recieveGuestCount_20() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption");
        assertEquals(20, testEventPlanner.getGuest());
    }
    @Test
    public void getMeal_recieveMealCoice_FullDinner() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption");
        assertEquals("FullDinner", testEventPlanner.getMeal());
    }
    @Test
    public void getMeal_recieveBeverageChoice_BeverageChoice() {
        EventPlanner testEventPlanner = new EventPlanner(20, "FullDinner", "beverageOption", "entertainmentOption");
        assertEquals("beverageOption", testEventPlanner.getBeverage());
    }
}