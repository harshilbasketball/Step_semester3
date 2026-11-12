import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0;i<n;i++){
            System.err.println("Enter the Year: ");
            int year = input.nextInt();
            if((year % 4==0 && year%100!=0) || year%400 == 0){
                System.out.println("Leap year");
            }else{
                System.out.println("Not Leap year");
                

            }

        }
        

    }
    
}
