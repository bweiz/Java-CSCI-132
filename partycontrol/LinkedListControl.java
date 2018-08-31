/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partycontrol;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author benwe
 */
public class LinkedListControl {
    Scanner fin;
    Scanner console = new Scanner(System.in);
    Node head;
    Node tail;
    private Node iter;
    int size;
    
    
    LinkedListControl() {
        head = null;
        tail = null;
        iter = null;
        size = 0;
    }

    public void add(int temp) {
        Node n = new Node(temp);
        
        if (head == null) {
            head = n;
            tail = n;
            head.setNext(n);
            head.setPrev(n);
            
            
            
        } else {
            iter = head;
            while (iter.getNext() != head) {
                iter = iter.getNext();
            }
            iter.setNext(n);
            n.setNext(head);
            n.setPrev(iter);
            head.setPrev(n);
            
        }
        //head = n.getNext();
        tail = n;
        size++;
        
  
    }
    public void remove(Node temp) {
        if (temp.getData() == 1) {
            head = temp.getNext();
            head.setPrev(temp.getPrev());
            temp.getPrev().setNext(head);
        }
        Node nBR = new Node();
        nBR = temp;
        temp = temp.getNext();
        temp.setPrev(nBR.getPrev());
        nBR.getPrev().setNext(temp);
        size--;
        
    }
    public void print(){
        iter = head;
        if (iter == null) {
            System.out.println("Nane");
        }
        else if (iter.getData() == 1) {
            System.out.println(iter.getData());
        }
        while (iter.getNext() != head) {
            iter = iter.getNext();
            System.out.println(iter.getData());
        }
    }
    public int getSize() {
        return size;
    }
}
