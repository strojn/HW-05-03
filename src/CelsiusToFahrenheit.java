public class CelsiusToFahrenheit implements ConverterTemperature {
    @Override
    public void convert(double degrees) {
        System.out.println(degrees * 1.8 + 32);
    }
}
