

import static org.junit.Assert.*;
import org.junit.Test;

public class EventPlannerTest {

    public void newEventPlanner_instantiatesCorrectly_1(){
        models.EventPlanner testEventPlanner = new models.EventPlanner( 1, 1, 1, 1, 1);
        assertEquals(true, testEventPlanner instanceof  models.EventPlanner);
    }
    @Test
    public void newEventPlanner_getGuestNumber_2(){
        models.EventPlanner testEventPlanner = new models.EventPlanner( 1, 1, 1, 1, 1);       assertEquals(1, testEventPlanner.getPeople());
    }
    @Test
    public void newEventPlanner_getMealOption_1(){
        models.EventPlanner testEventPlanner = new models.EventPlanner( 1, 1, 1, 1, 1);
        String expectedOutput = "";
        assertEquals(expectedOutput, testEventPlanner.getMealOption());
    }
    @Test
    public void newEventPlanner_getBeverageOption_fullBar(){
        models.EventPlanner testEventPlanner = new models.EventPlanner( 1, 1, 1, 1, 1);;
        String expectedOutput = "";
        assertEquals(expectedOutput, testEventPlanner.getBeverageOption());
    }

    @Test
    public void newEventPlanner_getPrice(){
        models.EventPlanner testEventPlanner = new models.EventPlanner( 1, 1, 1, 1, 1);
        assertEquals(0, testEventPlanner.getPrice());
    }

    @Test
    public void newEventPlanner_getEntertainmentOption_5(){
        models.EventPlanner testEventPlanner = new models.EventPlanner( 1, 1, 1, 1, 1);
        String expectedOutput = "";
        assertEquals(expectedOutput, testEventPlanner.getEntertainmentOption());
    }

    @Test
    public void newEventPlanner_getCoupon1(){
        models.EventPlanner testEventPlanner = new models.EventPlanner( 1, 1, 1, 1, 1);
        assertEquals(1, testEventPlanner.getCoup());
    }

    @Test
    public void newEventPlanner_getCoupon2(){
        models.EventPlanner testEventPlanner = new models.EventPlanner( 1, 1, 1, 1, 1);
        assertEquals(1, testEventPlanner.getCoup());
    }
}
