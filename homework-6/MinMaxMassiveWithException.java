package Exception;
import java.util.Scanner;

/**
 * Created by ZahornyiAI on 18.03.2016.
 */
public class MinMaxMassiveWithException {
    public static int MinVarFour(int a, int b, int c, int d)
    {
        int u=MinVar1(a,b);
        int k=MinVar2(c,d);
        int m;
        if (k<u)
            m=k;
        else m=u;
        return m;
    }
    public static int MinVar1(int c, int d)
    {
        int m3;
        if (c < d)
            m3 = c;
        else
            m3 = d;
        return m3;
    }
    public static int MinVar2(int a, int b)
    {
        int m2;
        if (a < b)
            m2 = a;
        else
            m2 = b;
        return m2;
    }
    public static int MaxVarFour(int a, int b, int c, int d)
    {
        int u=MaxVar1(a,b);
        int k=MaxVar2(c,d);
        int m;
        if (k<u)
            m=u;
        else m=k;
        return m;
    }
    public static int MaxVar1(int c, int d)
    {
        int m3;
        if (c < d)
            m3 = d;
        else
            m3 = c;
        return m3;
    }
    public static int MaxVar2(int a, int b)
    {
        int m2;
        if (a < b)
            m2 = b;
        else
            m2 = a;
        return m2;
    }
    public static void main(String[] args){
        int[] mas1 = {435,958,324,675};
        System.out.println("Введите порядковый номер в массиве:");
        Scanner sc = new Scanner(System.in);
            try {
                int a = sc.nextInt();
    System.out.println("Минимальное число в массиве умноженное на введенное:"+MinVarFour(mas1[0],mas1[1],mas1[2],mas1[3])*mas1[a]);
        System.out.println("Максимальное число в массиве умноженное на введенное:"+MaxVarFour(mas1[0],mas1[1],mas1[2],mas1[3]*mas1[a]));
    } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обращение по недопустимому индексу массива");
}
    }}