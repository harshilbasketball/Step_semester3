
import java.util.Scanner;

public class Examscore{

    public static int lowerBound(int[] scores, int low) {
        int i = 0;
        int j = scores.length;

        while (i < j) {
            int mid = i + (j - i) / 2;

            if (scores[mid] >= low) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }

        return i;
    }

    public static int upperBound(int[] scores, int high) {
        int i = 0;
        int j = scores.length;

        while (i < j) {
            int mid = i + (j - i) / 2;

            if (scores[mid] > high) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }

        return i;
    }

    public static int countInBand(int[] scores, int low, int high) {
        int first = lowerBound(scores, low);
        int last = upperBound(scores, high);

        return last - first;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int low = sc.nextInt();
        int high = sc.nextInt();

        System.out.println(countInBand(scores, low, high));
    }
}

