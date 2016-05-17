package Practice;

import java.util.Arrays;

/**
 * Created by andrew on 18.05.16.
 */
public class MatrixTraversal {
    public int[] print(int[][] input) {
        String n=" ";
        int step=0;
        for (int k=step; k<=1; k++){
            for (int i=0+step; i<1+step; i++){
                for (int j=0+step; j<input[i].length-step; j++){
                    if (input[i].length>0){
                        n = n + " " + Integer.toString(input[i][j]);}
                    else {n=" ";}}}
        for (int i=1+step; i<input.length-(1+step); i++){
            for (int j=input[i].length-(1+step); j<input[i].length-step; j++){
                if (input[i].length>0){
                    n = n + " " + Integer.toString(input[i][j]);
                }
                else {n=" ";}}}

        for (int i=input.length-(1+step); i<input.length-step; i++){
            for (int j=input[i].length-(1+step); j>=0+step; j--){
                if (input[i].length>0){
                    n = n + " " + Integer.toString(input[i][j]);
                }
                else {n=" ";}}}

        for (int i=input.length-(2+step); i>=1+step; i--){
            for (int j=0+step; j<1+step; j++){
                if (input[i].length>0){
                    n = n + " " + Integer.toString(input[i][j]);
                }
                else {n=" ";}}}
            step++; }
        String [] array = (n.trim()).split(" ");
        int [] result = new int [array.length];
        for (int i=0; i<array.length; i++){
            result[i]=Integer.parseInt(array[i]);}
        return result;
    }

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14,15},{16, 17, 18, 19, 20}};
        MatrixTraversal matrixTraversal = new MatrixTraversal();
        System.out.println(Arrays.toString(matrixTraversal.print(input)));
    }
}

