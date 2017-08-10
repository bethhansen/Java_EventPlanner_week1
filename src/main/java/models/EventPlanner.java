package models;

public class EventPlanner {

    private int guestNumber;
    private String mealOption = "";
    private String beverageOption = "";
    private String entertainmentOption = "";
    private int coupons;
    private String coup;
    private int price = 0;
    private int meals;
    private int beverages;
    private int entertainment;


    // CONSTRUCTOR-----

    public EventPlanner(int people, int food, int drinks, int music, int discount) {
        guestNumber = people;
        meals = food;
        beverages = drinks;
        entertainment = music;
        coupons = discount;

    }

    //GETTER-----

    public int getPeople() {
        return guestNumber;
    }

    public String getMealOption() {
        return mealOption;
    }

    public String getBeverageOption() {
        return beverageOption;
    }

    public String getEntertainmentOption() {
        return entertainmentOption;
    }

    public int getCoup() {
        return coupons;
    }

    public int getPrice() {
        return price;
    }


    public Integer finalCost() {
        if (meals == 1) {
            price += 20 * guestNumber;
        } else if (meals == 2) {
            price += 13 * guestNumber;
        }

        if (beverages == 1) {
            price += 15 * guestNumber;
        } else if (beverages == 2) {
            price += 3 * guestNumber;
        }

        if (entertainment == 1) {
            price += 300;
        } else if (entertainment == 2) {
            price += 200;
        }

        if (coupons == 1) {
            price -= 50;
        } else if (coupons == 2) {
            price -= 40;
        }


        return price;
    }

    public String chooseMeal() {
        if( meals == 1) {
            mealOption = "Dinner";
        } else if (meals == 2) {
            mealOption = "Lunch";
        } else {
            mealOption = "Choose either 1 or 2.";
        }
        return mealOption;
    }

    public String chooseBeverage() {
        if( beverages == 1) {
            beverageOption = "Full Bar";
        } else if (beverages == 2) {
            beverageOption = "Soda";
        } else {
            beverageOption = "Choose either 1 or 2.";
        }
        return beverageOption;
    }

    public String chooseEntertainment() {
        if( entertainment == 1) {
            entertainmentOption = "Live Band";
        } else if (entertainment == 2) {
            entertainmentOption = "DJ";
        } else {
            entertainmentOption = "Choose either 1 or 2.";
        }
        return entertainmentOption;
    }

    public String chooseCoupon() {
        if( coupons == 1) {
            coup = "Family Member";
        } else if (coupons == 2) {
            coup = "Employee";
        } else {
            coup = "Choose 1 or 2";
        }
        return coup;
    }
}













