import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter the Length of side :  ");
        int n = input.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1 ; j<=i;j++){
                System.out.print("* ");
            } 
        }
    }
    
}
