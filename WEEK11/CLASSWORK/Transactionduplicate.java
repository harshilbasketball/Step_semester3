import java.util.*;
public class Transactionduplicate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] ids = new String[n];

        for(int i = 0;i<n;i++){
            ids[i] = input.next();
        }
        HashSet<String> set = new HashSet<>();
        boolean duplicate = false;

        for(int i = 0;i<n;i++){
            if(set.contains(ids[i])){
                duplicate = true;
                break;
            }
            set.add(ids[i]);
        }
        System.out.println(duplicate);

    }
    
}
