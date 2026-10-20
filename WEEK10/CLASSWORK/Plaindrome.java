
    
import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        String reversed = sb.toString();

        if (word.equals(reversed)) {
            System.out.println(reversed + " - palindrome");
        } else {
            System.out.println(reversed + " - not a palindrome");
        }

        sc.close();
    }
}

    

