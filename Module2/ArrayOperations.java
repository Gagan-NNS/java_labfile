import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int sum = 0;

        System.out.println("Enter 10 integers:");

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int largest = arr[0];
        int smallest = arr[0];

        for(int i = 1; i < 10; i++) {
            if(arr[i] > largest)
                largest = arr[i];

            if(arr[i] < smallest)
                smallest = arr[i];
        }

        System.out.println("Sum = " + sum);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);

        sc.close();
    }
}
