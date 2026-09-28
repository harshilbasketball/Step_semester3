class Canteen{
    int n;
    String type;
    double amount;
    double total;

    Canteen(String type,double amount){
        this.type = type;
        this.amount = amount;
        
    }
    double Amount(){
        double cost = 0;
        if(type.equals("STUDENT")){
            cost = amount - (amount*0.10);
        }else if(type.equals("STAFF")){
            cost = amount - (amount*0.05);
        }else{
            cost = amount + 10;
        }
        return cost;
    }
}
public class Canteen_price{
    public static void main(String[] args) {
        Canteen c1 = new Canteen("STUDENT" , 200);
        Canteen c2 = new Canteen("STAFF" , 300);
        Canteen c3 = new Canteen("GUEST" , 150);
        

        double cost1 = c1.Amount();
        double cost2 = c2.Amount();
        double cost3 = c3.Amount();
        double total = cost1 + cost2 + cost3;

        System.out.println("STUDENT: " +cost1);
        System.out.println("STAFF: " +cost2);
        System.out.println("GUEST: " +cost3);
        System.out.println("TOTAL: " + total);
    }

}
