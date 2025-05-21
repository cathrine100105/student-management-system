import java.util.ArrayList;
import java.util.Scanner;

class student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("How many students do you want to add: ");
        int n = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine(); 

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("Course: ");
            String course = input.nextLine();

            Student s = new Student(id, name, age, course);
            students.add(s);
        }

        System.out.print("\nEnter student ID to search: ");
        int searchId = input.nextInt();

        boolean found = false;
        for (Student s : students) {
            if (s.getId() == searchId) {
                System.out.println("\n Student Details ");
                System.out.println("ID: " + s.getId());
                System.out.println("Name: " + s.getName());
                System.out.println("Age: " + s.getAge());
                System.out.println("Course: " + s.getCourse());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + searchId + " not found.");
        }

        input.close();
    }
}