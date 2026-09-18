class BookInventory {
    String title;
    String author;
    int copiesAvailable;

    BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void printEntry() {
        System.out.println("Title: " + title + " | Author: " + author
                + " | Copies Available: " + copiesAvailable);
    }
}

public class Library_Mangement {
    public static void main(String[] args) {
        BookInventory b1 = new BookInventory("The Alchemist", "Paulo Coelho", 5);
        BookInventory b2 = new BookInventory("1984", "George Orwell", 3);
        BookInventory b3 = new BookInventory("Harry Potter", "J.K. Rowling", 7);
        BookInventory b4 = new BookInventory("The Hobbit", "J.R.R. Tolkien", 4);

        BookInventory[] books = {b1, b2, b3, b4};

        for (int i = 0; i < books.length; i++) {
            books[i].printEntry();
        }
    }
}