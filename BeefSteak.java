package Food_Center_Project;

/**
 * Created by Cclub on 4/21/2017.
 */
public class BeefSteak implements FoodItem {
    @Override
    public String foodName() {
        return  "Beef Steak";
    }

    @Override
    public int foodPrice() {
        return 700;
    }
}
