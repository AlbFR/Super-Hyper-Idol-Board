package canvasObjects;

import java.util.ArrayList;

import javax.swing.JPanel;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.Color;

public class Curve extends JPanel {
    private ArrayList<Point> points;
    private Color color;
    
    public Curve(){
        points = new ArrayList<>();
        this.color = Color.BLACK; // Not racist
    }

    public void addPoint(Point point){
        this.points.add(point);
    }

    public void paint(Graphics g){
        g.setColor(this.color);
        for(int i = 0; i<points.size()-2; i++) {
            g.drawLine(this.points.get(i).x, this.points.get(i).y, this.points.get(i+1).x, this.points.get(i+1).y);
        }
        System.out.println("pene");
    }
}
