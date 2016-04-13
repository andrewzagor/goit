package SquareCalc;

import java.util.Scanner;

/**
 * Created by ZahornyiAI on 13.04.2016.
 */
public class RectangleSquare {
    static double rectangle (double side1, double side2){
        double square;
        square=side1*side2;
        return square;
    }

    public static void main(String[] args)
    {
        System.out.print("Введите длину первой стороны прямоугольника:");
        Scanner sc = new Scanner(System.in);
        double  side1 = sc.nextDouble();
        System.out.print("Введите длину второй стороны прямоугольника:");
        Scanner sc1 = new Scanner(System.in);
        double  side2 = sc1.nextDouble();
        System.out.println( rectangle(side1,side2) );
    }
}
