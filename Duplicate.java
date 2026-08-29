import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        System.out.println(found);
    }
}
