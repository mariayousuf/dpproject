package Food_Center_Project;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;
/**
 * Created by Cclub on 4/21/2017.
 */
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            menu.displayMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Option: ");
            String input = scanner.nextLine();
            Boolean flag = menu.orderSelection(input);
            if(flag == true) {
                break;
            }
            // write your code here
        }
    }

}
