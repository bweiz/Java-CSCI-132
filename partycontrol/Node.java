/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partycontrol;

/**
 *
 * @author benwe
 */
public class Node {
    private Node next;
    private Node prev;
    private int data;
    
    public Node(){}
    public Node(int d) {
        this.data = d;
    }
    public void setNext(Node n) {
        next = n;
    }
    public void setPrev(Node n) {
        prev = n;
    }
    public Node getNext() {
        return next;
    }
    public Node getPrev() {
        return prev;
    }
    public void setData(int d) {
        data = d;
    }
    public int getData() {
        return data;
    }
        
        
}
