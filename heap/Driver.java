/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author benwe
 */
public class Driver {
    public static void main(String[] args) {
        Heap np = new Heap();
        np.insert(15);
        np.insert(5);
        np.insert(8);
        np.insert(4);
        np.insert(9);
        np.insert(22);
        np.insert(17);
        np.insert(6);
        np.insert(14);
        np.print();
        System.out.println();
        np.deQueue();
        System.out.println();
        np.print();
    }
}
