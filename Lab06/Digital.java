package Java.Lab06;

public class Digital extends Media {
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

    public Digital(String title, String category, float cost){
        super(title, category, cost);
    }
    public Digital(String title, String category, String director, float cost){
        super(title, category, cost);
        this.director = director;
    }
    public Digital(String title, String category, String director, int length, float cost){
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public boolean SearchDisc(String title){
        if(this.title.contains(title)){
            System.out.println("Search successfully");
            return true;
        }
        return false;

    }
    
   
   

    
}
