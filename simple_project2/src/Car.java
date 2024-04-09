import java.time.Year;

public class Car {
    String model;
    int year;
    String color;
    int currentYear = Year.now().getValue();

    void technicalSheet() {
        System.out.println("Car model: " + model);
        System.out.println("Car year of release: " + year);
        System.out.println("Car color: " + color);
    }

    int calculateYear() {
        return currentYear - year;
    }
}
