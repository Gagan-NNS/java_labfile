public class NestedTryCatch {
    public static void main(String[] args) {

        try {
            int arr[] = {10, 20, 30};

            try {
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Invalid Array Index");
            }

            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: Division by Zero");
        }
    }
}
