import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library lib = new Library();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Welcome to our Library! Please choose one of the following options: ");
            System.out.println("1. Show books");
            System.out.println("2. Add book");
            System.out.println("3. Borrow book");
            System.out.println("4. Return book");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    lib.showBooks();
                    break;

                case 2:
                    System.out.print("Enter the title of the book: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author of the book: ");
                    String author = scanner.nextLine();

                    lib.addBook(title, author);
                    break;

                case 3:
                    System.out.println("Enter book number to borrow: ");
                    int borrow_index = scanner.nextInt();
                    lib.borrowBook(borrow_index);
                    break;

                case 4:
                    System.out.println("Enter book number to return: ");
                    int return_index = scanner.nextInt();
                    lib.borrowBook(return_index);
                    break;

                case 5:
                    isRunning = false;
                    System.out.println("Thank you for visiting our library!");
                    break;

                default:
                    System.out.println("Invalid option!");

            }

        }
    }
}