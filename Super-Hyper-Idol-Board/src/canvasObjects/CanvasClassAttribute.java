package canvasObjects;

import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CanvasClassAttribute extends CanvasClassTextLabel {
	public static final int WIDTH = 100;
    public static final int HEIGHT = 20;
    public static final int marginx = 5;

    public CanvasClassAttribute(String text, int x, int y) {
        super(text, x, y);
        this.setBounds(x, y, WIDTH, HEIGHT);
        this.setHorizontalAlignment(SwingConstants.LEFT);
        this.setBackground(Color.RED);
        this.setBorder(new EmptyBorder(0, marginx, 0, marginx));
    }

    // public void setXY(int x, int y) {
    //     this.setBounds(x, y, WIDTH, HEIGHT);
    //     // this.x = x + marginx;
    //     // this.y = y;
    // }

    public void recalculateGeometry(int x, int y) {
        this.setBounds(x, y, WIDTH, HEIGHT);
    }

    // public void paintComponent(Graphics g) {
    //     super.paintComponent(g);
    // }
}
