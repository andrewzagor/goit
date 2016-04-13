package SquareCalc;

import java.util.Scanner;

/**
 * Created by ZahornyiAI on 13.04.2016.
 */
public class TriangleSquare {
    static double triangle (double side, double high){
        double square;
        square=0.5*side*high;
        return square;
    }

    public static void main(String[] args)
    {
        System.out.print("Введите длину стороны треугольника:");
        Scanner sc = new Scanner(System.in);
        double  side = sc.nextDouble();
        System.out.print("Введите длину высоты треугольника:");
        Scanner sc1 = new Scanner(System.in);
        double  high = sc1.nextDouble();
        System.out.println( triangle(side,high) );
    }
}
