import java.util.Scanner;
class FestivalBonus {
    String type;
    String Name;
    double MonthlySalary;

    public FestivalBonus(String type, String Name, double MonthlySalary) {
        this.type = type;
        this.Name = Name;
        this.MonthlySalary = MonthlySalary;
    }

    double Bonus() {
        double bonus = 0;
        if(type.equals("FULLTIME")){
            bonus =  MonthlySalary*0.10; 
        }else if(type.equals("PARTTIME")){
            bonus =  MonthlySalary*0.05;
        }else if(type.equals("INTERN")){
            bonus = 2000;
        }
        return bonus;
    }
    
}
public class Festival_Bonus{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FestivalBonus f1 = new FestivalBonus("FULLTIME" , "ASHA", 50000);
        FestivalBonus f2 = new FestivalBonus("PARTTIME" , "RAVI", 30000);
        FestivalBonus f3 = new FestivalBonus("INTERN" , "NEHA", 15000);

        double festival1 = f1.Bonus();
        double festival2 = f2.Bonus();
        double festival3 = f3.Bonus();
        double total =  festival1+festival2+festival3;

        System.out.println("ASHA: " + festival1);
        System.out.println("RAVI: " + festival2);
        System.out.println("NEHA: " + festival3);
        System.out.println("TOTAL BONUS: " + total);




    }
}
