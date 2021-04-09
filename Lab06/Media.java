package Java.Lab06;
public class Media {
    private String title;
    private String category;
    private float cost;
    private String id;

    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public float getCost(){
        return cost;
    }
    public String getId(){
        return id;
    }

    public void  setID(String id){
        this.id = id;
    }
    public Media(String title, String category, float cost){
        super();
		this.title = title;
		this.category = category;
		this.cost = cost;
    }

    public boolean SearchDisc(String title){
        if(this.title.contains(title)){
            System.out.println("Search successfully");
            return true;
        }
        return false;
    }
    
}
