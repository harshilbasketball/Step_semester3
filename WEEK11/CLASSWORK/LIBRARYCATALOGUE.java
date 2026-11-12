import java.util.Scanner;
public class LIBRARYCATALOGUE {
    public static void main(String[] args) {
        String isbn[] = {"0001112223",
            "0002223334",
            "0003334445",
            "0004445556",
            "0005556667"};

        String[] title = {"Introduction to Algebra" , "Beginning python" ,  "Classic Mythology",
            "Data and Society",
            "European History"};
        Scanner input = new Scanner(System.in);
        String target = input.next();
        int low = 0;
        int high = isbn.length-1;
        boolean found = false;
        while(low<=high){
            int mid = (low+high)/2;

            int result = isbn[mid].compareTo(target);

            if(result==0){
                System.out.println(title[mid]);
                found = true;
                break;
            }else if(result<0){
                low = mid+1;

            }else{
                high = mid-1;
            }
        }
        if(!found){
            System.out.println("Not Found");
        }
    
    }

    
}
