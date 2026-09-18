import java.util.HashMap;

public class Subarray_Sum {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum = prefixSum + nums[i];

            int required = prefixSum - k;

            if (map.containsKey(required)) {
                count = count + map.get(required);
            }

            if (map.containsKey(prefixSum)) {
                map.put(prefixSum, map.get(prefixSum) + 1);
            } else {
                map.put(prefixSum, 1);
            }
        }

        System.out.println("Number of subarrays = " + count);
    }
}