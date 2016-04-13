package SquareCalc;

import java.util.Scanner;

/**
 * Created by ZahornyiAI on 13.04.2016.
 */
public class CircleSquare {
    static double circle (double radius){
        double square;
        square=radius*radius*Math.PI;
        return square;
    }

    public static void main(String[] args)
    {
        System.out.print("Введите радиус круга:");
        Scanner sc = new Scanner(System.in);
        double  radius = sc.nextDouble();
        System.out.println( circle(radius) );
    }
}
