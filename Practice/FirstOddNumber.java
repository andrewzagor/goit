package PracticeModule1;

import static java.lang.StrictMath.abs;

/**
 * Created by ZahornyiAI on 26.04.2016.
 */
public class FirstOddNumber {
    public int find(int[] input) {
        int length=input.length;
        int number=-1;
       for(int i=length-1; i>=0; i--){
            if (input[i]%2==1) {
                number=i;
           }
        }
        return number;
    }
    public static void main(String[] args) {
        FirstOddNumber firstOddNumber=new FirstOddNumber();
        int [] input = {3};
        int [] input1 = {2,5,5,5,3};
        int [] input2 = {3,2,5,5,3};
        int [] input3 = {0,9,4,5,3};
        System.out.println(firstOddNumber.find(input));
        System.out.println(firstOddNumber.find(input1));
        System.out.println(firstOddNumber.find(input2));
        System.out.println(firstOddNumber.find(input3));
    }
}
