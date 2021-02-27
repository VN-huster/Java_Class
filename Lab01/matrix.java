import java.util.Scanner;
import java.util.Arrays;
public class matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int r = in.nextInt();
        System.out.println("Enter columns: ");
        int c = in.nextInt();
        int m1[][] = new int[r][c];
        int m2[][] = new int[r][c];
        
        System.out.println("Enter matrix1: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                m1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter matrix2: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                m2[i][j] = in.nextInt();
            }
        }

        int m[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                m[i][j] = m1[i][j]+m2[i][j];
            }
        }
        System.out.println("Sum of 2 matrix is: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }


    }
}