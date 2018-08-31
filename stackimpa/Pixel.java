/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackimpa;

/**
 *
 * @author benwe
 */
public class Pixel {
    int h, w, count;
    int aC, rC, gC, bC;
    
    Pixel(int height, int width) {
        h = height;
        w = width;
        count = 1;
    }
    void setColor(int [] rgbA) {
        aC = rgbA[0];
        rC = rgbA[1];
        gC = rgbA[2];
        bC = rgbA[3];
    }
    int getY() {
        return h;
    }
    int getX() {
        return w;
    }
    int redC() {
        return rC;
    }
    int greenC() {
        return gC;
    }
    int blueC() {
        return bC;
    }
    int [] getColor() {
        int [] rgb = new int[4];
        rgb[0] = aC;
        rgb[1] = rC;
        rgb[2] = gC;
        rgb[3] = bC;
        return rgb;
    }
    void setBlack() {
        rC = 0;
        gC = 0;
        bC = 0;
    }
}
