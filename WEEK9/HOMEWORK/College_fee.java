import java.util.Scanner;
abstract class  Student{
    static final double TRANSPORT = 12000;
    String name;

    public Student(String name) {
        this.name = name;
    }

    abstract double getTuition();

    double getExtraFee() {
        return 0;
    }

    boolean usesBus() {
        return false;
    }

    double getTotalFee() {
        double total = getTuition() + getExtraFee();

        if (usesBus())
            total += TRANSPORT;

        return total;
    }
}

class DayScholar extends Student {
    DayScholar(String name) {
        super(name);
    }

    double getTuition() {
        return 40000;
    }

    boolean usesBus() {
        return true;
    }
}

class Hosteller extends Student {
    Hosteller(String name) {
        super(name);
    }

    double getTuition() {
        return 40000;
    }

    double getExtraFee() {
        return 60000;
    }
}

class Scholar extends Student {
    Scholar(String name) {
        super(name);
    }

    double getTuition() {
        return 20000;
    }

    boolean usesBus() {
        return true;
    }
}

public class College_fee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double totalCollected = 0;

        for(int i = 0;i<n;i++){
            String type = input.next();
            String name = input.next();

            Student s;

            if(type.equals("DAY_SCHOLAR")){
                s = new DayScholar(name);
            }else if(type.equals("HOSTELLER")){
                s = new Hosteller(name);
            }else{
                s = new Scholar(name);
            }
            double fee = s.getTotalFee();

            System.out.printf("%s: %.2f%n" , name,fee);
            totalCollected += fee;

        }
        System.out.printf("Total Collected:  %.2f%n" , totalCollected);
    }
    
}
