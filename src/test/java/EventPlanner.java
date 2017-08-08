package models;

import static org.junit.Assert.*;
import org.junit.Test;

public class EventTest {

    @Test
    public void newEventPlanner_instantiatesCorrectly() {
        EventPlanner testEvent = new EventPlanner(2, "mealOption", "beverageOption", "entertainmentOption", 0, 0, 0, 0);
        assertEquals(true, testEvent instanceof EventPlanner);
    }

    @Test
    public void newEventPlanner_getGuest() {
        EventPlanner testEvent = new EventPlanner(20, "mealOption", "beverageOption", "entertainmentOption", 0, 0, 0, 0);
        assertEquals(20, testEventPlanner.getGuest());
    }

    @Test
    public void newEventPlanner_getMeal_() {
        EventPlanner testEvent
                = new EventPlanner(20, "mealOption", "beverageOption", "entertainmentOption", 0, 0, 0, 0);
        assertEquals("FullDinner", testEventPlanner.getMeal() );
    }

    @Test
    public void newEventPlanner_getBeverage_() {
        EventPlanner testEvent = new EventPlanner(20, "mealOption", "beverageOption", "entertainmentOption", 0, 0, 0, 0);
        assertEquals("beverageOption", testEventPlanner.getBeverage());
    }

    @Test
    public void newEventPlanner_getEntertainment_() {
        EventPlanner testEvent = new EventPlanner(20, "mealOption", "beverageOption", "entertainmentOption", 0, 0, 0, 0);
        assertEquals("entertainmentOption", testEventPlanner.getEntertainment());
    }

    @Test
    public void newEventPlanner_getTotalCost_() {
        EventPlanner testEvent = new EventPlanner(20, "mealOption", "beverageOption", "entertainmentOption", 0, 0, 0, 0);
        assertEquals(0, testEventPlanner.getCost());
    }

    @Test
    public void newEventPlanner_getCouponOne_() {
        EventPlanner testEvent = new EventPlanner(20, "mealOption", "beverageOption", "entertainmentOption", 0, 0, 0, 0);
        assertEquals(1, testEventPlanner.getCoupon1());
    }

    @Test
    public void newEventPlanner_getCouponTwo_() {
        EventPlanner testEvent = new EventPlanner(20, "mealOption", "beverageOption", "entertainmentOption", 0, 0, 0, 0);
        assertEquals(2, testEventPlanner.getCoupon2());
    }

    @Test
    public void newEventPlanner_finalCost_() {
        EventPlanner testEvent = new EventPlanner(20, "mealOption", "beverageOption", "entertainmentOption", 0, 0, 0, 0);
        assertEquals(4, testEventPlanner.getAdjustedCost());
    }
}