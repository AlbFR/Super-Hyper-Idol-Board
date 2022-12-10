package canvasObjects;

import javax.swing.JLabel;
import java.util.ArrayList;

public class CanvasClassLabels {
   private JLabel name_label;
   private ArrayList<JLabel> attributes_label;
   private ArrayList<JLabel> methods_label;
   private int x;
   private int y;
   
   public CanvasClassLabels(int x, int y, String name, ArrayList<JLabel> attributes, ArrayList<JLabel> methods) {
       this.x = x;
       this.y = y;
       name_label = new JLabel(name);
       
   }
   
}
