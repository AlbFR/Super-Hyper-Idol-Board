package canvasObjects;

import java.awt.Graphics;

import javax.swing.SwingConstants;

public class CanvasClassName extends CanvasClassTextLabel {
	public final static int WIDTH = 100;
    public final static int HEIGHT = 20;

    public CanvasClassName(String text, int x, int y) {
        super(text, x, y);
        this.setBounds(x, y, WIDTH, HEIGHT);
        this.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public void recalculateGeometry(int x, int y) {
        this.setBounds(x, y, WIDTH, HEIGHT);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // System.out.println(this.getVisibleRect());
    }
}
