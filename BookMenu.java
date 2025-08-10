
import java.util.Scanner;
import java.util.ArrayList;
public class BookMenu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
        

        while(true){
            int bookindex=1;

        System.out.println("Press 1 to view books\nPress 2 to add books\nPress 3 to remove books\nPress 4 to search books\nAny other key to exit");
        String userInput=sc.nextLine();

        if(userInput.equals("1") ){
            if(books.isEmpty()){
                System.out.println("Sorry! there is no book in the list. Press 2 to add books.");
            }
            else{
                for(Object b : books){
                    System.out.print("Book: " + bookindex++ );
                    System.out.println(b);
                }
                
            }

        }
        
        
        else if(userInput.equals("2")){

                System.out.println("Enter book title: ");
                String inputTitle = sc.nextLine();
                System.out.println("Enter book author: ");
                String inputAuthor = sc.nextLine();
                System.out.println("Enter book price: ");
                float inputPrice=  Float.parseFloat(sc.nextLine());

                boolean bookExists = false;
                for(int i=0; i<books.size(); i++){
                    if(books.get(i).getTitle().equalsIgnoreCase(inputTitle) && books.get(i).getAuthor().equalsIgnoreCase(inputAuthor)){
                        System.out.println("Book already exists.");
                        bookExists = true;
                        break;
                    }
                }
        if(!bookExists){
            books.add(new Book(inputTitle, inputAuthor, inputPrice));
            System.out.println("Book Added successfully");
        }


            }


        else if(userInput.equals("3")){
            System.out.println("Enter the Book Name You want to delete:");
            String bookName = sc.nextLine();

            int index =-1;
            for(int i=0; i<books.size(); i++){
            if(books.get(i).getTitle().equalsIgnoreCase(bookName)){
                index = i;
                String tempbook=books.get(i).getTitle();
                if(tempbook.equalsIgnoreCase(bookName)){
                    System.out.println("There are two books with the same name.");
                    boolean sameAuthor = false;
                    while(!sameAuthor){
                        System.out.println("Enter the author name to confirm deletion:");
                        String tempAuthorName = sc.nextLine();
                        if(tempAuthorName.equalsIgnoreCase(books.get(index).getAuthor())){
                            books.remove(index);
                            System.out.println("Book is Successfully Deleted");
                            index=-1;
                            sameAuthor = true;
                            break;
                        }
                        else{
                            System.out.println("Author name does not match. Book not deleted.");
                         continue;
                        }
                    }}
                }
               

                
            }

        
    if(index != -1){
            books.remove(index);
            System.out.println("Book is Successfully Deleted");
        }
        }

        else if(userInput.equals("4")){
            System.out.println("Enter the book name you want to search: ");
            String bookName = sc.nextLine();

            boolean bookFound = false;
            for(Book b : books){
                if(b.getTitle().equalsIgnoreCase(bookName)){
                    System.out.println("Book Found: " + b);
                    bookFound = true;
                    break;
                }
            }
            if(!bookFound){
                System.out.println("Book Not Found");
            }
        }
    
    else{
        System.out.println("Getting Exit");
        sc.close();
        break;
    }
    
}
}
 }