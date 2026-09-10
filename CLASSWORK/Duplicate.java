import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] num = new int[n];
        for(int i = 0 ; i< n; i++){
            num[i] = input.nextInt();
        }
        boolean duplicate = false;
        for(int i = 0;i<n;i++){
            for(int j = i+1;i<n;i++){
                if(num[i]==num[j]){
                    duplicate  = true;
                    break;}


            }
        if(duplicate){
            break;
        }       }
        if(duplicate){
            System.out.println("Duplicate Exists");
        }else{
            System.out.println("Duplicate doesn't exist");
        }
    }
    
}
