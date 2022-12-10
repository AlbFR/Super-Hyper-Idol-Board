package canvasObjects;

import java.awt.Graphics;
import java.awt.Color;
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
       name_label.setBounds(0,0,100,100);
       this.add(name_label);
   }
   
   public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.name_label.paint(g);
   }
}