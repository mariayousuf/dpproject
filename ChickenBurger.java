package Food_Center_Project;

/**
 * Created by Cclub on 4/21/2017.
 */
public class ChickenBurger implements FoodItem {
    @Override
    public String foodName() {
        return  "Chicken Burger";
    }

    @Override
    public int foodPrice() {
        return 220;
    }
}
