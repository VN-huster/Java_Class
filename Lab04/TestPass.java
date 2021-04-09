package Java.Lab04;


public class TestPass {
    public static void main(String[] args) {
        Digital jungleDVD = new Digital("Jungle");
        Digital cinderellaDVD = new Digital("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle dvd title " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title "+ cinderellaDVD.getTitle());

    }
    public static void swap(Object o1, Object o2){
        Object temp = o1;
        o1 = o2;
        o2 = temp;
    }
    public static void changeTitle(Digital dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new Digital(oldTitle);
    }
    
}
