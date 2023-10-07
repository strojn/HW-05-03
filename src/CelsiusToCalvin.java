public class CelsiusToCalvin implements ConverterTemperature {
    @Override
    public void convert(double degrees) {
        System.out.println(degrees + 273.15);
    }
}
