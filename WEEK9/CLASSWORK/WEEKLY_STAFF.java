import java.util.Scanner;

abstract class WEEKLYSTAFF{
    String name;

    WEEKLYSTAFF(String name){
        this.name = name;

    }
    abstract double calculatePay();
}

class Fulltime extends WEEKLYSTAFF{
    double weeklySalary;

    Fulltime(double weeklySalary , String name){
        super(name);
        this.weeklySalary = weeklySalary;
    }
    double calculatePay(){
        return weeklySalary;
    }
}
class Hourly extends WEEKLYSTAFF{
    double hours;
    double rate;

    Hourly(String name,double hours , double rate){
        super(name);
        this.hours = hours;
        this.rate =rate;
    }
    double calculatePay(){
        if(hours<=40){
            return hours*rate;
        }else{
            return 40*rate + (hours-40)*rate*1.5;
        }
    }
}
class Intern extends WEEKLYSTAFF{
    double stipend;

    Intern(String name,double stipend){
        super(name);
        this.stipend = stipend;
    }
    double calculatePay(){
        return stipend;
    }

    
}

public class WEEKLY_STAFF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        WEEKLYSTAFF[] staff = new WEEKLYSTAFF[n];

        for(int i = 0 ; i< n ;i++){
            String type = input.next();

            if(type.equals("FULLTIME")){
                String name = input.next();
                double salary = input.nextDouble();

                staff[i] = new Fulltime(salary,name);
            }else if(type.equals("HOURLY")){
                String name = input.next();
                double hours = input.nextDouble();
                double rate = input.nextDouble();

                staff[i] = new Hourly(name,hours,rate);


            }else if(type.equals("INTERN")){
                String name = input.next();
                double stipend = input.nextDouble();

                staff[i] = new Intern(name,stipend);
            }else {
    System.out.println("Invalid type: " + type);
}
        }
        double total = 0;

        for(int i = 0 ; i<n;i++){
            double pay = staff[i].calculatePay();

            System.out.println("%s: %.2f%n" + staff[i].name + pay);

            total+=pay;
        }
        System.out.println("Total Payroll is %.2f%n" + total);
    }
    
}
