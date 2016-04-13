package SquareCalc;

import java.util.Scanner;

/**
 * Created by ZahornyiAI on 13.04.2016.
 */
public class CelsiusToFahrenheit {
    static double fahrenheitTemperature(double degreeCelsius) {
        double degreeFahrenheit;
        degreeFahrenheit = degreeCelsius * 9 / 5 + 32;
        return degreeFahrenheit;
    }

    public static void main(String[] args) {
        System.out.print("Введите температуру в градусах Цельсия:");
        Scanner sc = new Scanner(System.in);
        double degreeCelsius = sc.nextDouble();
        System.out.println(fahrenheitTemperature(degreeCelsius));
    }
}
