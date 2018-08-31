/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Random;

/**
 *
 * @author benwe
 */
public class Sorting {
    
    /**
     * @param args the command line arguments
     */
    
    void bubbleSort(int arr[]){
        int n = arr.length;
        int temp = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n-1); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            
        
    }
    
    void insertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int y = i-1;
            
            while(y >= 0 && arr[y] > key) {
                arr[y+1] = arr[y];
                y = y-1;
            }
            arr[y+1] = key;
        }
    }
}
