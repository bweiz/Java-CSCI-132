/*
 * Program that uses either bubble or insert sort to sort an integer array of 
 * size 100, and gives the time alloted for each
 */
package sorting;

import java.util.Random;

/**
 *
 * @author benwe
 */
public class Driver {
    public static void main(String[] args) {
        Sorting np = new Sorting();
        Random ran = new Random();
        int[] sNum = new int[1000];
        for (int i = 0; i < sNum.length; i++) {
            sNum[i] = ran.nextInt(100)+1;
            System.out.print(sNum[i] + ", ");
        }
        System.out.println();
        long start = System.currentTimeMillis();
        np.insertionSort(sNum);
        
        long finish = System.currentTimeMillis();
        for (int y = 0; y < sNum.length; y++){
            System.out.print(sNum[y] + ", ");
        }
        System.out.println();
        System.out.println(finish - start);
        System.out.println();
        
        np.bubbleSort(sNum);
        
        finish = System.currentTimeMillis();
        for (int y = 0; y < sNum.length; y++){
            System.out.print(sNum[y] + ", ");
        }
        System.out.println();
        System.out.println(finish - start);
        System.out.println();
        
        
    }
}
