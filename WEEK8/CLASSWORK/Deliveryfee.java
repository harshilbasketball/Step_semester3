class Delivery{
    String type;
    double weight;
    double distance;
    double customFee;

    public Delivery(String type,double weight, double distance) {
        this.type = type;
        this.weight = weight;
        this.distance = distance;
        this.customFee = 0;
    }
    public Delivery(String type,double weight, double distance, double customfee){
        this.type = type;
        this.weight = weight;
        this.distance = distance;
        this.customFee = customfee;
    }
    double CalculatedCost(){
        double cost = 0;

        if(type.equals("STANDARD")){
            cost = 5 + (0.50*weight) + (0.10*distance);
        }else if(type.equals("EXPRESS")){
            cost = 15 + (1.00*weight) + (0.20*distance);
        }else{
            cost = 25 + (2.00*weight) + (0.50*distance) + customFee;
        }
        return cost;

    }
    
}
public class Deliveryfee{
    public static void main(String[] args) {
        Delivery d1 = new Delivery("STANDARD" , 10,50);
        Delivery d2 = new Delivery("EXPRESS" , 5,20);
        Delivery d3 = new Delivery("INTERNATIONAL" , 20,100 , 30);
        d1.CalculatedCost();
        d2.CalculatedCost();
        d3.CalculatedCost();

        double cost1 = d1.CalculatedCost();
        double cost2 = d2.CalculatedCost();
        double cost3 = d3.CalculatedCost();

        System.out.printf("STANDARD: %.2f%n", cost1);
        System.out.printf("EXPRESS: %.2f%n", cost2);
        System.out.printf("INTERNATIONAL: %.2f%n", cost3);
        System.out.printf("TOTAL: %.2f%n", cost1 + cost2 + cost3);
    }


}
