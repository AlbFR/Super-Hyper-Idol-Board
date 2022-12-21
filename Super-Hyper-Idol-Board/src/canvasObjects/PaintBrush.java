package canvasObjects;

import java.io.Serializable;
import java.util.ArrayList;

public class PaintBrush implements Serializable {
    ArrayList <Integer> x = new ArrayList();
    ArrayList <Integer> y = new ArrayList();
    
    public void SavePoints(int x, int y){
        this.x.add(x);
        this.y.add(y);
    }

    public ArrayList <Integer> XList(){
        return this.x;
    }

    public ArrayList <Integer> YList(){
        return this.y;
    }

    public void eraseAll() {
        x = new ArrayList();
        y = new ArrayList();
    }
    
}
