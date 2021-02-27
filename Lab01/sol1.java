
import java.util.Scanner;
 
public class sol1 {
 
    public static void main(String[] args) {
        int aNumber, bNumber;
        float solu;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Enter a: ");
        aNumber = scanner.nextInt();
        System.out.println("Enterb: ");
        bNumber = scanner.nextInt();
        System.out.println("Your equation: " + aNumber + "x + " + bNumber + " = 0.");
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Many solutions");
            } else {
                System.out.println("Np solution");
            }
        } else {
            solu = (float)bNumber / aNumber;  
            System.out.println("Your solution x = " + solu + ".");
        }
    }
 
}