/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author benwe
 */
public class LinkedList {
    Node first;
    LinkedList() {
        first = null;
    }
    void add(String temp) {
        Node n = new Node(temp);
        Node iter = first;
        if (iter == null) {
            first = n;
            
        } else {
        while (iter.getNext() != null) {
            
            iter = iter.getNext();
            
        }
        iter.setNext(n);
        
        }

    }
    boolean delete(String temp) {
        Node iter = first;
        Node lagPtr = first;
        
        while (iter != null) {
            if (iter.getName().equals(temp)) {
                if (iter == first) {
                    first = first.getNext();
                } else {
                    lagPtr.setNext(iter.getNext());
                    return true;
                }
            }
            lagPtr = iter;
            iter = iter.getNext();
        }
        return false;
               
    }
    void print() {
        Node iter = first;
        
        while (iter != null) {
            System.out.print(iter.getName()+ " ");
            iter = iter.getNext();
        }
        System.out.println();
    }
    void clearList() {
        first = null;
    }
}
