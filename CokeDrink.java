package Food_Center_Project;

/**
 * Created by Cclub on 4/21/2017.
 */
public class CokeDrink implements RefreshmentItem {
    @Override
    public String refreshmentName() {
        return "Pepsi";
    }

    @Override
    public int refreshmentPrice() {
        return 35;
    }
}
