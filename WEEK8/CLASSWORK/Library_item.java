import java.time.LocalDate;

class Libraryitem {
    String ItemType;
    String ItemTitle;

    Libraryitem(String ItemType , String ItemTitle) {
        this.ItemType = ItemType;
        this.ItemTitle = ItemTitle;
    }
    int getDays(){
        if(ItemType.equals("BOOK")){
            return 14;
        }else if(ItemType.equals("DVD")){
            return 7;
        }else{
            return 3;
        }

    }
       void display() {
        LocalDate date = LocalDate.of(2023, 10, 26);
        LocalDate dueDate = date.plusDays(getDays());

        System.out.println(ItemTitle + ": " + dueDate);
    }
}
public class Library_item{
    public static void main(String[] args) {
        Libraryitem l1 = new Libraryitem("BOOK" , "1984");
        Libraryitem l2 = new Libraryitem("DVD" , "THE MATRIXX");
        Libraryitem l3 = new Libraryitem("MAGAZINES" , "FORBES ISSUE 500");
        l1.getDays();
        l2.getDays();
        l3.getDays();
        l1.display();
        l2.display();
        l3.display();
    }



}

    
    

