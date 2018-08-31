/*
 * Program that goes through a file of numbers, puts them in a "circle" and 
 * sorts through based on different inputs and deletes 2 at a time until one or
 * two is left who is the winner
 */
package partycontrol;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author benwe
 */
public class readIn {
    Scanner fin;
    Scanner console = new Scanner(System.in);
    Node first;
    
    readIn() {
        System.out.println("What file would you like to read from? ");
        String file = console.nextLine();
        try {
        fin = new Scanner(new File(file));
        } catch (Exception e) {
            System.err.println("Opening file error" + e);
        }
    }
    public void readFromFile() {
        Candidate game = new Candidate();    
        String n, k, m;
        String[] news = new String[3];
        while(fin.hasNextLine() && !fin.equals("0 0 0 "))
        {
            
            String x = fin.nextLine();
            String [] numbers = x.split("\n");
            String [][] acNums = new String[numbers.length][3];
            for(int i = 0; i < numbers.length; i++) {
                acNums[i] = numbers[i].split(" ");
                n = acNums[i][0];
                k = acNums[i][1];
                m = acNums[i][2];
                news[0] = n;
                news[1] = k;
                news[2] = m;
                game.election(news);
                System.out.println();
            
            }
           
        }
        
    }
}
