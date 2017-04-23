package Food_Center_Project;

/**
 * Created by Cclub on 4/21/2017.
 */
public class BeefBurger implements FoodItem {
    @Override
    public String foodName() {
        return "Beef Burger";
    }

    @Override
    public int foodPrice() {
        return  200;
    }
}
