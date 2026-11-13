import java.util.*;
public class DiceTheory {
    public static int[] diceSort(int[] rolls){
        int[] count  = new int[7];

        for(int i =0;i<rolls.length;i++){
            count[rolls[i]]++;

        }
        System.out.println("Counts: ");

        for(int i = 1 ; i<=6 ; i++){
            System.out.println(i + ":" + count[i] + " ");
        }

        int[] result = new int[rolls.length];

        int index = 0;

        for(int i = 1;i<=6;i++){
            for(int j = 0;i<count[i];i++){
                result[index] = i;
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] rolls = new int[n];

        for(int i = 0;i<n;i++){
            rolls[i] = input.nextInt();
        }
        int[] result = diceSort(rolls);

        System.out.println("\nSorted: " + Arrays.toString(result));

    }
    
}
