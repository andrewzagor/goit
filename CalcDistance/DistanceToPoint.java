package Distance;

import java.util.Scanner;
import static java.lang.Math.*;

/**
 * Created by andrew on 10.03.16.
 */
public class DistanceToPoint {
    static double DistancePoint (double xa, double ya, double xb, double yb){
        double distance;
        distance=sqrt(pow((xb-xa),2)+pow((yb-ya),2));
        return distance;
    }

    public static void main(String[] args)
    {
        System.out.print("Введите координату x первой точки:");
        Scanner sc = new Scanner(System.in);
        double  xa = sc.nextDouble();
        System.out.print("Введите координату y первой точки:");
        Scanner sc1 = new Scanner(System.in);
        double  ya = sc1.nextDouble();
        System.out.print("Введите координату x второй точки:");
        Scanner sc2 = new Scanner(System.in);
        double  xb = sc2.nextDouble();
        System.out.print("Введите координату y второй точки:");
        Scanner sc3 = new Scanner(System.in);
        double  yb = sc3.nextDouble();
        System.out.println( DistancePoint(xa,xb,ya,yb) );
    }
}
