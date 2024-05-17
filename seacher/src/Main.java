import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CepCheck cepCheck = new CepCheck();

        System.out.println("Write the CEP of the address you want to find:");
        var cep = scanner.nextLine();

        try {
            Address address = cepCheck.searchAddress(cep);
            System.out.println(address);
            FileGenerator generator = new FileGenerator();
            generator.archiveJson(address);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Ending the application");
        }

    }
}