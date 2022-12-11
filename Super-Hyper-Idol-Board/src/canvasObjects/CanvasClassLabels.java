package canvasObjects;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;
import javax.swing.JLabel;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public final class CanvasClassLabels extends JPanel {
   public JLabel name_label;
   public ArrayList<JLabel> attributes_label;
   public ArrayList<JLabel> methods_label;
   private int x;
   private int y;
   
   public CanvasClassLabels(int x, int y, String name) {
       this.x = x;
       this.y = y;
       //this.setSize(110, 80);
       this.name_label = new JLabel();
       this.name_label.setBorder(LineBorder.createGrayLineBorder());
       this.setCanvasClassLabelName(name);
       this.name_label.setBounds(this.x+5,this.y-40,100,100);
       this.add(this.name_label);
   }

   public void setXY(int x, int y) {
       this.x = x;
       this.y = y; 
   }
   
   public void recalculateGeometry() {
       this.name_label.setBounds(this.x+5,this.y-40, 100,100);
   }
   
   public void setCanvasClassLabelName(String name){
       this.name_label.setText(name);
       this.recalculateGeometry();
   }
      
   @Override
   public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.paintComponents(g);
   }
}