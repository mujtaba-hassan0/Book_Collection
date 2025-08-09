
public class BookAccess{
    private static void comparePrice(Book book1 , Book book2){
        float book1Price = book1.getPrice();
        float book2Price = book2.getPrice();
        String priceCompare = "";

        if(book1Price > book2Price){
            priceCompare = book1.getTitle() + " More costs than "+ book2.getTitle();
        }
        else if( book1Price == book2Price){
            priceCompare = book1.getTitle()+ " Costs as much as "+ book2.getTitle();
        }
        else{
            priceCompare = book2.getTitle() + " More costs than "+ book1.getTitle();
        }

        System.out.println(priceCompare);
    }


    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Book 1");
        book1.setAuthor("Mujtaba");
        book1.setPrice(45.00f);

        Book book2 = new Book();
        book2.setTitle("Book 2");
        book2.setAuthor("Hassan");
        book2.setPrice(30.00f);

        System.out.println("The book 1 Object is:");
        System.out.println(book1.toString());
        System.out.println("The book 2 Object is:");
        System.out.println(book2.toString());

        comparePrice(book1, book2);
    }
}