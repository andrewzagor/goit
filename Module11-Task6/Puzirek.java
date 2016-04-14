package Massive;

import java.util.Arrays;

/**
 * Created by ZahornyiAI on 13.04.2016.
 */
public class Puzirek {
    public Puzirek(int[] mas) {
        for (int i = mas.length - 1; i >= 0; i--) {
            boolean sort = true;
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j+1]) {
                    int temp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = temp;
                    sort = false;
                }
            }
        }}

    public static void main(String[] args) {
        int[] mas1 = {435, 958, 324, 675, 857, 123, 215, 375, 656, 585};
        Puzirek puzirek=new Puzirek(mas1);
        String intArrayStringPuzirek;
        intArrayStringPuzirek = Arrays.toString(mas1);
        System.out.println(intArrayStringPuzirek);
    }}