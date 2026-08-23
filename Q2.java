
import java.util.Scanner;



public class Q2 {
    static void classifyNumber(int number){
        if(number > 0){
            System.out.println("Positive Number ");
        }else if(number == 0){
            System.out.println("The Number is Zero");
        }else{
            System.out.println("The Number is Negative");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        classifyNumber(number);
    }
    
}