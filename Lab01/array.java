
import java.util.Scanner;
import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter number of elements: ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
            sum = sum + a[i];
        }
        Arrays.sort(a);
        System.out.println("Sum of array is: "+sum);
        System.out.println("Average value of array: " +(float)(sum/n));



    }
}