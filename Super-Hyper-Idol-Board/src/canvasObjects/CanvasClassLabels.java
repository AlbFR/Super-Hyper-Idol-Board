package canvasObjects;

import java.awt.Graphics;
import java.awt.Color;

import java.util.ArrayList;
import javax.swing.JPanel;

public class CanvasClassLabels extends JPanel {
   public CanvasClassName name_label;
   public ArrayList<CanvasClassAttribute> attributes_label;
   public ArrayList<CanvasClassMethod> methods_label;
   private int x;
   private int y;
   private static int attribute_height = 15;
   private static int method_height = 15;
   private static int name_height = 15;
   
    public CanvasClassLabels(int x, int y, String name) {
        
        this.attributes_label = new ArrayList<CanvasClassAttribute>();
        this.methods_label = new ArrayList<CanvasClassMethod>();
        
        this.setXY(x, y);
        this.name_label = new CanvasClassName(name, this.x, this.y);
        this.setBackground(Color.red);
        this.setVisible(true);
        this.add(this.name_label);
    }

    public void addAttribute(String attribute) {
        int attribute_y = this.y + attribute_height*this.attributes_label.size() + name_height;
        this.attributes_label.add(new CanvasClassAttribute(attribute, this.x, attribute_y));
        this.add(this.attributes_label.get(this.attributes_label.size()-1));
        this.recalculateGeometry(this.x, this.y);
    }
    public void addMethod(String method) {
        int method_y = this.y + method_height*this.methods_label.size() + name_height;
        method_y += attribute_height * (this.attributes_label.size()-3);
        this.methods_label.add(new CanvasClassMethod(method, this.x, method_y));
        this.add(this.methods_label.get(this.methods_label.size()-1));
        this.recalculateGeometry(this.x, this.y);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y; 
    }

    public void recalculateGeometry(int x, int y) {
        this.setXY(x, y);
        this.name_label.recalculateGeometry(this.x, this.y);
        for (int i=0;i<this.attributes_label.size();++i) {
            this.attributes_label.get(i).recalculateGeometry(this.x, this.y + attribute_height*i+name_height);
        }
        for (int i=0;i<this.methods_label.size();++i) {
            this.methods_label.get(i).recalculateGeometry(this.x, this.y + method_height*i+name_height + attribute_height*(this.attributes_label.size()+2));
        }
    }
   
    public void setCanvasClassLabelName(String name) {
        this.name_label.setName(name);
    }
      
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.paintComponents(g);
        for (int i=0;i<this.attributes_label.size();++i) {
            this.attributes_label.get(i).paintComponent(g);
        }
        for (int i=0;i<this.methods_label.size();++i) {
            this.methods_label.get(i).paintComponent(g);
        }
    }
}