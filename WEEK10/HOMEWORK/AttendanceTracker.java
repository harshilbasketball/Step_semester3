import java.util.Scanner;

public class AttendanceTracker {
    public static void AttendanceTracker(int[] days,int n){
        int present  = 0;
        int count = 0;
        int maxStreak = 0;
        for(int i = 0;i<n;i++){
            if(days[i] == 1){
                present++;
                count++;
                if(count > maxStreak){
                    maxStreak = count;

                }}

            else{
                count = 0;

                



            
        }}
        System.err.println("Present: " +present);
        System.err.println("Longest Streak: " +maxStreak);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number of Days: ");
        int n = input.nextInt();

        int[] days = new int[n];

        System.out.println("Enter the Attendance(either 0 or 1) :");

        for(int i = 0;i<n;i++){
            days[i] = input.nextInt();
        }
        AttendanceTracker(days,n);

    }
    
}
