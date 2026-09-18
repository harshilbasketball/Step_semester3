class IdCard {
    String name;
    int booksIssued;

    IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
}

public class Library_idcard {
    public static void main(String[] args) {
        IdCard c1 = new IdCard("Ravi", 2);

        IdCard c2 = c1;

        c2.booksIssued = 5;

        System.out.println("Books Issued through c1: " + c1.booksIssued);
        System.out.println("c1 == c2: " + (c1 == c2));

        IdCard c3 = new IdCard("Ravi", 5);

        System.out.println("c1 == c3: " + (c1 == c3));
    }
}
