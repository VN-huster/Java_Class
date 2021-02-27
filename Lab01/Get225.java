import java.util.Scanner;

class Get225{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double x1 = in.nextDouble();
        System.out.println("Enter the second number: ");
        double x2 = in.nextDouble();
        System.out.println("Sum of 2 numbers is: "+(x1+x2));
        System.out.println("Difference of 2 number is: "+(x1-x2));
        System.out.println("Product of 2 number is: "+(x1*x2));
        if(x2!=0){
            
            System.out.println("Quotient of 2 number is: "+(x1/x2));
        }
        else 
            System.out.println("Can devide because divisor = 0");


        
        
    }
}
