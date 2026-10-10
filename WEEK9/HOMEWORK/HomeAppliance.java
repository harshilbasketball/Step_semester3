
import java.util.Scanner;

abstract class Appliance {
    String name;
    double power;

    Appliance(String name, double power) {
        this.name = name;
        this.power = power;
    }

    boolean supportsSaver() {
        return false;
    }

    double calculateUnits(double hours, boolean saver) {
        double units = power * hours / 1000;

        if (saver && supportsSaver()) {
            units = units * 0.75;
        }

        return units;
    }
}

class Fridge extends Appliance {
    Fridge() {
        super("FRIDGE", 150);
    }
}

class AC extends Appliance {
    AC() {
        super("AC", 1500);
    }

    boolean supportsSaver() {
        return true;
    }
}

class TV extends Appliance {
    TV() {
        super("TV", 100);
    }
}

class Washer extends Appliance {
    Washer() {
        super("WASHER", 500);
    }

    boolean supportsSaver() {
        return true;
    }
}

public class HomeAppliance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double totalCost = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double hours = sc.nextDouble();

            boolean saver = false;

            if (sc.hasNext("SAVER")) {
                sc.next();
                saver = true;
            }

            Appliance a;

            switch (type) {
                case "FRIDGE":
                    a = new Fridge();
                    break;
                case "AC":
                    a = new AC();
                    break;
                case "TV":
                    a = new TV();
                    break;
                case "WASHER":
                    a = new Washer();
                    break;
                default:
                    continue;
            }

            if (saver && !a.supportsSaver()) {
                System.out.println(type + ": saver mode not supported");
            } else {
                double units = a.calculateUnits(hours, saver);
                double cost = units * 8;

                System.out.printf("%s: Units=%.2f Cost=%.2f%n",
                        type, units, cost);

                totalCost += cost;
            }
        }

        System.out.printf("Total Cost: %.2f%n", totalCost);
        sc.close();
    }
}

