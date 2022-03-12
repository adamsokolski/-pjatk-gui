package w1;

import w1.model.Figure;
import w1.model.Square;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        this.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        super.windowClosing(e);
                        System.exit(0);
                    }
                }
        );
        this.setVisible(true);

        Figure[] figures = {
            new Square(10)
        };

        System.out.println(figures[0].getArea());
    }
}
