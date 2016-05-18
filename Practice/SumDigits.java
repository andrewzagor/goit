package PracticeModule1;

import static java.lang.StrictMath.abs;

/**
 * Created by ZahornyiAI on 22.04.2016.
 */
public class SumDigits {
    public int sum(int number) {
        String stringToTextVar=null;
        if (number < 0) {
            String stringToTextVarTmp = Integer.toString(number);
            stringToTextVar = stringToTextVarTmp.substring(1);
        }
        else {String stringToTextVarTmp = Integer.toString(number);
            stringToTextVar = stringToTextVarTmp;};
        int calc = 0;
        for (int i = 0; i < stringToTextVar.length(); i++) {
            String temp = String.valueOf(stringToTextVar.charAt(i));
            int s = Integer.parseInt(temp);
            calc = calc + s;
        }
        return calc;
    }
    public static void main(String[] args)  {
        SumDigits sumDigits = new SumDigits();
        int number = -2147483648;
            int sum = sumDigits.sum(number);
            System.out.println(sum);
}
}
