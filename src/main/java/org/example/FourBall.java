package org.example;
import processing.core.PApplet;

public class FourBall extends PApplet{
    private final int screenHeight = 500;
    private final int screenWidth = 640;
    private final int radi = 5;
    private int balls = 4;

    class Ball{
        private int distance = 0;
        private final int speed;

        private final int position;

        Ball(int speed,int position){
            this.speed = speed;
            this.position= position;
        }
        void drawBall(){
            ellipse(distance,(screenHeight/5)*position,radi,radi);
            distance += speed;
        }
    }
    private Ball[] ball = new Ball[balls];

    @Override
    public void settings() {
        size(screenWidth,screenHeight);
    }

    @Override
    public void setup() {
        for(int pos = 0;pos<balls;pos++){
            ball[pos] = new Ball(pos+1,pos+1);
        }
    }

    @Override
    public void draw() {
        for(int pos = 0;pos<balls;pos++){
            ball[pos].drawBall();
        }
    }
    public static void main(String[] args) {PApplet.main("org.example.FourBall",args);}
}
