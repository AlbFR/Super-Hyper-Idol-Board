package canvasObjects;

import java.awt.Graphics;
import javax.swing.SwingConstants;

public class CanvasClassAttribute extends CanvasClassTextLabel {
	private static final int width = 100;
    private static final int height = 20;
    private static final int marginx = 5;
    private int x;
    private int y;

    public CanvasClassAttribute(String text, int x, int y) {
        super(text, x, y);
        this.setHorizontalAlignment(SwingConstants.LEFT);
    }

    public void setXY(int x, int y) {
        this.x = x + marginx;
        this.y = y;
    }

    public void recalculateGeometry(int x, int y) {
        this.setXY(x, y);
        this.setBounds(this.x, this.y, width, height);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
