package canvasObjects;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class PaintBrush extends JPanel implements MouseListener,MouseMotionListener {
    private Color color;
    private int x=-1, y=-1, x2=-1, y2=-1;
    private Curves curves;
    private Curve workingCurve;
    public boolean paintBrushingOn = false;

    public PaintBrush(){
        this.color = Color.BLACK;
        this.curves = new Curves();
        this.setLayout(null);
        addMouseListener(this);
        addMouseMotionListener(this);
        this.add(this.curves);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.curves.paintComponent(g);
        if (this.workingCurve != null)
            this.workingCurve.paint(g);
    }

    // public void paint(Graphics g){
    //     Graphics2D g2d = (Graphics2D) g;
    //     g2d.setStroke(new BasicStroke(2));
    //     g2d.setColor(color);
    //         if(x2 != -1 && x != -1) {
    //             g2d.drawLine(x, y, x2, y2);
    //         }
    //    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // System.out.println("Dragged");
        // x2 = e.getX();
        // y2 = e.getY();
        // paint(this.getGraphics());
        // x = x2;
        // y = y2;
        if(this.paintBrushingOn){
            if (this.workingCurve == null)
                this.workingCurve = new Curve();
            this.workingCurve.addPoint(new Point(e.getX(), e.getY()));
        }        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // paint(this.getGraphics());
        this.workingCurve = new Curve();
        this.paintBrushingOn = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = -1;
        x2 = -1; 
        this.paintBrushingOn = false;
        this.curves.addCurve(workingCurve);
        this.workingCurve = null;
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
}