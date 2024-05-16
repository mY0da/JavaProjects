import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("file.txt");
        writer.write("Content to be written in file.");
        writer.close();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Title title = new Title("Matrix", 1999);
        String json = gson.toJson(title);
        System.out.println(json);

        Vehicle car = new Vehicle("Subaru", "Impreza 22B", 1998, 116500.00);
        String jsonVehicle = gson.toJson(car);
        System.out.println(jsonVehicle);
    }
}