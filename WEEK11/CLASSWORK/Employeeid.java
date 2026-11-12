
import java.util.*;

public class Employeeid {
    static HashMap<String,String> buildLookup(
        String[] ids , String[] departments){

            HashMap<String , String> map = new HashMap<>();

            for(int i = 0;i<ids.length;i++){
                map.put(ids[i],departments[i]);
            }

            return map;



        }
        static String getDepartment(
            HashMap<String,String> map,String id){
                if(map.containsKey(id)){
                    return map.get(id);
                }
                return "Unknown";

            }
        public static void main(String[] args) {
            String[] ids = {"E245","E110","E390","E101"
            };
            String[] departments = {"Finance" , "Engineering" , "Marketing", "Engineering"};

            HashMap<String,String> lookup = buildLookup(ids,departments);

            System.out.println(getDepartment(lookup, "E390"));
            System.out.println(getDepartment(lookup, "E999"));
        }


    }

    

