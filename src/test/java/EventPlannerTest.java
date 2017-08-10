

import static org.junit.Assert.*;
import org.junit.Test;

public class EventPlannerTest {

    public void newEventPlanner_instantiatesCorrectly_1() throws Exception {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        Integer expected = 1;
        assertEquals(expected, testEventPlannerTest.);
    }
    @Test
    public void newEventPlanner_getGuestNumber_2() throws Exception {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        integer expected = 100;
        assertEquals(expected, testEventPlannerTest.getGuestNumber);
    }
    @Test
    public void newEventPlanner_getMealOption_3() throws Exception {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        String expected = "Full Dinner";
        assertEquals(expected, testEventPlannerTest.mealOption);
    }
    @Test
    public void newEventPlanner_getBeverageOption_4() throws Exception {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        String expected = "Soda";
        assertEquals(expected, testEventPlannerTest.beverageOption);
    }
    @Test
    public void newEventPlanner_getEntertainmentOptio_5() throws Exception {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        String expected = "Live Band";
        assertEquals(expected, testEventPlannerTest.entertainmentOption);
    }
    @Test
    public void cnewEventPlanner_getInitialCost_6() throws Exception {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        Integer expected = 12;
        assertEquals(expected, testEventPlannerTest.initialCost);
    }
    @Test
    public void newEventPlanner_getCoupon1() throws Exception {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        Integer expected = 12;
        assertEquals(expected, testEventPlannerTest.coupon1);
    }
    @Test
    public void newEventPlanner_getCoupon2() throws Exception {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        Integer expected = 12;
        assertEquals(expected, testEventPlannerTest.coupton2);
    }
    @Test
    public void newEventPlanner_getAdjustedCost() throws Exception {
        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
        Integer expected = 12;
        assertEquals(expected, testEventPlannerTest.adjustedCost);
    }


//    @Test
//    public void newEventPlanner_instantiatesCorrectly() {
//        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
//        assertEquals(true, testEventPlannerTest instanceof EventPlannerTest);
//    }
//
//    @Test
//    public void newEventPlanner_getGuestNumber_100() {
//        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
//        assertEquals(0, testEventPlannerTest.getGuestNumber(100));
//    }
//
//    @Test
//    public void newEventPlanner_getMealOption_Dinner() {
//        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
//        assertEquals(0, testEventPlannerTest.getMealOption());
//    }
//
//    @Test
//    public void newEventPlanner_getBeverageOption_FullBar() {
//        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
//        assertEquals(0, testEventPlannerTest.getBeverageOption());
//    }
//
//    @Test
//    public void newEventPlanner_getEntertainmentOption_LiveBand() {
//        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
//        assertEquals(0, testEventPlannerTest.getEntertainmentOption());
//    }
//
//    @Test
//    public void newEventPlanner_getInitialCost_1500() {
//        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
//        assertEquals(0, testEventPlannerTest.getInitialCost());
//    }
//
//    @Test
//    public void newEventPlanner_getCoupon1_familyMember() {
//        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
//        assertEquals(1, testEventPlannerTest.getCoupon1());
//    }
//
//    @Test
//    public void newEventPlanner_getCoupon2_employee() {
//        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
//        assertEquals(2, testEventPlannerTest.getCoupon2());
//    }
//
//    @Test
//    public void newEventPlanner_getAdjustedCost_1000() {
//        EventPlannerTest testEventPlannerTest = new EventPlannerTest();
//        assertEquals(4, testEventPlannerTest.getAdjustedCost());
//    }


}
