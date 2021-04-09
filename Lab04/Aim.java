package Java.Lab04;

public class Aim {
    public static void main(String[] args) {
        MyDate anDate = new MyDate("day", "month", "year");
        Order anOrder = new Order();
        anOrder.getDate(anDate.getDay(), anDate.getMonth(), anDate.getYear());
        Digital dvd1 = new Digital("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalDisk(dvd1);
        Digital dvd2 = new Digital("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalDisk(dvd2);
        Digital dvd3 = new Digital("Aladin", "Animation", 18.99f);
        anOrder.addDigitalDisk(dvd3);

        anOrder.removeDigitalDisk(dvd3);
        anDate.printDate();
        anOrder.showDisc(anOrder);
        System.out.println("Total cost is: " + anOrder.totalCost(anOrder));
        
        
       
    }
}
