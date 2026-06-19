public class ExceptionPropagation {

    static void method3() {
        int result = 10 / 0;
        System.out.println(result);
    }

    static void method2() {
        method3();
    }

    static void method1() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception Handled in method1");
        }
    }

    public static void main(String[] args) {
        method1();
    }
}
