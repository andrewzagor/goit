package Square;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Created by andrew on 10.03.16.
 */
public class CirleSquare {

    static double Circle(double radius) {
        double square;
        square = radius * radius * 3.14159;
        return square;
    }

    public static void main(String[] args) throws Exception {
        try {
            System.out.print("Введите радиус круга:");
            Scanner sc = new Scanner(System.in);
            double radius = sc.nextDouble();
            if (radius<=0) {
                throw new Exception("Negative varible");
            }
            System.out.println("Радиус круга равен:"+" "+Circle(radius));
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели букву, а необходимо цифру!");
        }
        catch (Exception e) {
            System.out.println("Введите число больше нуля!");
        }
    }
}