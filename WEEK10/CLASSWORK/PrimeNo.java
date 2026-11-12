import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter the Number of Numbers to check");
        int n = input.nextInt();
        for(int j = 0;j<n;j++){
        System.err.println("Enter the Number:  ");
        int m = input.nextInt();
        int i;
        for(i = 2;i< m;i++){
            if(m % i==0){   
                break;
            

            }
        }
        if(i==m){
            System.out.println(m+" Prime No.");

        }else{
            System.out.println(m+" Not Prime No.");

        }
    
    }

    
    }
    
}
