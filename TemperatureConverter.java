import java.util.Scanner;

public class TemperatureConverter {

    // Celsius to Fahrenheit
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Fahrenheit to Celsius
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Celsius to Kelvin
    static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Kelvin to Celsius
    static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n===== TEMPERATURE CONVERTER =====");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Temperature in Celsius: ");
                    double celsius = sc.nextDouble();

                    double fahrenheit = celsiusToFahrenheit(celsius);

                    System.out.println("Fahrenheit: " + fahrenheit);
                    break;

                case 2:
                    System.out.print("Enter Temperature in Fahrenheit: ");
                    double fah = sc.nextDouble();

                    double cel = fahrenheitToCelsius(fah);

                    System.out.println("Celsius: " + cel);
                    break;

                case 3:
                    System.out.print("Enter Temperature in Celsius: ");
                    double c = sc.nextDouble();

                    double kelvin = celsiusToKelvin(c);

                    System.out.println("Kelvin: " + kelvin);
                    break;

                case 4:
                    System.out.print("Enter Temperature in Kelvin: ");
                    double k = sc.nextDouble();

                    double cels = kelvinToCelsius(k);

                    System.out.println("Celsius: " + cels);
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
