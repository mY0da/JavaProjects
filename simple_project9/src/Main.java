import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        Collections.addAll(ints, 1, 7, 5, 99, 36, 2);
        System.out.println("\nUnordered list: " + ints);
        Collections.sort(ints);
        System.out.println("\nOrdered list: " + ints);

        List<Title> titles = new LinkedList<>();
        Collections.addAll(titles, new Title("Harry Potter"),
                new Title("Lord of the Rings"), new Title("Star Wars"),
                new Title("Memento"));
        System.out.println("\nUnordered list: ");
        for (Title title : titles) {
            System.out.println(title.getName());
        }
        Collections.sort(titles);
        System.out.println("\nOrdered list: ");
        for (Title title : titles) {
            System.out.println(title.getName());
        }

        List<String> polymorphicList = new ArrayList<>();
        Collections.addAll(polymorphicList, "Element 1", "Element 2", "Element 3");
        System.out.println("\nArrayList: " + polymorphicList);

        polymorphicList = new LinkedList<>();
        Collections.addAll(polymorphicList, "Element A", "Element B", "Element C");
        System.out.println("\nArrayList: " + polymorphicList);
    }
}