package Square;

import java.util.Scanner;

/**
 * Created by andrew on 10.03.16.
 */
public class TriangleSquare {
    static double Triangle (double side, double high){
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
        double  high = sc.nextDouble();
        System.out.println( Triangle(side,high) );
    }
}
