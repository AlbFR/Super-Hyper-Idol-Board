package canvasObjects;

import java.util.ArrayList;
import java.awt.Point;
import java.awt.Color;

public class Points {
    private ArrayList<Point> points;
    private Color color;
    
    public Points(){
        points = new ArrayList<>();
        color = Color.BLACK;
    }

    public void addPoint(Point point){
        this.points.add(point);
    }

    public void setColor(Color color){
        this.color = color;
    }
}
