import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade){
        grades.add(grade);

    }

    public String getName(){
        return name;
    }

    public void displayGrades(){
        System.out.println(grades);
    }

    public double getAverage(){
        int sum = 0;

        for (int grade : grades){
            sum += grade;
        }
        return (double) sum / (grades.size());
    }
    public int getHighestGrade(){

        if(grades.isEmpty()){
            return 0;
        }
        int highest = grades.get(0);

        for (int grade : grades){
            if (grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public void displayStudentDetails(){
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + getAverage());
        System.out.println("Highest: " + getHighestGrade());
    }
}
