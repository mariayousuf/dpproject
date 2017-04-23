package Food_Center_Project;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cclub on 4/21/2017.
 */
public class IBurger {
    List<FoodItem> burgerlist = new ArrayList<>();

    public IBurger() {
        burgerlist.add(new ChickenBurger());
        burgerlist.add(new BeefBurger());
    }
}
