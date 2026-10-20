import java.util.Scanner;

class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
