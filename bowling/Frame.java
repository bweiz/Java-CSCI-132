/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

import java.util.Arrays;

/**
 *
 * @author benwe
 */
public class Frame {
    int count = 1;
    Play game = new Play();
    public Frame() {
    int[] roll1 = game.getFirstFrame();
    int[] roll2 = game.getSecondFrame();
    String s = "|";
    String q = "+";
    int r = game.getTotalScore();
    
    for (int x = 0; x<9; x++) {
        System.out.printf("+----Frame " + count + "----");
        
        count += 1;
    }
    System.out.print("+----Frame 10---");
    System.out.println("+---------------+");
    System.out.print("+");
    for (int x=0; x<10; x++) {
        System.out.printf("%5d  %s  %-6d", roll1[x], s, roll2[x]);
    }
    System.out.println();
    
    
    for (int x = 0; x<10; x++) {
        System.out.printf("+---------------");
        
        count += 1;
    }
    System.out.println("+---------------+");
    System.out.printf("+");
    
    System.out.printf("%153d", r);
    System.out.printf("%23s", q);
    System.out.println();
    
    for (int x = 0; x<10; x++) {
        System.out.printf("+---------------");
        
        count += 1;
    }
    System.out.println("+---------------+");
    }
}
