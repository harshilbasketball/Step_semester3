import java.util.*;
public class Removeduplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] nums = new int[n];

        for(int i = 0;i<n;i++){
            nums[i] = input.nextInt();
        }
        int k = 1;

        for(int j = 1;j<n;j++){
            if(nums[j] != nums[k-1]){
                nums[k] = nums[j];
                k++;

            }

        }
        System.out.println("Length = " + k);
        System.out.print("Array = ");

        for(int i = 0;i<k;i++){
            System.out.println(nums[i] + " ");
        }
    }
    
}
