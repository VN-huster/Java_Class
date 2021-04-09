package Java.Lab06;
import java.util.ArrayList;

public class Order {
    public static final int Max_Order = 10;
    public static final int Max_Limit_Order = 5;
    private static int nbOrder = 0;
    public static int nbCurrentItems = 0;
    public ArrayList< Media> itemsOrder = new ArrayList<Media>(Max_Order);


    public boolean CheckDisk(Media disk1, Media disk2){
        if(disk1.getTitle() == disk2.getTitle()
            && disk1.getCategory() == disk2.getCategory()
            && disk1.getCost() == disk2.getCost()
        ){
            return true;
        }
        return false;
    }

    public void removeMedia(String id){
        for(int i=0; i<nbCurrentItems; i++){
            if(itemsOrder.get(i).getId() ==  id){
                itemsOrder.remove(i);
                System.out.println("Remove disc "+itemsOrder.get(i).getTitle()+" successfully");
                nbCurrentItems--;
                return;
            }
        }
        System.out.println("No disk as you want to remove");
    }

    public void addMedia(Media disk){
        if(nbCurrentItems == Max_Order){
            System.out.println("Full disks, can not add disk " + disk.getTitle());
            return;
        }
        
        for(int i=0; i<nbCurrentItems; i++){
            if(CheckDisk(itemsOrder.get(i), disk) == true){
                System.out.println("The disk " + disk.getTitle() + " is exactly exist");
                return;
            }
            else{
                continue; 
            }
        }

        itemsOrder.add(disk);
        nbCurrentItems ++;
        System.out.println("Add disk " + disk.getTitle() + " successfully");
    }
    
    public void addMedia(Media dvd1, Media dvd2){
        addMedia(dvd1);
        addMedia(dvd2);
    }

    public void addDigitalVideoDisc(Media [] dvdList){
        int i=0;
        while(dvdList[i]!=null){
            addMedia(dvdList[i]);
            i++;
        }
    }

    public float totalCost(Order anOrder){
        float CostOrder = 0;
        for(int i=0; i<anOrder.nbCurrentItems; i++){
            CostOrder += anOrder.itemsOrder.get(i).getCost();
        }
        return CostOrder;
    }

    public void showDisc(Order anOrder){
        System.out.println("===================");
        
        System.out.println("Your Order:");
        System.out.println("===================");
        for(int i=0; i<anOrder.itemsOrder.size(); i++){
            System.out.println(anOrder.itemsOrder.get(i).getId());
            System.out.println(anOrder.itemsOrder.get(i).getTitle());
            System.out.println(anOrder.itemsOrder.get(i).getCategory());
            System.out.println(anOrder.itemsOrder.get(i).getCost());
            System.out.println("______________________");
        }
        
    }
   
    public boolean CountOrder(){
        if(nbOrder < Max_Limit_Order){
            nbOrder ++;
            System.out.println("Create new Order successfully");
            return true;
        }
        else{
            System.out.println("Can not create more. You haved created Max Order");
            return false;
        }
    }

    public void getDate(String day, String month, String year){
        MyDate RightNow = new MyDate(day, month, year);
        RightNow.printDate();
    }

    public Media getLuckyItem(){
        int a = (int) Math.random()*itemsOrder.size();
        Media temp = itemsOrder.get(a);
        System.out.println("Your lucky disc is "+ temp.getTitle());
        removeMedia(itemsOrder.get(a).getId());
        return temp;
    }
  
    
}
