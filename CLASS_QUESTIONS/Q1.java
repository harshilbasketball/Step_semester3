import java.util.Scanner;
public class Q1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        boolean isPrime = true;
        System.err.println("Enter the Number: ");
        int number = input.nextInt();
        for(int i = 2 ; i<number ; i++){
            if(number%i==0){
                isPrime = false;
                break;
            }

        }
        System.out.println("Is the Number " + number + " a Prime Number: " + isPrime);

    }
    
}
