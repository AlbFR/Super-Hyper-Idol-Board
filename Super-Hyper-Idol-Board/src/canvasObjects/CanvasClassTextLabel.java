package canvasObjects;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public abstract class CanvasClassTextLabel extends JLabel {

    public CanvasClassTextLabel(String text, int x, int y) {
        this.setText(text);
        this.setForeground(Color.BLACK);
        this.setVisible(true);
        // this.recalculateGeometry(x, y);
        this.setVerticalAlignment(SwingConstants.CENTER);
    }

    abstract public void recalculateGeometry(int x, int y);

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // System.out.println(this.getVisibleRect());
    }
}