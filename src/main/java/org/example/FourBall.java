package org.example;
import processing.core.PApplet;

public class FourBall extends PApplet{
    private final int screenHeight = 500;
    private int distance = 0;
    private final int screenWidth = 640;
    private final int radi = 5;
    private int balls = 4;

    @Override
    public void settings() {
        size(screenWidth,screenHeight);
    }

    @Override
    public void draw() {
        for(int pos = 1; pos<=balls;pos++){
             ellipse(distance*pos,pos*(screenHeight/5),radi,radi);
             distance+=1;
        }
    }
    public static void main(String[] args) {PApplet.main("org.example.FourBall",args);}
}
