package Square;

import java.util.InputMismatchException;
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
    {   try {
        System.out.print("Введите длину стороны треугольника:");
        Scanner sc = new Scanner(System.in);
        double  side = sc.nextDouble();
        if (side<=0) throw new Exception("Negative varible");
        System.out.print("Введите длину высоты треугольника:");
        Scanner sc1 = new Scanner(System.in);
        double  high = sc1.nextDouble();
        if (high<=0) throw new Exception("Negative varible");
        System.out.println("Площадь треугольника равняется"+" "+ Triangle(side,high) );}
        catch (InputMismatchException e) {System.out.println("Вы ввели букву, а необходимо цифру!");}
        catch (Exception e) {System.out.println("Введите число больше нуля!");}
    }
}
