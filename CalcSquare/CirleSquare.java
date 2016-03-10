package Square;
import java.util.Scanner;
/**
 * Created by andrew on 10.03.16.
 */
public class CirleSquare {

    static double Circle (double radius){
        double square;
        square=radius*radius*3.14159;
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
