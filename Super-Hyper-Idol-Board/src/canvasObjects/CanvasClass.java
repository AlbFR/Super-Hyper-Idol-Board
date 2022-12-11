package canvasObjects;

import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class CanvasClass extends JPanel {
	private CanvasClassFramework structure;
	private CanvasClassLabels labels;
	private String name;
	private ArrayList<String> attributes;
	private ArrayList<String> methods;
	private static Color color = Color.black;
	private boolean focused;
	private int x;
	private int y;
	public CanvasClass(String name) {
		this.x = 20;
		this.y = 20;
		this.structure = new CanvasClassFramework(this.x, this.y);
		this.labels = new CanvasClassLabels(this.x, this.y, name);
		this.setFocused(true);
		this.setBorder(BorderFactory.createLineBorder(Color.green, 2));
		
		this.add(this.labels);
	}
	public void addAttribute(String attribute) {
		attributes.add(attribute);
		structure.addAttribute();
	}
	public void addMethod(String method) {
		methods.add(method);
		structure.addMethod();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.structure.paint(g);
		this.labels.paintComponent(g);
	}

	public boolean clickedOnRectangle(int x, int y) {
		return this.structure.clickedOnRectangle(x, y);
	}
	
	public void setCanvasClassName(String name){
		this.name = name;
		this.labels.setCanvasClassLabelName(name);
	}


   public void setBoundColor(Color bound_color) {
      this.structure.bound_color = bound_color;
      this.structure.setBoundColor(bound_color);
   }
   
   public void setFocused(boolean focused){
      this.focused = focused;
      this.structure.setFocused(focused);
   }
   
   public void setXY(int x, int y) {
       this.x = x;
       this.y = y;
       this.structure.setXY(x,y);
       this.labels.setXY(x,y);
       this.repaint();
   }
   public void recalculateGeometry(int x, int y) {
       this.structure.recalculateGeometry(x, y);
       this.labels.recalculateGeometry(x, y);
   }
}
