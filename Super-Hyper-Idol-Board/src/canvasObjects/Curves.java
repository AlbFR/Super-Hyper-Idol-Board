package canvasObjects;

import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Curves extends JPanel {
    private ArrayList<Curve> curves;

    public Curves() {
        this.curves = new ArrayList<Curve>();
    }

    public void paintComponent(Graphics g){
		System.out.print("Sex mode activated");
        for(int i = 0; i<this.curves.size(); i++){
            this.curves.get(i).paint(g);
        }
    }

    // public void paintComponent(Graphics g) {
    //     super.paintComponent(g);
    // }

    public void addCurve(Curve curve){
        this.curves.add(curve);
    }

    public void removeCurves(){
        // this.remove(this.curves.get(this.curves.size()-1));
        this.curves.remove(curves.size()-1);
    }
}
