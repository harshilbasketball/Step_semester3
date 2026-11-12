import java.util.*;
public class Insertionposition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = input.nextInt();
        }
        int target = input.nextInt();
        int low = 0;
        int high = n-1;
        int ans = n;

        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid-1;

            }else{
                low = mid+1;
            }
        }
        System.out.println(ans);
    }
    
}
