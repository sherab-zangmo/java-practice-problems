import java.util.ArrayList;

public class GradeManager {
    private ArrayList<Student> students;

    public GradeManager(){
        students = new ArrayList<>();
    }

    public void addStudent(String name){
        Student student = new Student(name);
        students.add(student);
        System.out.println("Student added: " + student.getName());

    }
    public void showAllStudents(){

        if(students.isEmpty()){
            System.out.println("No students found.");
            return;
        }
        for (int i = 0; i < students.size(); i++){
            System.out.println((i+1) + ". " + students.get(i).getName());
        }

    }
    public void addGradeToStudent(int studentNumber, int grade){
        int index = studentNumber - 1;

        Student student = students.get(index);
        student.addGrade(grade);

        System.out.println("Student: " + student.getName());
        System.out.println("Grade added: " + grade);

    }

    public int getStudentCount() {
        return students.size();
    }

    public void showStudentDetails(int studentNumber){
        int index = studentNumber - 1;
        Student student = students.get(index);

        student.displayStudentDetails();
    }

    public void topStudent(){
        if(students.isEmpty()){
            System.out.println("No Students Available");
            return;

        }
        Student top = students.get(0);

        for (Student s : students){
            if(s.getAverage() > top.getAverage() ){
                top = s;
            }
        }

        System.out.println("Top Student: " + top.getName());
        System.out.println("Average: " + top.getAverage());
    }
}

