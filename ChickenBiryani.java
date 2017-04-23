package Food_Center_Project;

/**
 * Created by Cclub on 4/21/2017.
 */
public class ChickenBiryani implements FoodItem {
    @Override
    public String foodName() {
        return "Chicken Biryani";
    }

    @Override
    public int foodPrice() {
        return 120;
    }
}
