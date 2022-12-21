package canvasObjects;

import java.util.LinkedList;

public class PaintBrush2 {
    LinkedList <Integer> x = new LinkedList();
    LinkedList <Integer> y = new LinkedList();
    
    public void SavePoints(int x, int y){
        this.x.add(x);
        this.y.add(y);
    }

    public LinkedList <Integer> XList(){
        return this.x;
    }

    public LinkedList <Integer> YList(){
        return this.y;
    }

    public void eraseAll() {
        x = new LinkedList();
        y = new LinkedList();
    }
    
}
