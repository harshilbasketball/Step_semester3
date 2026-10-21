import java.util.Scanner;
public class Digitsum_Numberreversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int reverse = 0;
        while(n>0){
            int digit = n %10;
            sum = sum+digit;
            reverse = reverse*10 + digit;
            n = n/10;
        }
        System.out.println("Sum: " +sum);
        System.out.println("Reverse: " +reverse);
    }
    
}
