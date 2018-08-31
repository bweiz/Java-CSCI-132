/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author benwe
 */
class Play {
    int[] totalFrame = new int[10];
    int[][] fScore = new int[10][2];
    int totalScore = 0;
    
    Random ran = new Random();
    public Play() {
    
    
    for (int i = 0; i < 10; i++){
        int roll1 = getRollOne();
        int roll2 = getRollTwo(10 - (roll1));
        fScore[i][0] = roll1;
        fScore[i][1] = roll2;
        totalFrame[i] = fScore[i][0] + fScore[i][1];
        
        /*
        if (fScore[i][0] == 10) {
            if (i>0 && i <= 9) {
            totalFrame[i] += totalFrame[i-1] + (fScore[i][0] + totalFrame[i + 1]);
            } else if (i > 9) {
                totalFrame[i] += totalFrame[i - 1] + (totalFrame[i+1]);
            } else {
                totalFrame[i] = totalFrame[i] + (totalFrame[i+1]);
            } 
        } else if (fScore[i][0] + fScore[i][1] == 10) {
            if (i>0 && i < 9) {
            totalFrame[i] += totalFrame[i-1] + fScore[i+1][0];
            } else if (i == 9 && i < 10) {
                totalFrame[i] += totalFrame[i-1] + fScore[i+1][0];
            }
        
        } else if (fScore[i][0] + fScore[i][1] < 10){
            if (i > 0)
            totalFrame[i] += totalFrame[i-1] + (roll1 + roll2);
            else {
                totalFrame[i] += fScore[i][0] + fScore[i][1];
            }
        } */
        
        if (fScore[i][0] == 10) {
            fScore[i][1] = 0;
             if (i > 0 && i < 8) {
                totalFrame[i] += totalFrame[i-1] + totalFrame[i+1];
                totalScore += totalFrame[i];
                
            } else if (i == 1) {
                totalFrame[i] += totalFrame[i+1];
                totalScore += totalFrame[i];
                
            } else {
                roll1 = getRollOne();
                roll2 = getRollTwo(10 - roll1);
                int roll3 = getRollOne();
                if (roll1 == 10 && roll2 != 10) {
                    totalFrame[i] +=  roll2;
                    totalScore = totalFrame[i];
                } else if (roll1 == 10 && roll2 == 10) {
                    totalFrame[i] += roll2 + roll3;
                    totalScore += totalFrame[i];
                } else {
                    
                    totalScore += totalFrame[i];
                }
                
            }
        } else if ((fScore[i][0] + fScore[i][1]) == 10) {
            totalScore += totalFrame[i] + fScore[i+1][0];
        } else {
            totalScore += totalFrame[i];
        }
    }
    
    }

    
    
    private int getRollOne() {
        int pinList[] = {0, 1, 2, 3, 4, 5, 6, 6, 7, 7, 7, 10, 10, 10, 8, 8, 8, 8, 9, 9, 9, 9};
        int index = ran.nextInt(22);
        int score = pinList[index];
        
        return(score);
    }

    private int getRollTwo(int pinsLeft) {
        int possibleScore;
        int ranNum;
        if (pinsLeft == 0) {
            int pinList[] = {0, 1, 2, 3, 4, 5, 6, 6, 7, 7, 7, 10, 10, 10, 8, 8, 8, 8, 9, 9, 9, 9};
            ranNum = ran.nextInt(22);
            possibleScore = pinList[ranNum];
        } else {
            possibleScore = ran.nextInt(pinsLeft);
        }
        
        return(possibleScore);
        
    }
    public int[] getFirstFrame() {
        int[] firstInFrame = new int[10];
        for (int x=0; x<10; x++) {
            firstInFrame[x] = fScore[x][0];
        }
        return(firstInFrame);
    }
    public int[] getSecondFrame() {
        int[] secondInFrame = new int[10];
        for (int x=0; x<10; x++) {
            secondInFrame[x] = fScore[x][1];
        }
        return(secondInFrame);
    }
    public int getTotalScore() {
        int score = totalScore;
        return(score);
    }

}

