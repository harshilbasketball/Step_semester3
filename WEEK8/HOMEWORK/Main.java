import java.util.*;

class Subscriber {
    String plan;
    String name;
    String date;

    Subscriber(String plan, String name, String date) {
        this.plan = plan;
        this.name = name;
        this.date = date;
    }

    void renew() {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]) - 1;
        int day = Integer.parseInt(parts[2]);

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);

        if (plan.equals("BASIC"))
            cal.add(Calendar.DAY_OF_MONTH, 30);
        else if (plan.equals("STANDARD"))
            cal.add(Calendar.DAY_OF_MONTH, 90);
        else if (plan.equals("PREMIUM")) {
            cal.add(Calendar.DAY_OF_MONTH, 365);
            
        }
            cal.add(Calendar.DAY_OF_MONTH, 365);

        System.out.printf("%s: %04d-%02d-%02d%n",
                name,
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.DAY_OF_MONTH));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String plan = sc.next();
            String name = sc.next();
            String date = sc.next();

            Subscriber s = new Subscriber(plan, name, date);
            s.renew();
        }
    }
}