import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Course: ");
                    String course = sc.nextLine();

                    students.add(new Student(roll, name, course));
                    System.out.println("Student Added!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No Students Found.");
                    } else {
                        for (Student s : students) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.roll == searchRoll) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found!");

                    break;

                case 4:
                    System.out.print("Enter Roll Number: ");
                    int deleteRoll = sc.nextInt();

                    boolean removed = students.removeIf(s -> s.roll == deleteRoll);

                    if (removed)
                        System.out.println("Student Deleted!");
                    else
                        System.out.println("Student Not Found!");

                    break;

                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}

