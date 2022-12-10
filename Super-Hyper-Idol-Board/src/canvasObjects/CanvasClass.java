package canvasObjects;

import java.awt.Rectangle;
import java.awt.Point;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Color;

public class CanvasClass {
   private CanvasClassFramework structure;
   private String name;
   private ArrayList<String> attributes;
   private ArrayList<String> methods;
   private static Color color = Color.black;
   private int x;
   private int y;
   public CanvasClass() {
      this.x = 20;
      this.y = 20;
      structure = new CanvasClassFramework(this.x, this.y);
   }
   public void addAttribute(String attribute) {
      attributes.add(attribute);
      structure.addAttribute();
   }
   public void addMethod(String method) {
      methods.add(method);
      structure.addMethod();
   }
   public void paint(Graphics g) {
      this.structure.paint(g);
   }

   public boolean clickedOnRectangle(int x, int y) {
      return this.structure.clickedOnRectangle(x, y);
   }

   public void setBoundColor(Color bound_color) {
      this.structure.bound_color = bound_color;
   }
   public void setXY(int x, int y) {
       this.x = x;
       this.y = y;
       this.structure.setXY(x,y);
   }
   public void recalculateGeometry() {
       this.structure.recalculateGeometry();
   }
}
