
public class Book{
    private String title;
    private String author;
    private float price;

public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0f;
    }

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }

    public void setPrice(float price){
        this.price=price;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }
    public float getPrice(){
        return this.price;
    }

    public String toString(){
        return " Title:"+this.title+", Author: "+this.author+", Price: "+String.format("%.2f",this.price)+"$" ;
    }
    
}
