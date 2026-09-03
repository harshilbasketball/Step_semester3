public class ProductArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int n = nums.length;

        int[] answer = new int[n];

        int left = 1;

        
        for (int i = 0; i < n; i++) {
            answer[i] = left;
            left = left * nums[i];
        }

        int right = 1;

       
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }

      
        for (int i = 0; i < n; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
    

