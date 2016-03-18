package Exception;

import java.util.Scanner;

/**
 * Created by ZahornyiAI on 18.03.2016.
 */
public class SortMassiveWithException {
    public static void main(String[] args){
    int[] mas1 = {5, 7, 1, 3, 6, 9, 4, 2, 8, 0};
        System.out.println("Введите порядковый номер в массиве:");
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
    for( int i = mas1.length - 1;i>=0; i--)
    {
        boolean sort = true;
        for (int j = 0; j < i; j++) {
            if (mas1[j] > mas1[j + 1]) {
                int temp = mas1[j];
                mas1[j] = mas1[j + 1];
                mas1[j + 1] = temp;
                sort = false;
            }
        }
            System.out.println(mas1[i]*mas1[a]);}}
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обращение по недопустимому индексу массива");
    }
}}