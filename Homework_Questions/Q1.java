
import java.util.Scanner;


public class Q1 {
    static void checkingEligibilitytoVote(int age){
        boolean eligible = age>=18;
        if(eligible){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        checkingEligibilitytoVote(age);
    }

    

    
}
