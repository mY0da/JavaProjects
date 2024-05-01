import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();

        Person firstPerson = new Person("James", 25);

        Person secondPerson = new Person("Hugo", 22);

        Person thirdPerson = new Person("Pip", 21);

        Collections.addAll(peopleList, firstPerson, secondPerson, thirdPerson);
        System.out.println("The list has " + peopleList.size() + " people.");
        System.out.println("The first person in the list is " + peopleList.get(0) + ".");
        System.out.println(peopleList);
    }
}