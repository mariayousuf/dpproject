package Food_Center_Project;

/**
 * Created by Cclub on 4/21/2017.
 */
public class PepsiDrink implements RefreshmentItem {
    @Override
    public String refreshmentName() {
        return "Coke";
    }

    @Override
    public int refreshmentPrice() {
        return 35;
    }
}
