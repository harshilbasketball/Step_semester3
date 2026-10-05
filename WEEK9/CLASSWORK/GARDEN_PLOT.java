import java.util.Scanner;

abstract class GARDEN_PLOT {
    String owner;

    GARDEN_PLOT(String owner) {
        this.owner = owner;
    }

    abstract double area();
    abstract String shape();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        GARDEN_PLOT[] plot = new GARDEN_PLOT[n];

        for (int i = 0; i < n; i++) {
            String type = input.next();
            String owner = input.next();

            if (type.equals("CIRCLE")) {
                double radius = input.nextDouble();
                plot[i] = new Circle(owner, radius);
            } else if (type.equals("RECTANGLE")) {
                double length = input.nextDouble();
                double width = input.nextDouble();
                plot[i] = new Rectangle(owner, length, width);
            } else if (type.equals("TRIANGLE")) {
                double height = input.nextDouble();
                double base = input.nextDouble();
                plot[i] = new Triangle(height, base, owner);
            }
        }
    }
}

class Circle extends GARDEN_PLOT {
    double radius;

    Circle(String owner, double radius) {
        super(owner);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    String shape() {
        return "CIRCLE";
    }
}

class Rectangle extends GARDEN_PLOT {
    double length;
    double width;

    Rectangle(String owner, double length, double width) {
        super(owner);
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    String shape() {
        return "RECTANGLE";
    }
}

class Triangle extends GARDEN_PLOT {
    double height;
    double base;

    public Triangle(double height, double base, String owner) {
        super(owner);
        this.height = height;
        this.base = base;
    }

    double area() {
        return 0.5 * height * base;
    }

    String shape() {
        return "TRIANGLE";
    }
}