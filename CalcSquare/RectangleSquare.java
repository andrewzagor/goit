package Square;

import java.util.Scanner;

/**
 * Created by andrew on 10.03.16.
 */
public class RectangleSquare {
    static double Rectangle (double side1, double side2){
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
        double  side2 = sc.nextDouble();
        System.out.println( Rectangle(side1,side2) );
    }
}
