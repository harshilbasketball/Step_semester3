import java.util.Scanner;

abstract class Travel {
    double distance;

    static final double BOOKING_FEE = 50;

    Travel(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    double calculateTotal() {
        return calculateFare() + BOOKING_FEE;
    }
}

class Bus extends Travel {

    Bus(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 2;
    }
}

class Train extends Travel {

    Train(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 1.5;
    }
}

class Flight extends Travel {

    Flight(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 2500 + distance * 4;
    }
}

public class TRAVEL_BOOKING {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Travel[] bookings = new Travel[n];

        for (int i = 0; i < n; i++) {
            String mode = input.next();
            double distance = input.nextDouble();

            if (mode.equals("BUS")) {
                bookings[i] = new Bus(distance);

            } else if (mode.equals("TRAIN")) {
                bookings[i] = new Train(distance);

            } else if (mode.equals("FLIGHT")) {
                bookings[i] = new Flight(distance);
            }
        }

        for (int i = 0; i < n; i++) {
            double total = bookings[i].calculateTotal();

            System.out.printf("%s: %.2f%n",
                    getMode(bookings[i]), total);
        }
    }

    static String getMode(Travel travel) {
        if (travel instanceof Bus) {
            return "BUS";
        } else if (travel instanceof Train) {
            return "TRAIN";
        } else {
            return "FLIGHT";
        }
    }
}
