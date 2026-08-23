import java.util.Scanner;

public class Q3 {
    static void printNumbersUpToN(int n){
        for(int i = 1;i<=n;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printNumbersUpToN(n);
    }
    
}
