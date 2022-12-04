package panels;

import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

import canvasObjects.*;

enum selectedDrawingOption {
   CREATE_CLASS
}

public class Canvas extends JPanel {
   private ArrayList<CanvasClass> canvasClasses;
   public Canvas() {
      super();

      this.setBackground(Color.white);
      canvasClasses = new ArrayList<CanvasClass>();
   }   

   public void createNewCanvasClass() {
      canvasClasses.add(new CanvasClass());
   }

   public void paint(Graphics g) {
      super.paint(g);
      for (int i=0;i<canvasClasses.size();++i) {
         canvasClasses.get(i).paint(g);
      }
   }
}
