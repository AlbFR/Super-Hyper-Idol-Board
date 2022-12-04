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
   public CanvasClass() {
      structure = new CanvasClassFramework();
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
}

class CanvasClassFramework {
   Color bound_color = Color.black;
   static Color color = Color.black;
   Rectangle bounds;
   // ArrayList<Point> separation_points;
   Point separation_points[] = new Point[4];
   private static final int marginx = 5;
   private static final int marginy = 5;
   private static final int name_height = 10;
   private static final int attribute_height = 10;
   private static final int method_height = 10;

   public CanvasClassFramework() {
      bounds = new Rectangle(20, 20, 100, name_height + 6*marginy);
      separation_points[0] = new Point(this.bounds.x, this.bounds.y+2*marginy+name_height);
      separation_points[1] = new Point(this.bounds.x+this.bounds.width, this.bounds.y+2*marginy+name_height);
      separation_points[2] = new Point(this.bounds.x, this.bounds.y+4*marginy+name_height);
      separation_points[3] = new Point(this.bounds.x+this.bounds.width, this.bounds.y+4*marginy+name_height);

   }

   public void addAttribute() {
      this.bounds.width += attribute_height;
   }

   public void addMethod() {
      this.separation_points[2].y += method_height;
      this.separation_points[3].y += method_height;
      this.bounds.width += method_height;
   }

   public void paint(Graphics g) {
      g.setColor(bound_color);
      g.drawRect(this.bounds.x, this.bounds.y, this.bounds.width, this.bounds.height);
      g.setColor(color);
      g.drawLine(separation_points[0].x, separation_points[0].y, separation_points[1].x, separation_points[1].y);
      g.drawLine(separation_points[2].x, separation_points[2].y, separation_points[3].x, separation_points[3].y);
   }
}