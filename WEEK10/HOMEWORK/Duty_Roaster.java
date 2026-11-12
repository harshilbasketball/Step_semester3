import java.util.Scanner;
public class Duty_Roaster {
    public static void rotateRoster(String[] names, int k,int n){
        k = k%n;
        for(int j = 0;j<n;j++){
            String last = names[n-1];

            for(int i = n-1;i>0;i--){
                names[i] = names[i-1];
            }
            names[0] = last;
        }
        


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String names[] = new String[n];

        for(int i = 0; i < n; i++){
            names[i] = input.next();
        }
        int k = input.nextInt();
        rotateRoster(names, k, n);
        for(int i = 0; i < n; i++){
            System.out.print(names[i] + " ");
        }
        System.out.println();


    }
    
}
