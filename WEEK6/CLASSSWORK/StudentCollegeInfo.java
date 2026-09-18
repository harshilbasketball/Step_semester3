class Student {
    String name;
    double attendance;

    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    Student(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    static void printCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Student Count: " + studentCount);
    }
}

public class StudentCollegeInfo {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 85);
        Student s2 = new Student("Priya", 90);

        Student.printCollegeInfo();
    }
}