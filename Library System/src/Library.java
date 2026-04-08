import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(String title, String author){
        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Book Added: " + book.getTitle() + " by " + book.getAuthor());
    }

    public void showBooks(){
        if(books.isEmpty()){
            System.out.println("No books found!");
            return;
        }
        for (int i = 0; i < books.size(); i++){
            Book book = books.get(i);
            if (book.isBorrowed())
            {
                System.out.println((i+1) + ". " + books.get(i).getTitle() + " by " + books.get(i).getAuthor() + "[Borrowed]");
            } else {
                System.out.println((i+1) + ". " + books.get(i).getTitle() + " by " + books.get(i).getAuthor() + "[Available]");
            }

        }
    }
    public void borrowBook(int index){
        if(books.isEmpty()) {
            System.out.println("No books available to borrow!");
            return;
        }

        int number = index - 1;

        if (number < 0 || number >= books.size()){
            System.out.println("Invalid book number!");
            return;
        }
        Book book = books.get(number);
        /*
        instead of writing;
        books.get(number).borrowBook();
        books.get(number).getTitle(); .......
        we can store it at once using the code above and write:
        book.borrowBook(); , etc,.
         */
        if (book.isBorrowed()){
            System.out.println("That book is already borrowed!");
        } else {
            book.borrowBook();
            System.out.println("You borrowed: " + book.getTitle() + "by " + book.getAuthor());
        }

    }

    public void returnBook(int index){
        if(books.isEmpty()) {
            System.out.println("No books available to borrow!");
            return;
        }

        int number = index - 1;

        if (number < 0 || number >= books.size()){
            System.out.println("Invalid book number!");
            return;
        }
        Book book = books.get(number);

        if (!book.isBorrowed()){
            System.out.println("That book is already available!");
        } else {
            book.returnBook();
            System.out.println("You returned: " + book.getTitle() + "by " + book.getAuthor());
        }

    }
}
