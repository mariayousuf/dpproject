package Food_Center_Project;

/**
 * Created by Cclub on 4/21/2017.
 */
public class ChickenManchurein implements FoodItem {
    @Override
    public String foodName() {
        return "Chicken Manchurein";
    }

    @Override
    public int foodPrice() {
        return 550;
    }
}
