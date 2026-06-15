public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");

        System.out.println(sb);

        sb.insert(5, "Language ");

        System.out.println(sb);

        sb.replace(0, 4, "Advanced");

        System.out.println(sb);
    }
}
