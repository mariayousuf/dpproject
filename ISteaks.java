package Food_Center_Project;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Cclub on 4/21/2017.
 */
public class ISteaks {
    List<FoodItem> steaklist = new ArrayList<>();
    public ISteaks() {
        steaklist.add(new ChickenSteak());
        steaklist.add(new BeefSteak());
    }
}
