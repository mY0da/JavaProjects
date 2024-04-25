public class StandardTemperatureConverter implements TempConverter {
    @Override
    public double celsiusToFahrenheit(double celsiusTemperature) {
        return (celsiusTemperature * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) * 5 / 9;
    }
}
