package canvasObjects;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;
import javax.swing.JLabel;
import java.util.ArrayList;
import javax.swing.JPanel;

public class CanvasClassLabels extends JPanel {
   public JLabel name_label;
   public ArrayList<JLabel> attributes_label;
   public ArrayList<JLabel> methods_label;
   private int x;
   private int y;
   
   public CanvasClassLabels(int x, int y, String name) {
       this.x = x;
       this.y = y;
       //this.setSize(110, 80);
       name_label = new JLabel(name);
       name_label.setBounds(this.x+5,this.y-40,100,100);
       this.add(name_label);
   }
   
   @Override
   public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //this.name_label.paint(g);
        this.paintComponents(g);
   }
   
   public void setXY(int x, int y) {
       this.x = x;
       this.y = y; 
   }
   public void recalculateGeometry() {
       this.name_label.setBounds(this.x,this.y, 100,100);
   }
}