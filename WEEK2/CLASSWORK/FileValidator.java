import java.util.Scanner;

class FileValidator {
    
    static String validateFileExtension(String filename) {
        int index = filename.lastIndexOf('.');

        if (index == -1) {
            return "Rejected — invalid file type";
        }

        String extension = filename.substring(index + 1);

        if (extension.equalsIgnoreCase("pdf") ||
            extension.equalsIgnoreCase("docx") ||
            extension.equalsIgnoreCase("zip")) {
            return "Accepted";
        }
        else {
            return "Rejected — invalid file type";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String filename = sc.nextLine();

        System.out.println(validateFileExtension(filename));
    }
}