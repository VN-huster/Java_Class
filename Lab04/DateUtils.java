package Java.Lab04;

public class DateUtils {

    public static boolean compareDate(MyDate date1, MyDate date2){
        if(date1.dateOrder.getDayOfMonth()==date2.dateOrder.getDayOfMonth() && date1.dateOrder.getMonthValue()==date2.dateOrder.getMonthValue() && date1.dateOrder.getYear()==date2.dateOrder.getYear())
            return true;
        else if(date1.dateOrder.getMonthValue()<date2.dateOrder.getMonthValue() && date1.dateOrder.getYear()==date2.dateOrder.getYear() )
            return true;
        else if(date1.dateOrder.getYear()<date2.dateOrder.getYear())
            return true;
        else return false;
    }

    public static void swap(MyDate d1, MyDate d2){
        MyDate temp = d1;
        d1 = d2;
        d2 = temp;
    }

    public static void sortDate(MyDate date[], int length){
        for (int i=0; i<length-1; i++){
            for(int j=i+1; j < length; j++){
                if(compareDate(date[i], date[j]))
                    swap(date[i],date[j]);
            }
        }   
    }
}
