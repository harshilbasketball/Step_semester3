class Public_Transport {
    int n ;
    String type;
    double distance;
    double PeakHouseFactor;
    double total;

    Public_Transport(String type,double distance,double total){
        this.type = type;
        this.distance = distance;
        this.total = total;
        this.PeakHouseFactor = 0;

    }
    Public_Transport(String type,double distance,double total,double PeakHouseFactor){
        this.type = type;
        this.distance = distance;
        this.total = total;
        this.PeakHouseFactor = PeakHouseFactor;

    }

    double CalculatedFare(){
        double fare = 0;
        if(type.equals("BUS")){
            fare = 2 + 0.10*distance;
        }else if(type.equals("Train")){
            fare = 3 + (0.15*distance);
        }else{
            fare = (1.50 + 0.20*distance)*PeakHouseFactor;
        }
        total = fare;
        return total;
    }}

    public class PublicTransport{
        public static void main(String[] args) {
            Public_Transport p1 = new Public_Transport("BUS", 15, 0);
            Public_Transport p2 = new Public_Transport("Train", 50, 0);
            Public_Transport p3 = new Public_Transport("METRO", 10, 0 , 1.5);

            p1.CalculatedFare();
            p2.CalculatedFare();
            p3.CalculatedFare();

            double fare1 = p1.CalculatedFare();
            double fare2 = p2.CalculatedFare();
            double fare3 = p3.CalculatedFare();

            System.out.println("Bus: " + fare1);
            System.out.println("Train: " + fare2);
            System.out.println("Metro: " + fare3);
            

        }

    }


    

