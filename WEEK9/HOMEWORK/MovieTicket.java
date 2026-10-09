import java.util.Scanner;
abstract class Movie_Ticket{
    static final double FEE= 20;

    abstract double getPrice();

    double getAmount(int count){
        return (getPrice() + FEE)*count;
    }
}
class Regular extends Movie_Ticket{
    double getPrice(){
        return 150;

    }
}
class Premium extends Movie_Ticket{
    double getPrice(){
        return 250;

    }
}
class Recliner extends Movie_Ticket{
    double getPrice(){
        return 400;

    }
}
public class MovieTicket{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String seat = input.next();
            int count = input.nextInt();

            Movie_Ticket t;

            if(seat.equals("Regular")){
                t = new Regular();
            }else if(seat.equals("PREMIUM")){
                t = new Premium();
            }else{
                t = new Recliner();
            }
            double amount = t.getAmount(count);
            System.out.printf("%s: %.2f%n", seat, amount);
            total += amount;

            
        }
        System.out.printf("Total: %.2f%n", total);
        
    }
}