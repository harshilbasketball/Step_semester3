import java.util.Scanner;
public class Rotata_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num[] = new int[n];
        for(int i = 0 ; i<n;i++){
             num[i] = input.nextInt();
        }
        int k = input.nextInt();

        k = k%num.length;
        int[] newArray = new int[num.length];
        for(int i = 0 ;i <num.length;i++){
            newArray[(i + k) % num.length] = num[i];
        }
        for(int i = 0 ; i< num.length;i++){
            System.out.println(newArray[i] +" ");
        }


    }

    
}
