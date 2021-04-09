package Java.Lab06;
import java.util.ArrayList;
public class Book extends Media  {
    private String title;
    private String category;
    private float cost;
    private ArrayList<String>authors = new ArrayList<String>();

    public String getTitle(){
        return title;
    }
    public String getCatelory(){
        return category;
    }
    public float getCost(){
        return cost;
    }
    public ArrayList<String>getAuthor(){
        return authors;
    }

    public Book(String title, String category, float cost){
        super(title, category, cost);
    }

    public Book(String title, String category, float cost, ArrayList<String> authors){
        super(title, category, cost);
        this.authors = authors;
    }
    private boolean checkAuthor(String authorName){
        for(int i=0; i<authors.size(); i++){
            if(authors.get(i)==authorName){
                return true;
            }
        }
        return false;


    }

    public void addAuthor(String authorName){
        if(checkAuthor(authorName)){
            System.out.println("Author has existed");
        }
        else{
            authors.add(authorName);
            System.out.println("Add successfully");
        }
    }

    public void removeAuthor(String authorName){
        for(int i=0; i<authors.size(); i++){
            if(authors.get(i)==authorName){
                authors.remove(i);
                System.out.println("Successfully remove");
                return;
            }
        System.out.println("There is no such author");
        }
    }


    
}
