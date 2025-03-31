package Q1;

import java.util.*;

class Temperature {
    private double celsius;

    public Temperature() {
        this.celsius = 0.0;
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public double toCelsius() {
        return celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}

public class Question_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = scanner.nextDouble();

        Temperature tempCelsius = new Temperature(celsiusInput);
        double fahrenheitOutput = tempCelsius.toFahrenheit();

        System.out.println("Temperature in Fahrenheit: " + fahrenheitOutput);

        // Part 2: Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitInput = scanner.nextDouble();

        Temperature tempFahrenheit = new Temperature();
        tempFahrenheit.setFahrenheit(fahrenheitInput);
        double celsiusOutput = tempFahrenheit.toCelsius();

        System.out.println("Temperature in Celsius: " + celsiusOutput);

    }
}
