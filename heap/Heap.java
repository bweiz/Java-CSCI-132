/*
 * First attempt at creating a heap data structure
 */
package heap;

import java.util.ArrayList;
import java.util.*;


/**
 *
 * @author benwe
 */
public class Heap {

    //ArrayList<Integer> heap = new ArrayList<Integer>(25);
    int[] heap = new int[25];
    private int front = 0;
    private int end = 0;
    int index = 0;
    private int sz = 0;

    
    /**
     * @param args the command line arguments
     */
    
    public void insert(int i) {
        
        int lChild = index*2 + 1;
        int rChild = index*2 + 2;
        if (sz == 0) {
            heap[index] = i;
            sz++;
            return;
        }
        
        if ((heap[lChild]) == 0) {
            heap[lChild] = i;
            sz++;
            
            while (heap[lChild] < heap[index]) {
                int temp = heap[lChild];
                heap[lChild] = heap[index];
                heap[index] = temp;
                lChild = index;
            }
        } else if (heap[rChild] == 0) {
            heap[rChild] = i;
            sz++;
            index++;
            while (heap[rChild] < heap[index]) {
                int temp = heap[rChild];
                heap[rChild] = heap[index];
                heap[index] = temp;
                rChild = index;   
            }
        }
    }
    public void deQueue() {
        int lChild = (2*index)+1;
        int rChild = (2*index)+2;
        front = (front) % sz;
        end = (sz - 1);
        int temp = heap[end];
        heap[front] = temp;
        sz--;
        while (heap[lChild]<heap[index]) {
            int move = heap[lChild];
            heap[lChild] = heap[index];
            heap[index] = move;
            lChild = index;
            
            
        }
        while (heap[rChild] < heap[index]) {
            int move = heap[rChild];
            heap[rChild] = heap[index];
            heap[index] = move;
            rChild = index;
            
        }
        
    }
    public void print() {
        int i = 0;
        for (i = 0; i<sz; i++) {
            System.out.println(heap[i]);
        }
    }
    public void swap(int small, int large) {
        int temp = small;
        small = large;
        large = temp;
    }
}
