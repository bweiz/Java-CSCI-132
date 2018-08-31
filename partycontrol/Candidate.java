/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partycontrol;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author benwe
 */
public class Candidate {
    
    
    
    public Candidate() {
        
    }
    
    public void election(String[] cand) {
        try {
            PrintWriter outputfile = new PrintWriter("politicspartyfile.txt");
        
        int n, k, m;
        LinkedListControl game = new LinkedListControl();
        n = Integer.parseInt(cand[0]);
        k = Integer.parseInt(cand[1]);
        m = Integer.parseInt(cand[2]);
        
        if (k > n) 
            k = k%n;
        if (m > n)
            m = m%n;
        for (int i = 1; i <= n; i++) 
            game.add(i);
        

        
        
        Node cc = game.head;
        Node cw = game.tail;
        int countCW = 0;
        int countCC = 0;
        System.out.println("Program 4");
        System.out.println("---------\n");
        System.out.println("N = " + n + ", k = " + k + ", m = " + m + "\n");
        System.out.println("Output");
        System.out.println("------");
        
        while (game.getSize() > 0) {
            
            while (countCW < k) {
                cw = cw.getNext();
                countCW++;
            } 
            while (countCC < m) {
                cc = cc.getPrev();
                countCC++;
            } 
            
            if (cw.getData() == cc.getData()) {
                System.out.println(cw.getData());
                outputfile.write(cw.getData());
                
                game.remove(cw);
                countCW = 0;
                countCC = 0;
                
                
                
            } else {
                System.out.println(cw.getData() + " " + cc.getData());
                outputfile.write(cw.getData() + " " + cc.getData());
                
                game.remove(cw);
                game.remove(cc);
                countCW = 0;
                countCC = 0; 
            }
            
            
        }
        outputfile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
