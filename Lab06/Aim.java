package Java.Lab06;
import java.util.Scanner;
public class Aim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean t = true;
        int select;
        while(t){
            System.out.println("Order Management Application: ");
            System.out.println("--------------------------------");
            System.out.println("1. Create new order");
            System.out.println("2. Add item to the order");
            System.out.println("3. Delete item by id");
            System.out.println("4. Display the items list of order");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            select = in.nextInt();
            Order anOrder = new Order();
            switch(select){
                case 1:
                    
                    break;
                case 2:
                    
                    String title, category, id;
                    float cost;
                    
                    System.out.println("Enter title ");
                    title = in.nextLine();
                    System.out.println("Enter id ");
                    id = in.nextLine();
                    System.out.println("Enter category ");
                    category = in.nextLine();
                    System.out.println("Enter cost ");
                    cost = in.nextFloat();
                    Media temp = new Media(title, category, cost);
                    temp.setID(id);
                    anOrder.addMedia(temp);
                    break;
                case 3:
                    System.out.println("Enter id of product ");
                    String ID = in.nextLine();
                    anOrder.removeMedia(ID);
                    break;
                case 4:
                    System.out.println("Your list Order is:");
                    anOrder.showDisc(anOrder);
                    break;
                case 0:
                    t = false;
                    break;
                default:
                    System.out.println("Enter number again:");
                    
            
            }
        }
    }
}