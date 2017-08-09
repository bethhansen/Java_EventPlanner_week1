

import static org.junit.Assert.*;
import org.junit.Test;

public class EventPlanner {

    @Test
    public void newEventPlanner_instantiatesCorrectly() {
        EventPlanner testEventPlanner = new EventPlanner(4, "Dinner", "Full Bar", "Live Band", "yes", "no" , "Family member", "employee" );
        assertEquals(true, testEventPlanner instanceof EventPlanner);
    }

    @Test
    public void newEventPlanner_getGuestNumber_100() {
        EventPlanner testEventPlanner = new EventPlanner(100, "Dinner", "Full Bar", "Live Band", "yes", "no" , "Family member", "employee" );
        assertEquals(0, testEventPlanner.getGuestNumber());
    }

    @Test
    public void newEventPlanner_getMealOption_Dinner() {
        EventPlanner testEventPlanner
                = new EventPlanner(100, "Dinner", "Full Bar", "Live Band", "yes", "no" , "Family member", "employee" );
        assertEquals("dinner", testEventPlanner.getMealOption());
    }

    @Test
    public void newEventPlanner_getBeverageOption_FullBar() {
        EventPlanner testEventPlanner = new EventPlanner(100, "Dinner", "Full Bar", "Live Band", "yes", "no" , "Family member", "employee" );
        assertEquals("beverageOption", testEventPlanner.getBeverage());
    }

    @Test
    public void newEventPlanner_getEntertainmentOption_LiveBand() {
        EventPlanner testEventPlanner = new EventPlanner(100, "Dinner", "Full Bar", "Live Band", "yes", "no" , "Family member", "employee" );
        assertEquals("entertainmentOption", testEventPlanner.getEntertainment());
    }

    @Test
    public void newEventPlanner_getInitialCost_1500() {
        EventPlanner testEventPlanner = new EventPlanner(100, "Dinner", "Full Bar", "Live Band", "yes", "no" , "Family member", "employee" );
        assertEquals(0, testEventPlanner.getInitialCost());
    }

    @Test
    public void newEventPlanner_getCoupon1_familyMember() {
        EventPlanner testEventPlanner = new EventPlanner(100, "Dinner", "Full Bar", "Live Band", "yes", "no" , "Family member", "employee" );
        assertEquals(1, testEventPlanner.getCoupon1());
    }

    @Test
    public void newEventPlanner_getCoupon2_employee() {
        EventPlanner testEventPlanner = new EventPlanner(100, "Dinner", "Full Bar", "Live Band", "yes", "no" , "Family member", "employee" );
        assertEquals(2, testEventPlanner.getCoupon2());
    }

    @Test
    public void newEventPlanner_getAdjustedCost_1000() {
        EventPlanner testEventPlanner = new EventPlanner(4, "Dinner", "Full Bar", "Live Band", "yes", "no" , "Family member", "employee" );
        assertEquals(4, testEventPlanner.getAdjustedCost());
    }
}
