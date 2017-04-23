package Food_Center_Project;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Cclub on 4/21/2017.
 */
public class IChinese {
    List<FoodItem> chineselist = new ArrayList<>();
    public IChinese() {
        chineselist.add(new ChickenManchurein());
        chineselist.add(new ChickenChowmein());
    }

}
