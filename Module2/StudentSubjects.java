import java.util.Scanner;

public class StudentSubjects {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[3];
        int total = 0;

        System.out.println("Enter marks in 3 subjects:");

        for(int i=0;i<3;i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        sc.close();
    }
}
