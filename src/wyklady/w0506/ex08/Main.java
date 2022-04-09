package wyklady.w0506.ex08;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Main extends Frame {
    public static void main(String[] args) {
        new Main();
    }

    private List<Ball> list;

    public Main() {
        list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(
                new Ball(10+(i*70), 35)
            );
        }

        this.setSize(640, 480);
        this.setVisible(true);

        new Thread(
                () -> {
                    long fps = 1000 / 30;
                    try {
                        while(!Thread.currentThread().isInterrupted()){
                            repaint();
                            Thread.sleep(fps);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
        ).start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Ball ball : list)
            ball.draw(g);
    }
}
