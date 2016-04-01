package Antipattern;
import java.util.Scanner;

/**
 * Created by ZahornyiAI on 01.04.2016.
 */
public class CircleSquare {
    static double Circle (double radius){
        double square;
        square=radius*radius*3.14159; // Антипаттерн Magic numbers, необходио использовать Math.PI
        return square;
    }

    public static void main(String[] args)
    {
        System.out.print("Введите радиус круга:");
        Scanner sc = new Scanner(System.in);
        double  radius = sc.nextDouble();
        System.out.println( Circle(radius) );

    }
}
