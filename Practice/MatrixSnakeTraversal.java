package PracticeModule1;

import java.util.Arrays;

/**
 * Created by ZahornyiAI on 12.05.2016.
 */
public class MatrixSnakeTraversal {
        public int[] print(int[][] input) {
            int[] result;
            String temp="";
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < input[i].length; j++) {
                    if (j % 2 == 0) {
                        for (int t = 0; t < input.length; t++) {
                            for (int y = j; y < j + 1; y++) {
                                temp  = temp+Integer.toString(input[t][y]);
                            }
                        }
                    } else {
                        for (int f = input.length - 1; f >= 0; f--) {
                            for (int n = j; n < j + 1; n++) {
                                temp  = temp+Integer.toString(input[f][j]);
                            }
                        }
                    }
                }
            }
            char[] tempCharArray = new char[temp.length()];
            result = new int [temp.length()];
            for (int j=0; j<temp.length(); j++){
                tempCharArray[j] = temp.charAt(j);
            }
            for (int i=0; i<temp.length(); i++ ){
                result [i] = Character.getNumericValue(tempCharArray[i]);
            }
            return result;
        }

        public static void main(String[] args) {
            int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{7,8,9}};
            MatrixSnakeTraversal matrixSnakeTraversal=new MatrixSnakeTraversal();
            System.out.println(Arrays.toString(matrixSnakeTraversal.print(input)));

        }
    }
