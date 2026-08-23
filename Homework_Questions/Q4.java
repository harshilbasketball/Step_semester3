import java.util.Scanner;
public class Q4 {
    static void classifyWithAttendance(int marks , int attendance){
        boolean elgible = marks>=40 &&  attendance >= 75;
        if(marks<40||attendance<75){
            System.out.println("The Student is detained");
        }
        if(marks >= 90){
            System.out.println("GRADE: A");


        }else if(marks >=75 && marks <=89){
            System.out.println("Grade: B");
        }else if(marks >= 60 && marks <=74){
            System.out.println("Grade: C");
        }else if(marks>=40 && marks <= 59){
            System.out.println("Grade : D");
        }else{
            System.out.println("Failed");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        int attendance = input.nextInt();
        classifyWithAttendance(marks, attendance);
        }
    }
    

