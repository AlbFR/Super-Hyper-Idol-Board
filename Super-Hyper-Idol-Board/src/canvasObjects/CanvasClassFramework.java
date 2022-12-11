package canvasObjects;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

class CanvasClassFramework {
   public Color bound_color;
   static Color color;
   private boolean focused;
   private static Color focused_color = new Color(50,210,230);
   Rectangle bounds;
   // ArrayList<Point> separation_points;
   Point separation_points[] = new Point[4];
   private static final int marginx = 5;
   private static final int marginy = 5;
   private static final int name_height = 10;
   private static final int attribute_height = 10;
   private static final int method_height = 10;

   public CanvasClassFramework(int x, int y) {
      bounds = new Rectangle(x, y, 100, name_height + 6*marginy);
      this.bound_color = Color.BLACK;
      this.color = Color.BLACK;
      this.setFocused(true);
      
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

   public boolean clickedOnRectangle(int x, int y) {
      if (x < this.bounds.x || this.bounds.x+this.bounds.width < x) {
         return false;
      }
      if (y < this.bounds.y || this.bounds.y+this.bounds.height < y) {
         return false;
      }
      return true;
   }

   public void setBoundColor(Color bound_color) {
      this.bound_color = bound_color;
      this.color = bound_color;
   }
   
   public void setFocused(boolean focused){
       this.focused = focused;
   }
   
   public void paint(Graphics g) {
      if(this.focused) {
          g.setColor(focused_color);
      }else {
          g.setColor(bound_color);
      }
          g.drawRect(this.bounds.x, this.bounds.y, this.bounds.width, this.bounds.height);
          g.setColor(color);
          g.drawLine(separation_points[0].x, separation_points[0].y, separation_points[1].x, separation_points[1].y);
          g.drawLine(separation_points[2].x, separation_points[2].y, separation_points[3].x, separation_points[3].y);
   }
   
   public void setXY(int x, int y) {
       this.bounds.x = x;
       this.bounds.y = y; 
   }
   public void recalculateGeometry() {
      separation_points[0] = new Point(this.bounds.x, this.bounds.y+2*marginy+name_height);
      separation_points[1] = new Point(this.bounds.x+this.bounds.width, this.bounds.y+2*marginy+name_height);
      separation_points[2] = new Point(this.bounds.x, this.bounds.y+4*marginy+name_height);
      separation_points[3] = new Point(this.bounds.x+this.bounds.width, this.bounds.y+4*marginy+name_height);
   }
}
