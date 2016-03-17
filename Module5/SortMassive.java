package Massive;

/**
 * Created by ZahornyiAI on 17.03.2016.
 */
public class SortMassive {
    public static void main(String[] args) {
        int[] mas1 = {435, 958, 324, 675, 857, 123, 215, 375, 656, 585};
        for (int i = mas1.length - 1; i >= 0; i--) {
            boolean sort = true;
            for (int j = 0; j < i; j++) {
                if (mas1[j] > mas1[j+1]) {
                    int temp = mas1[j];
                    mas1[j] = mas1[j+1];
                    mas1[j+1] = temp;
                    sort = false;
                }
            }
            System.out.println(mas1[i]);
        }
}
}