
import java.util.Scanner;

abstract class Cab {
    static final double MIN_FARE = 100;

    abstract double getRate();

    double getFare(double km) {
        return Math.max(MIN_FARE, km * getRate());
    }
}

interface NightService {
    double getNightFare(double fare);
}

class Mini extends Cab {
    double getRate() {
        return 10;
    }
}

class Sedan extends Cab implements NightService {
    double getRate() {
        return 14;
    }

    public double getNightFare(double fare) {
        return fare * 1.20;
    }
}

class SUV extends Cab implements NightService {
    double getRate() {
        return 18;
    }

    public double getNightFare(double fare) {
        return fare * 1.20;
    }
}

public class CityCab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double km = sc.nextDouble();
            String time = sc.next();

            Cab cab;

            if (type.equals("MINI"))
                cab = new Mini();
            else if (type.equals("SEDAN"))
                cab = new Sedan();
            else
                cab = new SUV();

            if (time.equals("NIGHT") && !(cab instanceof NightService)) {
                System.out.println(type + ": night service not available");
                continue;
            }

            double fare = cab.getFare(km);

            if (time.equals("NIGHT")) {
                NightService ns = (NightService) cab;
                fare = ns.getNightFare(fare);
            }

            System.out.printf("%s: %.2f%n", type, fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
