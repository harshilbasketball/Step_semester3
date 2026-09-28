class Campusparking {
    String type;
    int hours;

    public Campusparking(String type, int hours) {
        this.type = type;
        this.hours = hours;
    }

    double Charge() {
        double charge = 0;

        if (type.equals("BIKE")) {
            charge = hours * 10;
        }

        else if (type.equals("CAR")) {
            charge = 30 + (hours - 1) * 20;
        }

        else if (type.equals("TRUCK")) {
            charge = hours * 50;

            if (charge < 100) {
                charge = 100;
            }
        }

        return charge;
    }
}

public class Campus_parking {
    public static void main(String[] args) {

        Campusparking c1 = new Campusparking("BIKE", 3);
        Campusparking c2 = new Campusparking("CAR", 4);
        Campusparking c3 = new Campusparking("TRUCK", 1);
        Campusparking c4 = new Campusparking("CAR", 1);

        double charge1 = c1.Charge();
        double charge2 = c2.Charge();
        double charge3 = c3.Charge();
        double charge4 = c4.Charge();

        double total = charge1 + charge2 + charge3 + charge4;

        System.out.printf("BIKE: %.2f%n", charge1);
        System.out.printf("CAR: %.2f%n", charge2);
        System.out.printf("TRUCK: %.2f%n", charge3);
        System.out.printf("CAR: %.2f%n", charge4);

        System.out.printf("Total: %.2f%n", total);
    }
}
