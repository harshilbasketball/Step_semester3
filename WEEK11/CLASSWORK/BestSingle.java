import java.util.*;
public class BestSingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] prices = new int[n];

        for(int i = 0;i<n;i++){
            prices[i] = input.nextInt();
        }
        int minPrice = prices[0];
        int maxprofit = 0;

        for(int i = 0;i<n;i++){
            int profit = prices[i] - minPrice;

            if(profit > maxprofit){
                maxprofit = profit;

            }
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
        }
        System.out.println(maxprofit);

    }
    
}
