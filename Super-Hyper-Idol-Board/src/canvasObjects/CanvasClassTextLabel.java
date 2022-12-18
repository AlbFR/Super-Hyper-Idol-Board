package canvasObjects;

import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public abstract class CanvasClassTextLabel extends JLabel {
    protected static int width;
    protected static int height;
    protected int x;
    protected int y;

    public CanvasClassTextLabel(String text, int x, int y) {
        this.setValue(text);
        this.recalculateGeometry(x, y);
        this.setVerticalAlignment(SwingConstants.CENTER);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setValue(String value) {
        this.setText(value);
    }

    public void recalculateGeometry(int x, int y) {
        this.setXY(x, y);
        this.setBounds(this.x, this.y, width, height);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}