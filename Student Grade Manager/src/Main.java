import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        GradeManager manager = new GradeManager();
        boolean running = true;

        while (running){
            System.out.println("\n---Student Grade Manager---");
            System.out.println("1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Add Grade");
            System.out.println("4. Show Student Details");
            System.out.println("5. Show Top Student");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Add student name: ");
                    String name = scanner.nextLine();
                    if (name.matches("\\d+")) {
                        System.out.println("Invalid name! Cannot be a number.");
                        break;
                    }
                    manager.addStudent(name);
                    break;

                case 2:
                    manager.showAllStudents();
                    break;

                case 3:
                    if (manager.getStudentCount() == 0) {
                        System.out.println("No students available. Add a student");
                        break;
                    }

                    manager.showAllStudents();
                    System.out.println("Select student number: ");
                    int studentNumber = scanner.nextInt();

                    System.out.println("Enter grade: ");
                    int grade = scanner.nextInt();
                    manager.addGradeToStudent(studentNumber, grade);
                    break;

                case 4:
                    if (manager.getStudentCount() == 0) {
                        System.out.println("No students available. Add a student");
                        break;
                    }

                    manager.showAllStudents();
                    System.out.println("Enter student number: ");
                    int detailNumber = scanner.nextInt();

                    manager.showStudentDetails(detailNumber);
                    break;

                case 5:
                    manager.topStudent();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again!");
            }
        }
        scanner.close();
    }

}
