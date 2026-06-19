import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new Exception("Age is below 18. Not eligible to vote.");
            }

            System.out.println("Eligible to Vote");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
