import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void Event_instantiatesCorrectly() {
        EventPlanner testEvent = new EventPlanner(2);
        assertEquals(true, testEvent instanceof EventPlanner);
    }

}