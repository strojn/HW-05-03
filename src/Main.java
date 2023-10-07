public class Main {
    public static void main(String[] args) {

        double celsius = 22;
        System.out.println(celsius + " градус цельсія:");

        System.out.print("- в келвінах: ");
        ConverterTemperature converterTemperature = new CelsiusToCalvin();
        converterTemperature.convert(celsius);

        System.out.print("- в фаренгейтах: ");
        converterTemperature = new CelsiusToFahrenheit();
        converterTemperature.convert(celsius);
    }
}