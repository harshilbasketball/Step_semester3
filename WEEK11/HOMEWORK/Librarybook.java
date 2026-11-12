import java.util.*;
public class Librarybook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of books: ");
        int n = input.nextInt();
        
        int[] books = new int[n];

        System.out.println("Enter book numbers: ");
        for(int i =0;i<n;i++){
            books[i] = input.nextInt();

        }
        shelf(books);

        
    }
    static void shelf(int[] books){
        for(int i =1;i<books.length;i++){
            int key = books[i];
            int j = i-1;

            while(j>=0 && books[j] > key){
                books[j+1] = books[j];
                j--;
            }
            books[j+1] = key;
            System.out.println("After Placing " + key + ": " + Arrays.toString(books));
        }
    }
    
}
