package Food_Center_Project;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Cclub on 4/21/2017.
 */
public class IBiryani {
    List<FoodItem> biryanilist = new ArrayList<>();

    public IBiryani() {
        biryanilist.add(new ChickenBiryani());
        biryanilist.add(new BeefBiryani());
        biryanilist.add(new MuttonBiryani());

    }
}