package Food_Center_Project;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Cclub on 4/21/2017.
 */
public class IDrinks {
    List<RefreshmentItem> drinkslist = new ArrayList<>();
    public IDrinks() {
        drinkslist.add(new PepsiDrink());
        drinkslist.add(new CokeDrink());
    }
}
