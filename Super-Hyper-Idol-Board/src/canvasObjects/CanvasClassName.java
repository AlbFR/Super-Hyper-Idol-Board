package canvasObjects;

import java.awt.Graphics;
import javax.swing.SwingConstants;

public class CanvasClassName extends CanvasClassTextLabel {
	private static int width = 100;
    private static int height = 20;
    private int x;
    private int y;

    public CanvasClassName(String text, int x, int y) {
        super(text, x, y);
        this.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public void setName(String name) {
        this.setText(name);
    }

    public void setXY(int x, int y) {
        this.x = x;
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
