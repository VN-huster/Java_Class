//THis is exercise of solving first degree 2 variables

package Java;
import java.util.Scanner;
public class first2val {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter slope a1: ");
        float a1 = in.nextFloat();
        System.out.println("Enter slope b1: ");
        float b1 = in.nextFloat();
        System.out.println("Enter result1: ");
        float r1 = in.nextFloat();
        System.out.println("Enter slope a2: ");
        float a2 = in.nextFloat();
        System.out.println("Enter slope b2: ");
        float b2 = in.nextFloat();
        System.out.println("Enter result2: ");
        float r2 = in.nextFloat();
        System.out.println("Yout equations: ");
        System.out.println(a1+"*x+ "+b1+"*y= "+r1);
        System.out.println(a2+"*x+ "+b2+"*y= "+r2);
        float d = a1*b2 - a2*b1;
        float d1 = r1*b2 - r2*b1;
        float d2 = a1*r2 - a2*r1;
        if(d!=0){
            System.out.println("Solution1: x= "+(d1/d));
            System.out.println("Solution2: y= "+(d2/d));

        }
        else if(d==0)
            System.out.println("There are many solutions");
        else 
        System.out.println("There is no solution");
        in.close();

    }
}
