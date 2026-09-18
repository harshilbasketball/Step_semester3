class Course {
    String code;
    String title;
    int credits;
    int labCredits;

    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    public int totalCredits() {
        return credits + labCredits;
    }
}

public class Course_credit {
    public static void main(String[] args) {
        Course c1 = new Course("CSE101", "Data Structures", 3, 1);
        Course c2 = new Course("MAT101", "Mathematics", 4);

        System.out.println("Total Credits: " + c1.totalCredits());
        System.out.println("Total Credits: " + c2.totalCredits());
    }
}
