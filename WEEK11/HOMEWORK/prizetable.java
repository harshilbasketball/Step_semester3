import java.util.*;
public class prizetable {
    static int prizeTable(int[] marks){

        int n = marks.length;
        int swaps = 0;

        for(int i=0;i<n-1;i++){
            int maxIndex = i;

            for(int j = i+1;j<n;j++){
                if(marks[j] > marks[maxIndex]){
                    maxIndex = j;
                }
            }
            if(maxIndex != i){
                int temp  = marks[i];
                marks[i] = marks[maxIndex];
                marks[maxIndex] = temp;

                swaps++;
            }
        }
        return swaps;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = input.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks: ");
        for(int i= 0;i<n;i++){
            marks[i] = input.nextInt();
        }
        int swaps = prizeTable(marks);

        System.out.println("Sorted Marks: " + Arrays.toString(marks));

        System.out.println("Total Swaps = " +swaps);

    }
    
}
