package panels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import canvasObjects.CanvasClass;

public class Canvas extends JPanel implements MouseMotionListener { 
   private ArrayList<CanvasClass> canvasClasses;
   public int focused_class;
   public int moving_class;
   private Color focused_bound_color;
   
   public Canvas() {
      super();
      
      focused_class = -1; // There's no focused class at the beginning
      moving_class = -1;
      focused_bound_color = new Color(50, 205, 231);
      this.setLayout(null);
      this.setBackground(Color.white);
      // this.setSize(160, 500);
      this.addMouseMotionListener(this);
      canvasClasses = new ArrayList<CanvasClass>();
   }   

   public void createNewCanvasClass() {
      this.canvasClasses.add(new CanvasClass("New Class"));
      this.add(this.canvasClasses.get(this.canvasClasses.size()-1));
      this.setNewFocusedClass(canvasClasses.size()-1);
      this.repaint();
   }

    public void setNewFocusedClass(int new_focus_on) {
        if (focused_class != -1)
            canvasClasses.get(focused_class).setFocused(false);
        focused_class = new_focus_on;
        if (new_focus_on == -1)
            return;
        canvasClasses.get(new_focus_on).setFocused(true);
    }

    public ArrayList<CanvasClass> getCanvasClasses() {
        return this.canvasClasses;
    }

    // public int clickedOnAnyClass(int x, int y) {
    //     for (int i=0;i<canvasClasses.size();++i) {
    //         if (canvasClasses.get(i).clickedOnRectangle(x, y))
    //             return i;
    //     }
    //     return -1;
    // }

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

    public void eraseAll(){
        for(int i=this.canvasClasses.size(); i>=0; i--){
            this.deleteCanvasClass(i);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // for (int i=0;i<canvasClasses.size();++i) {
        //     canvasClasses.get(i).paintComponent(g);
        // }
        System.out.print("Canvas Component Count: ");
        System.out.println(this.getComponentCount());
    }
    
    public CanvasClass getFocusedCanvasClass() {
        if (focused_class == -1) {
            return null;
        }
        return this.canvasClasses.get(focused_class);
    }
   
    @Override
    public void mouseDragged(MouseEvent me) {
        if (focused_class != -1){
            // canvasClasses.get(focused_class).setXY(me.getX(), me.getY());
            this.canvasClasses.get(focused_class).recalculateGeometry(me.getX(), me.getY());
            this.repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent me) {}
}
