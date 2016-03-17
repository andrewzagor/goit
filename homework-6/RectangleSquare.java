package Square;

import java.util.InputMismatchException;
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

    public static void main(String[] args) throws Exception {
        try {
        System.out.print("Введите длину первой стороны прямоугольника:");
        Scanner sc = new Scanner(System.in);
        double  side1 = sc.nextDouble();
        if (side1<=0) throw new Exception("Negative varible");
        System.out.print("Введите длину второй стороны прямоугольника:");
        Scanner sc1 = new Scanner(System.in);
        double  side2 = sc1.nextDouble();
        if (side2<=0) throw new Exception("Negative varible");
        System.out.println( "Площадь треугольника равна"+" "+Rectangle(side1,side2) );}
        catch (InputMismatchException e) {System.out.println("Вы ввели букву, а необходимо цифру!");}
        catch (Exception e) {System.out.println("Введите число больше нуля!");
    }
}}
