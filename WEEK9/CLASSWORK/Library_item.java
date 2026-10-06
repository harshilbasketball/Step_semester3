import java.util.Scanner;

abstract class Libraryitem{
    String title;
    int dayslate;

    public Libraryitem(String title, int dayslate) {
        this.title = title;
        this.dayslate = dayslate;
    }

    abstract double calculatefine();
}
class Book extends Libraryitem{

    Book(String title,int dayslate){
        super(title, dayslate);
    }
    double calculatefine(){
        return dayslate*2;
    }

}
class DVD extends Libraryitem{
    DVD(String title,int dayslate){
        super(title,dayslate);
    }
    double calculatefine(){
        double fine = dayslate*5;

        if(fine>50){
            return 50;
        }
        return fine;
    }
}
class Magazine extends Libraryitem{
    
    Magazine(String title,int dayslate){
        super(title,dayslate);


    }
    @Override
    double calculatefine(){
        return dayslate;
    }
}
public class Library_item{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    Libraryitem[] items = new Libraryitem[n];


    for(int i = 0 ; i <n ;i++){
        String type = input.next();
        String title = input.next();
        int dayslate = input.nextInt();
        if(type.equals("")){
            items[i] = new Book(title,dayslate);

        }else if(type.equals("DVD")){
            items[i] = new DVD(title,dayslate);
        }else if(type.equals("MAGAZINE")){
            items[i] = new Magazine(title,dayslate);
        }
    }
    double total = 0;
    for(int i = 0 ; i<n;i++){
        double fine = items[i].calculatefine();
        System.out.printf("%s: %.2f%n" , items[i].title,fine);
        total = total+fine;
    }
    System.out.printf("Total fines: %.2f%n", total);
}}