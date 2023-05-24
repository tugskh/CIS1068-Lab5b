/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis1068lab5b;

/**
 *
 * @author tugsbilegkhaliunbat
 */
public class CIS1068Lab5b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int[] numbers = new int[]{ 1,-2,4,-4,9,-6,16,-8,25,-10 }; 
        //stdev(numbers);
    }
    public static void stdev(int [] numbers){
        double sum = 0;
        double sumOfSquares = 0;
        for(int i = 0; i<numbers.length; i++){
            sum+=numbers[i];
        }
        //System.out.println("sum "+sum);
        double avg = sum/numbers.length;
        //System.out.println("avg "+avg);
        for(int i = 0; i<numbers.length; i++){
            sumOfSquares+=(Math.pow((numbers[i]-avg),2));
        }
        double varience = sumOfSquares/(numbers.length-1);
       // System.out.println("varience "+varience);
        
        double stdev = Math.sqrt(varience);
        System.out.printf("Standard Deviation is %.2f ",stdev);
    }
    public static void matrixAdd(int [] [] A, int [] [] B){
        //int A [][] = new int [3][3];
        //int B [][] = new int [3][3];
        for(int i = 0; i<A.length; i++){
            for(int j=0; j<A.length; j++) {
                A[i][j] = 3;
                System.out.print(A[i][j]+" ");
            }
            System.out.print("  ");
            for(int j=0; j<B.length; j++) {
                B[i][j] = 3;
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
