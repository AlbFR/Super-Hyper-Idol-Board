package panels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import canvasObjects.CanvasClass;

public class Canvas extends JPanel implements MouseMotionListener, MouseListener, Serializable { 
    private ArrayList<CanvasClass> canvasClasses;
    public int focused_class;
    public int moving_class;
    
    public Canvas() {
        super();
        
        focused_class = -1; // There's no focused class at the beginning
        moving_class = -1;
        this.setLayout(null);
        this.setBackground(Color.white);
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
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
            canvasClasses.get(focused_class).focusLost(null);
        focused_class = new_focus_on;
        if (new_focus_on == -1)
            return;
        canvasClasses.get(new_focus_on).focusGained(null);
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
        this.remove(this.canvasClasses.get(k));
        canvasClasses.remove(k);
        return true;
    }

    public void eraseAll(){
        for(int i=this.canvasClasses.size()-1; i>=0; i--){
            this.remove(this.canvasClasses.get(i));
            this.deleteCanvasClass(i);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // for (int i=0;i<canvasClasses.size();++i) {
        //     canvasClasses.get(i).paintComponent(g);
        // }
    }
    
    public CanvasClass getFocusedCanvasClass() {
        if (focused_class == -1) {
            return null;
        }
        return this.canvasClasses.get(focused_class);
    }
   
    @Override
    public void mouseDragged(MouseEvent me) {
        if (moving_class != -1){
            // canvasClasses.get(focused_class).setXY(me.getX(), me.getY());
            this.canvasClasses.get(moving_class).recalculateGeometry(me.getX(), me.getY());
            this.repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent me) {}

    @Override
    public void mouseClicked(MouseEvent event) {
        // TODO Auto-generated method stub
        int clickedOn = this.clickedOnAnyClass(event.getX(), event.getY());
        this.setNewFocusedClass(clickedOn);
        moving_class = clickedOn;
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent event) {
        int clickedOn = this.clickedOnAnyClass(event.getX(), event.getY());
        this.setNewFocusedClass(clickedOn);
        moving_class = clickedOn;
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub
        moving_class = -1;
        
    }
}
