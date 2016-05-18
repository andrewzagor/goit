package PracticeModule1;

/**
 * Created by ZahornyiAI on 22.04.2016.
 */
public class JoinCharacters {
    public int join(char[] input) {
        int output=0;
        for (int i=0; i<input.length; i++){
            String outputstring= Integer.toString(output)+Character.toString(input[i]);
            output = Integer.parseInt(outputstring);
        }
        return output;
    }
    public static void main(String[] args) {
        char[] mas={'1','2','3','5','9'};
        JoinCharacters joinCharacters=new JoinCharacters();
        System.out.println(joinCharacters.join(mas));
    }
}
