package PracticeModule1;

/**
 * Created by ZahornyiAI on 27.04.2016.
 */
public class FindMaxNumber {
    public int max(int[] input) {
        int max=-2147483648;
        for (int i=0; i<input.length; i++){
          if (max<input[i]) {max=input[i];}
            }
        return max;
        }

    public static void main(String[] args) {
        FindMaxNumber findMaxNumber=new FindMaxNumber();
        int[] input={2,3,4,3,90,78,56,45};
        System.out.println(findMaxNumber.max(input));
    }
}
