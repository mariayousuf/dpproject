package Food_Center_Project;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by Cclub on 4/21/2017.
 */
public class Menu {
    String[] arr = new String[]{"BURGER", "CHINESE", "STEAK", "BIRYANI", "DRINKS", "Place your Order", "Edit Cart"};

    public void displayMenu() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ") " + arr[i]);
        }
    }

    List<FoodItem> list;
    Scanner s1 = new Scanner(System.in);
    Cart cart = new Cart();
    public Boolean orderSelection(String inp) {
        if (inp.equals("1")) {
            IBurger burger = new IBurger();
            list = burger.burgerlist;
            int count = 1;
            for (FoodItem item : list) {
                System.out.println(count + ") " + item.foodName());
                count++;
            }
            System.out.print("Enter Option: ");
            int option = s1.nextInt();
            System.out.print("Enter Quantity: ");
            int quantity = s1.nextInt();
            if (quantity <= 0) {
                quantity = 1;
            }
            cart.addItem(list.get(option-1).foodName(), list.get(option-1).foodPrice(), quantity);
            System.out.println("Item Added to Cart");
            System.out.println("-----------------------------" + "\n");
            return false;
        } else if (inp.equals("2")) {
            IChinese chinese = new IChinese();
            list = chinese.chineselist;
            int count = 1;
            for (FoodItem item : list) {
                System.out.println(count + ") " + item.foodName());
                count++;
            }
            System.out.print("Enter Option: ");
            int option = s1.nextInt();
            System.out.print("Enter Quantity: ");
            int quantity = s1.nextInt();
            if (quantity <= 0) {
                quantity = 1;
            }
            cart.addItem(list.get(option-1).foodName(), list.get(option-1).foodPrice(), quantity);
            System.out.println("Item Added to Cart");
            System.out.println("-----------------------------" + "\n");
            return false;
        } else if (inp.equals("3")) {
            ISteaks steak = new ISteaks();
            list = steak.steaklist;
            int count = 1;
            for (FoodItem item : list) {
                System.out.println(count + ") " + item.foodName());
                count++;
            }
            System.out.print("Enter Option: ");
            int option = s1.nextInt();
            System.out.print("Enter Quantity: ");
            int quantity = s1.nextInt();
            if (quantity <= 0) {
                quantity = 1;
            }
            cart.addItem(list.get(option-1).foodName(), list.get(option-1).foodPrice(), quantity);
            System.out.println("Item Added to Cart");
            System.out.println("-----------------------------" + "\n");
            return false;
        } else if (inp.equals("4")) {
            IBiryani biryani = new IBiryani();
            list = biryani.biryanilist;
            int count = 1;
            for (FoodItem item : list) {
                System.out.println(count + ") " + item.foodName());
                count++;
            }
            System.out.print("Enter Option: ");
            int option = s1.nextInt();
            System.out.print("Enter Quantity: ");
            int quantity = s1.nextInt();
            if (quantity <= 0) {
                quantity = 1;
            }
            cart.addItem(list.get(option-1).foodName(), list.get(option-1).foodPrice(), quantity);
            System.out.println("Item Added to Cart");
            System.out.println("-----------------------------" + "\n");
            return false;
        } else if (inp.equals("5")) {
            IDrinks drink = new IDrinks();
            List<RefreshmentItem> list = drink.drinkslist;
            int count = 1;
            for (RefreshmentItem item : list) {
                System.out.println(count + ") " + item.refreshmentName());
                count++;
            }
            System.out.print("Enter Option: ");
            int option = s1.nextInt();
            System.out.print("Enter Quantity: ");
            int quantity = s1.nextInt();
            if (quantity <= 0) {
                quantity = 1;
            }
            cart.addItem(list.get(option-1).refreshmentName(), list.get(option-1).refreshmentPrice(), quantity);
            System.out.println("Item Added to Cart");
            System.out.println("-----------------------------" + "\n");
            return false;
        } else if (inp.equals("6")) {
            cart.getPlacedOrder();
            System.out.println("-----------------------------" + "\n");
            return true;
        } else if (inp.equals("7")) {
            cart.editOrder();
            System.out.println("-----------------------------" + "\n");
            return false;
        } else {
            System.out.println("Wrong option");
            System.out.println("-----------------------------" + "\n");
            return false;
        }
    }

}
