class QuestionGrader {

    double mcq(String correct, String student, double points) {
        if (correct.equals(student)) {
            return points;
        }
        return 0;
    }

    double tf(String correct, String student, double points) {
        if (correct.equals(student)) {
            return points;
        }
        return 0;
    }

    double essay(String correct, String student, double points) {

        String[] keywords = correct.split(",");
        String answer = student.toLowerCase();

        int count = 0;

        for (String keyword : keywords) {
            keyword = keyword.trim().toLowerCase();

            if (answer.contains(keyword)) {
                count++;
            }
        }

        if (count >= 2) {
            return points * 0.75;
        }
        else if (count == 1) {
            return points * 0.50;
        }
        else {
            return 0;
        }
    }
}

public class EXAMINATION {
    public static void main(String[] args) {

        QuestionGrader q = new QuestionGrader();

        double score1 = q.mcq("Paris", "Paris", 10);

        double score2 = q.tf("False", "True", 5);

        double score3 = q.essay(
            "Inheritance, Polymorphism, Encapsulation",
            "Polymorphism is one.",
            20
        );

        double score4 = q.essay(
            "Abstraction, Composition",
            "I talked about abstraction.",
            15
        );

        double total = score1 + score2 + score3 + score4;

        System.out.printf("MCQ: %.2f%n", score1);
        System.out.printf("TF: %.2f%n", score2);
        System.out.printf("ESSAY: %.2f%n", score3);
        System.out.printf("ESSAY: %.2f%n", score4);
        System.out.printf("Total Score: %.2f%n", total);
    }
}