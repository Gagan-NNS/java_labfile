import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;

        System.out.println("Enter marks of 5 students:");

        for(int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        int highest = marks[0];

        for(int i = 1; i < 5; i++) {
            if(marks[i] > highest)
                highest = marks[i];
        }

        System.out.println("Average = " + (sum / 5.0));
        System.out.println("Highest Marks = " + highest);

        sc.close();
    }
}
