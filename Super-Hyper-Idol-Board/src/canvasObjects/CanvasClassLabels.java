package canvasObjects;

import java.awt.Graphics;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class CanvasClassLabels extends JPanel {
   public CanvasClassName name_label;
   public ArrayList<CanvasClassAttribute> attributes_label;
//    public ArrayList<JLabel> methods_label;
   private int x;
   private int y;
   private static int attribute_height = 15;
   
    public CanvasClassLabels(int x, int y, String name) {
        
        this.attributes_label = new ArrayList<CanvasClassAttribute>();
        
        this.setXY(x, y);
        this.name_label = new CanvasClassName(name, this.x, this.y);
        this.setBackground(Color.red);
        this.setVisible(true);
        this.add(this.name_label);
    }

    public void addAttribute(String attribute) {
        int attribute_y = this.y + attribute_height*this.attributes_label.size();
        this.attributes_label.add(new CanvasClassAttribute(attribute, this.x, attribute_y));
        // System.out.println(this.attributes_label);
        this.add(this.attributes_label.get(this.attributes_label.size()-1));
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y; 
    }

    public void printXY() {
        System.out.println(this.x);
        System.out.println(this.y);
    }
   
    public void recalculateGeometry(int x, int y) {
        this.setXY(x, y);
        this.name_label.recalculateGeometry(this.x, this.y);
        for (int i=0;i<this.attributes_label.size();++i) {
            this.attributes_label.get(i).recalculateGeometry(this.x, this.y);
        }
    }
   
    public void setCanvasClassLabelName(String name) {
        this.name_label.setName(name);
        // this.recalculateGeometry();
    }
      
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.paintComponents(g);
        for (int i=0;i<this.attributes_label.size();++i) {
            this.attributes_label.get(i).paintComponent(g);
        }
    }
}

abstract class CanvasClassTextLabel extends JLabel {
    protected static int width = 100;
    protected static int height;
    protected int x;
    protected int y;

    public CanvasClassTextLabel(String text, int x, int y) {
        this.setValue(text);
        this.recalculateGeometry(x, y);
        this.setVerticalAlignment(SwingConstants.CENTER);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setValue(String value) {
        this.setText(value);
    }

    public void recalculateGeometry(int x, int y) {
        this.setXY(x, y);
        this.setBounds(this.x, this.y, width, height);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}

class CanvasClassAttribute extends CanvasClassTextLabel {
    private static int width = 100;
    private static int height = 20;
    private int x;
    private int y;

    public CanvasClassAttribute(String text, int x, int y) {
        super(text, x, y);
        this.setHorizontalAlignment(SwingConstants.LEFT);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void recalculateGeometry(int x, int y) {
        this.setXY(x, y);
        this.setBounds(this.x, this.y, width, height);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}

class CanvasClassName extends CanvasClassTextLabel {
    private static int width = 100;
    private static int height = 20;
    private int x;
    private int y;

    public CanvasClassName(String text, int x, int y) {
        super(text, x, y);
        this.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public void setName(String name) {
        this.setText(name);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void recalculateGeometry(int x, int y) {
        this.setXY(x, y);
        this.setBounds(this.x, this.y, width, height);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}