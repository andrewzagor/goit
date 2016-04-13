package SquareCalc;

import java.util.Scanner;

/**
 * Created by ZahornyiAI on 13.04.2016.
 */
public class FahrenheitToCelsius {
    static double celsiusTemperature(double degreeFahrenheit) {
        double degreeCelsius;
        degreeCelsius = (degreeFahrenheit-32) * 5/9 ;
        return degreeCelsius;
    }

    public static void main(String[] args) {
        System.out.print("Введите температуру в градусах Фаренгейта:");
        Scanner sc = new Scanner(System.in);
        double degreeFahrenheit = sc.nextDouble();
        System.out.println(celsiusTemperature(degreeFahrenheit));
    }
}
