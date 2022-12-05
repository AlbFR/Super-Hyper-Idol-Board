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
   public int focused_class;
   private Color focused_bound_color;

   public Canvas() {
      super();

      focused_class = -1; // There's no focused class at the beginning
      focused_bound_color = new Color(50, 205, 231);
      this.setBackground(Color.white);
      this.setSize(660, 500);
      canvasClasses = new ArrayList<CanvasClass>();
   }   

   public void createNewCanvasClass() {
      canvasClasses.add(new CanvasClass());
      this.setNewFocusedClass(canvasClasses.size()-1);
      this.repaint();
   }

   public void setNewFocusedClass(int new_focus_on) {
      if (focused_class != -1)
         canvasClasses.get(focused_class).setBoundColor(Color.black);
      focused_class = new_focus_on;
      if (new_focus_on == -1)
         return;
      canvasClasses.get(new_focus_on).setBoundColor(focused_bound_color);
   }

   public ArrayList<CanvasClass> getCanvasClasses() {
      return this.canvasClasses;
   }

   public int clickedOnAnyClass(int x, int y) {
      for (int i=0;i<canvasClasses.size();++i) {
         if (canvasClasses.get(i).clickedOnRectangle(x, y))
            return i;
      }
      return -1;
   }

   public boolean deleteCanvasClass(int k) {
      if (k < 0 || canvasClasses.size() <= k)
         return false;
      if (k == focused_class)
         this.setNewFocusedClass(-1);
      if (k < focused_class)
         setNewFocusedClass(focused_class-1);
      canvasClasses.remove(k);
      return true;
   }

   public void paint(Graphics g) {
      super.paint(g);
      for (int i=0;i<canvasClasses.size();++i) {
         canvasClasses.get(i).paint(g);
      }
   }
}
