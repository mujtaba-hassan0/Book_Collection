
import java.util.Scanner;
public class BookMenu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[10];
        int bookindex=0;

        while(true){
        System.out.println("Press 1 to view books\nPress 2 to add books\nAny other key to exit");
        String userInput=sc.nextLine();

        if(userInput.equals("1") ){
            int totalBooks=0;
            for(int i=0; i<books.length; i++){
                if(books[0] == null){
                    System.out.println("Sorry! there is no in list so plase add books by choosing option 2");
                    break;   
                }
                
                else if(books[i] != null){
                    totalBooks++;
                    System.out.println("Book number: "+totalBooks);
                    System.out.println(books[i]);
                    
                }
               
            }
            System.out.println("Total Books are:"+totalBooks);
            continue;
        }
        else if(userInput.equals("2")){
            if(bookindex == 10){
                System.out.println("10 Boooks added already.Cannot add more Books");
                continue;
            }
            else{
                System.out.println("Enter book title: ");
                String inputTitle = sc.nextLine();
                System.out.println("Enter book author: ");
                String inputAuthor = sc.nextLine();
                System.out.println("Enter book price: ");
                float inputPrice=  Float.parseFloat(sc.nextLine());

                Book newBook = new Book();
                
                newBook.setTitle(inputTitle);
                newBook.setAuthor(inputAuthor);
                newBook.setPrice(inputPrice);

                books[bookindex++]=newBook;
            }
            
        }
        else{
            break;
        }
    }
    }
}