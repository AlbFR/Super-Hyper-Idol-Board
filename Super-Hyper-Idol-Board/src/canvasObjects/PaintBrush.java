package canvasObjects;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class PaintBrush extends JPanel implements KeyListener,MouseListener,MouseMotionListener {
    private Color color;
    private int x=-1, y=-1, x2=-1, y2=-1;

    public PaintBrush(){
        color = color.BLACK;
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g){
     Graphics2D g2d = (Graphics2D) g;
     g2d.setStroke(new BasicStroke(2));
     g2d.setColor(color);
        
        if(x2 != -1 && x != -1) {
            g2d.drawLine(x, y, x2, y2);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Dragged");
        x2 = e.getX();
        y2 = e.getY();
        paint(this.getGraphics());
        x = x2;
        y = y2;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked");
        x = e.getX();
        y = e.getY();
        paint(this.getGraphics());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = -1;
        x2 = -1;
    }

    public void colorSetter(Color color){
        this.color = color;
    }

    @Override
    public void mouseMoved(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}
}