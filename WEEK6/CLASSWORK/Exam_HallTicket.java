class HallTicket {
    String studentName;
    int seatNumber;

    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class Exam_HallTicket {
    public static void main(String[] args) {
        HallTicket h1 = new HallTicket("Priya", 101);

        HallTicket h2 = h1;

        h2.seatNumber = 205;

        System.out.println("Seat Number through h1: " + h1.seatNumber);
        System.out.println("h1 == h2: " + (h1 == h2));

        HallTicket h3 = new HallTicket("Priya", 205);

        System.out.println("h1 == h3: " + (h1 == h3));
    }
}
