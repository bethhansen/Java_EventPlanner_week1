

import static org.junit.Assert.*;
import org.junit.Test;

public class EventPlannerTest {

    @Test
    public void newEventPlanner_instantiatesCorrectly() {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        assertEquals(true, testEventPlannerTest instanceof EventPlannerTest);
    }

    @Test
    public void newEventPlanner_getGuestNumber_100() {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        assertEquals(0, testEventPlannerTest.getGuestNumber(100));
    }

    @Test
    public void newEventPlanner_getMealOption_Dinner() {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        assertEquals(0, testEventPlannerTest.getMealOption());
    }

    @Test
    public void newEventPlanner_getBeverageOption_FullBar() {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        assertEquals(0, testEventPlannerTest.getBeverageOption());
    }

    @Test
    public void newEventPlanner_getEntertainmentOption_LiveBand() {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        assertEquals(0, testEventPlannerTest.getEntertainmentOption());
    }

    @Test
    public void newEventPlanner_getInitialCost_1500() {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        assertEquals(0, testEventPlannerTest.getInitialCost());
    }

    @Test
    public void newEventPlanner_getCoupon1_familyMember() {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        assertEquals(1, testEventPlannerTest.getCoupon1());
    }

    @Test
    public void newEventPlanner_getCoupon2_employee() {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        assertEquals(2, testEventPlannerTest.getCoupon2());
    }

    @Test
    public void newEventPlanner_getAdjustedCost_1000() {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        assertEquals(4, testEventPlannerTest.getAdjustedCost());
    }


}
