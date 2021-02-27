import java.util.Scanner;
public class year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        

        System.out.println("Enter year: ");
        int age = in.nextInt();
        while(age<=0){
            System.out.println("Enter year again: ");
            age = in.nextInt();
        }
        System.out.println("Enter month: ");
        int m = in.nextInt();
        System.out.println(m);

        int point = 0;
        if(age%4==0 && age%100 ==0 && age%400 != 0)
            point = 1;
        
        if(point == 1){
            if(m == 1 || m == 3 || m == 5 || m == 8 || m == 7 || m == 10 || m == 12)
                System.out.println("31");
            else if(m == 4 || m == 6 || m == 9 || m == 11)
                System.out.println("30");
            else if(m==2)
                System.out.println("29");

        }
        else{
            if(m == 1 || m == 3 || m == 5 || m == 8 || m == 7 || m == 10 || m == 12)
                System.out.println("31");
            else if(m == 4 || m == 6 || m == 9 || m == 11)
                System.out.println("30");
            else if(m==2)
                System.out.println("28");

        }

    }
    
}
