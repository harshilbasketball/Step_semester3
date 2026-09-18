class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;

    PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord() {
        System.out.println("Student: " + studentName + " | Company: " + company
                + " | Package: " + packageLpa + " LPA");
    }
}

public class Placement_record {
    public static void main(String[] args) {
        PlacementRecord p1 = new PlacementRecord("Rahul", "TCS", 7.5);
        PlacementRecord p2 = new PlacementRecord("Priya", "Infosys", 8.0);
        PlacementRecord p3 = new PlacementRecord("Arun", "Wipro", 6.5);

        PlacementRecord[] records = {p1, p2, p3};

        for (int i = 0; i < records.length; i++) {
            records[i].printRecord();
        }
    }
}
