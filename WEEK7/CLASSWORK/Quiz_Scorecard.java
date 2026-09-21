class Scorecard {
    private boolean[] results;
    private int count;
    private int score;

    Scorecard(int totalQuestions) {
        results = new boolean[totalQuestions];
        count = 0;
        score = 0;
    }

    void recordAnswer(boolean correct) {
        if (count < results.length) {
            results[count] = correct;

            if (correct) {
                score++;
            }

            count++;
        }
    }

    int getScore() {
        return score;
    }
}

public class Quiz_Scorecard {
    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println(sc.getScore());
    }
}
