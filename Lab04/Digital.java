package Java.Lab04;

public class Digital {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle(){
        return title;
    }
    public String getCatelogy(){
        return category;
    }
    public String getDirector(){
        return director;
    }
    public int getLength(){
        return length;
    }
    public float getCost(){
        return cost;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public Digital(String title){
        super();
        this.title = title;
    }
    public Digital(String title, String category, float cost){
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Digital(String title, String category, String director, float cost){
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    public Digital(String title, String category, String director, int length, float cost){
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    
   
   

    
}
