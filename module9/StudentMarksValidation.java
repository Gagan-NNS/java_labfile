import java.util.Scanner;

public class StudentMarksValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new Exception("Marks must be between 0 and 100.");
            }

            System.out.println("Valid Marks: " + marks);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
