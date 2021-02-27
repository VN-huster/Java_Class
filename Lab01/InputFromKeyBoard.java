import java.util.Scanner;

class InputFromKeyBoard{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = in.nextLine();
        System.out.println("What is your age?: ");
        int age = in.nextInt();
        System.out.println("How high are you?: ");
        float height = in.nextFloat();


        System.out.println("Mrs/Ms. "+name + ", " +age  +" years old. "
                            + "Your height is " +height +"." );
    }
}
