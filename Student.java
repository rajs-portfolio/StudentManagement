public class Student {

    int roll;
    String name;
    String course;

    public Student(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    public void display() {
        System.out.println("-------------------------");
        System.out.println("Roll   : " + roll);
        System.out.println("Name   : " + name);
        System.out.println("Course : " + course);
    }
}

