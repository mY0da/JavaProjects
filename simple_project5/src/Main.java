//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CoinConverter converter = new CoinConverter();
        converter.dollarToRealConverter(50);

        RectangularRoomCalculus calculator = new RectangularRoomCalculus();
        calculator.areaCalculation(5, 8);
        calculator.perimeterCalculation(5, 8);

        MultiplicationTable table = new MultiplicationTable();
        table.showTable(7);

        StandardTemperatureConverter tempConverter = new StandardTemperatureConverter();
        double celsiusTemperature = 25;
        double fahrenheitTemperature = tempConverter.celsiusToFahrenheit(celsiusTemperature);
        System.out.println(celsiusTemperature + " Celsius is equal to " + fahrenheitTemperature + " Fahrenheit.");

        fahrenheitTemperature = 77;
        celsiusTemperature = tempConverter.fahrenheitToCelsius(fahrenheitTemperature);
        System.out.println(fahrenheitTemperature + " Fahrenheit is equal to " + celsiusTemperature + " Celsius.");
    }
}