/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.Scanner;

/**
 *
 * @author benwe
 */

public class Driver {
    public static void main(String[] args) {
        LinkedList runner = new LinkedList();
        Driver run = new Driver();
        boolean g = false;
        Scanner sc = new Scanner(System.in);
        
        do { 
            int i = run.menu();
            
            switch(i) {
            case 1: String name;
                    System.out.println("What is the name of the person you want to add to the list?");
                    name = sc.nextLine();
                    runner.add(name);
                    break;
            case 2: runner.print();
                    break;
            case 3: String delName;
                    System.out.println("Who would you like to delete from the list?");
                    delName = sc.nextLine();
                    runner.delete(delName);
                    break;
                    
            case 4: runner.clearList();
                    break;
            default: g = true;
                     break;
        }
        } while (g != true);
        
        
    }
    public int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("Press 1 to add an item to the back of the list");
        System.out.println("Press 2 to print the list");
        System.out.println("Press 3 to delete an item");
        System.out.println("Press 4 to clear the whole list");
        System.out.println("Press -1 to exit");
        int x = sc.nextInt();
        return(x);
    }
}
