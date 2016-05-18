package PracticeModule1;

import java.util.Arrays;

/**
 * Created by ZahornyiAI on 18.05.2016.
 */
public class MatrixTraversal {
    public int[] print(int[][] input) {
        String n=" ";
        int step=0;
            if (input.length<=1){
                for (int i=0; i<1+step; i++){
                    for (int j=0; j<input[i].length-step; j++){
                        if (input[i].length>0){
                            n = n + " " + Integer.toString(input[i][j]);}
                        else {n=" ";}}}
            }
        else {
        for (int k=step; k<=1; k++){
            for (int i=0+step; i<1+step; i++){
                for (int j=0+step; j<input[i].length-step; j++){
                    if (input.length-1-i>=1){
                    if (input[i].length>0){
                        n = n + " " + Integer.toString(input[i][j]);}
                    else {n=" ";}}}}
            for (int i=1+step; i<input.length-(1+step); i++){
                for (int j=input[i].length-(1+step); j<input[i].length-step; j++){
                    if (input.length-1-i-step>=1) {
                    if (input[i].length>0){
                        n = n + " " + Integer.toString(input[i][j]);
                    }
                    else {n=" ";}}}}
            for (int i=input.length-(1+step); i<input.length-step; i++){
                for (int j=input[i].length-(1+step); j>=0+step; j--){
                    if ((i-1.5*step)>0) {
                    if (input[i].length>0){
                        n = n + " " + Integer.toString(input[i][j]);
                    }
                    else {n=" ";}}}}

            for (int i=input.length-(2+step); i>=1+step; i--){
                for (int j=0+step; j<1+step; j++){
                    if (input.length-1-i-step>=1) {
                    if (input[i].length>0){
                        n = n + " " + Integer.toString(input[i][j]);
                    }
                    else {n=" ";}}}}
            step++; }}
        if (n==" "){
            int [] result = new int [1];
            result = new int[]{};
            return result;
        }
        else {String [] array = (n.trim()).split(" ");
        int [] result = new int [array.length];
        for (int i=0; i<array.length; i++){
            result[i]=Integer.parseInt(array[i]);}
        return result;
    }}

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3},{4,5,6}};
        MatrixTraversal matrixTraversal = new MatrixTraversal();
        System.out.println(Arrays.toString(matrixTraversal.print(input)));
    }
}
