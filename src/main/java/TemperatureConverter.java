import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5)+32;
        double kelvin = celsius + 273.15;
        System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
        System.out.printf("Kelvin: %.2f\n", kelvin);
        scanner.close();
    }
}
