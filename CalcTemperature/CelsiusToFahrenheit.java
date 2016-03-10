package Temperature;

import java.util.Scanner;

/**
 * Created by andrew on 10.03.16.
 */
public class CelsiusToFahrenheit {
    static double FahrenheitTemperature(double degreeCelsius) {
        double degreeFahrenheit;
        degreeFahrenheit = degreeCelsius * 9 / 5 + 32;
        return degreeFahrenheit;
    }

    public static void main(String[] args) {
        System.out.print("Введите температуру в градусах Цельсия:");
        Scanner sc = new Scanner(System.in);
        double degreeCelsius = sc.nextDouble();
        System.out.println(FahrenheitTemperature(degreeCelsius));
    }
}