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
public class Node {
    private String name;
    private Node next;
    public Node(String n) {
        name = n;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node temp){
        next = temp;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return name;
    }
    
}
