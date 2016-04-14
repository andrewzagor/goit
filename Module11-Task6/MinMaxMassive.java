package Massive;

/**
 * Created by ZahornyiAI on 16.03.2016.
 */
public class MinMaxMassive {
    public static int minVarFour(int a, int b, int c, int d)
    {
        int u=minVar1(a,b);
        int k=minVar2(c,d);
        int m;
        if (k<u)
            m=k;
        else m=u;
        return m;
    }
    public static int minVar1(int c, int d)
    {
        int m3;
        if (c < d)
            m3 = c;
        else
            m3 = d;
        return m3;
    }
    public static int minVar2(int a, int b)
    {
        int m2;
        if (a < b)
            m2 = a;
        else
            m2 = b;
        return m2;
    }
    public static int maxVarFour(int a, int b, int c, int d)
    {
        int u=maxVar1(a,b);
        int k=maxVar2(c,d);
        int m;
        if (k<u)
            m=u;
        else m=k;
        return m;
    }
    public static int maxVar1(int c, int d)
    {
        int m3;
        if (c < d)
            m3 = d;
        else
            m3 = c;
        return m3;
    }
    public static int maxVar2(int a, int b)
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
        System.out.println("Минимальное число в массиве:"+minVarFour(mas1[0],mas1[1],mas1[2],mas1[3]));
        System.out.println("Максимальное число в массиве:"+maxVarFour(mas1[0],mas1[1],mas1[2],mas1[3]));
    }
}
