import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Gagan");
        names.add("Rahul");
        names.add("Amit");

        System.out.println(names);

        names.remove("Rahul");

        System.out.println("After Removal:");
        System.out.println(names);
    }
}
