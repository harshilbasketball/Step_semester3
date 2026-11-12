import java.util.Scanner;

public class STUDENT_GRADE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter the Number of Marks You want the grade of: ");
        int n = input.nextInt();
        for(int i = 0;i<n;i++){
        System.out.println("Enter the Marks: ");
        int marks = input.nextInt();
        if(marks >= 90){
            System.out.println("Grade O");
        }else if(marks >=75 && marks <= 89 ){
            System.out.println("Grade A+");
        }else if(marks >=60 && marks <= 74 ){
            System.out.println("Grade A");
        }else if(marks >=40 && marks <=59  ){
            System.out.println("Grade B");
        }else if( marks <= 40 ){
            System.out.println("Grade F");
        }
    }}
    
}
