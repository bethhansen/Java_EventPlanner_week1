import org.junit.*;
import static org.junit.Assert.*;

public class EventPlannerTest {

    @Test
    public void Event_instantiatesCorrectly() {
        EventPlanner testEvent = new EventPlanner(2, "mealOption", "beverageOption", "entertainmentOption");
        assertEquals(true, testEvent instanceof EventPlanner);
    }
    @Test
    public void getGuestCount_recieveGuestCount_20() {
        EventPlanner testEventPlanner = new EventPlanner(20, "mealOption", "beverageOption", "entertainmentOption");
        assertEquals(20, testEventPlanner.getGuest());
    }
}