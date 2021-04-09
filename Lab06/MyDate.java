package Java.Lab06;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class MyDate {

    LocalDateTime dateOrder = LocalDateTime.now();
    Scanner in = new Scanner(System.in);

    private String day;
    private String month;
    private String year;

    public MyDate(String day, String month, String year){
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay(){
        return day;
    }
    public String getMonth(){
        return month;
    }
    public String getYear(){
        return year;
    }
    public void printDate(){
        System.out.print(dateOrder.getMonth());
        System.out.print(" " + dateOrder.getDayOfMonth()+"th");
        System.out.println(" "+dateOrder.getYear());
    }

    public void SelectFormat(){
        System.out.println("Select the format: ");
        System.out.println("1.yyyy-MM-dd");
        System.out.println("2.d/M/yyyy");
        System.out.println("3.dd-MMM-yyyy");
        System.out.println("4.MMM d yyyy");
        System.out.println("5.mm-dd-yyyy");
        int select = in.nextInt();
        String formattedDate;
        DateTimeFormatter myFormatObj;
        switch(select){
            case 1:
                myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
                formattedDate = dateOrder.format(myFormatObj);  
                System.out.println(formattedDate);
                break;
            case 2:
                myFormatObj = DateTimeFormatter.ofPattern("d/M/yyyy");  
                formattedDate = dateOrder.format(myFormatObj);  
                System.out.println(formattedDate); 
                break;
            case 3:
                myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");  
                formattedDate = dateOrder.format(myFormatObj);  
                System.out.println(formattedDate);
                break;
            case 4:
                myFormatObj = DateTimeFormatter.ofPattern("MMM d yyy");  
                formattedDate = dateOrder.format(myFormatObj);  
                System.out.println(formattedDate);
                break;

            case 5:
                myFormatObj = DateTimeFormatter.ofPattern("mm-dd-yyyy");  
                formattedDate = dateOrder.format(myFormatObj);  
                System.out.println(formattedDate);
                break;
            default:
                printDate();
                break;      
        }
    }

    
}
