package Food_Center_Project;

/**
 * Created by Cclub on 4/21/2017.
 */
public class ChickenChowmein implements FoodItem {
    @Override
    public String foodName() {
        return "Chicken Chowmein";
    }

    @Override
    public int foodPrice() {
        return 500;
    }
}
