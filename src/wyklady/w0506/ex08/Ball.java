package wyklady.w0506.ex08;

import java.awt.*;

public class Ball extends Thread{
    private int x, y, size;
    private int vy;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
        this.size = 50;
        this.vy = (int)(Math.random()*5);
        start();
    }

    public void run() {
        try {

        while(!Thread.currentThread().isInterrupted()) {
            y += vy;
            Thread.sleep(250);
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics g) {
        g.drawOval(x, y, size , size);
    }

}
