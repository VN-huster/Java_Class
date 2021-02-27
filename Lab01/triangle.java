import java.util.Scanner;
public class triangle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        for(int i=n; i>0; i--){
            for(int j=0; j<2*n+1; j++){
                if(j<=2*n-i && j>=i)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }    
    }
}
