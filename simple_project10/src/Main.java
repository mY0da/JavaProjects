import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        String jsonPerson = """
                {
                    "name" : "Gus",
                    "age" : "24",
                    "city" : "Lisbon"
                }
                """;
        Person person = gson.fromJson(jsonPerson, Person.class);
        System.out.println(person);

        Gson gson2 = new GsonBuilder().setLenient().create();
        String jsonPerson2 = """
                {
                    "name" : "Pip",
                    "city" : "Japan"
                }
                """;
        Person person2 = gson2.fromJson(jsonPerson2, Person.class);
        System.out.println(person2);

        String jsonBook = """
                {
                    "title" : "AwesomeBook",
                    "author" : "Me",
                    "publishingCompany" : {"name" : "Amazing Company", "city" : "Narnia"}
                }
                """;
        Book book = gson.fromJson(jsonBook, Book.class);
        System.out.println(book);
    }
}