package Food_Center_Project;

/**
 * Created by Cclub on 4/21/2017.
 */
public class ChickenSteak implements FoodItem {
    @Override
    public String foodName() {
        return  "Chicken Steak";
    }

    @Override
    public int foodPrice() {
        return 600;
    }
}
