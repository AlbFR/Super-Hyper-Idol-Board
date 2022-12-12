package canvasObjects;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

class CanvasClassFramework {
   public Color bound_color = Color.black;
   static Color color = Color.black;
   Rectangle bounds;
   // ArrayList<Point> separation_points;
   Point separation_points[] = new Point[4];
   private static final int marginx = 5;
   private static final int marginy = 5;
   private static final int name_height = 10;
   private static final int attribute_height = 10 + marginy;
   private static final int method_height = 10;
   private int attributes_amount;
   private int methods_amount;

   public CanvasClassFramework(int x, int y) {
      attributes_amount = 0;
      methods_amount = 0;
      bounds = new Rectangle(x, y, 100, name_height + 6*marginy);
      separation_points[0] = new Point(this.bounds.x, this.bounds.y+2*marginy+name_height);
      separation_points[1] = new Point(this.bounds.x+this.bounds.width, this.bounds.y+2*marginy+name_height);
      separation_points[2] = new Point(this.bounds.x, this.bounds.y+4*marginy+name_height);
      separation_points[3] = new Point(this.bounds.x+this.bounds.width, this.bounds.y+4*marginy+name_height);
   }
   
   public void addAttribute() {
      this.attributes_amount++;
      this.bounds.height += attribute_height;
      this.separation_points[2].y += attribute_height;
      this.separation_points[3].y += attribute_height;
   }

   public void addMethod() {
      this.methods_amount++;
      // this.separation_points[2].y += method_height;
      // this.separation_points[3].y += method_height;
      this.bounds.height += method_height;
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

   public void paint(Graphics g) {
      g.setColor(bound_color);
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
      separation_points[2] = new Point(this.bounds.x, this.bounds.y+attributes_amount*(marginy+attribute_height+1)+name_height+20);
      separation_points[3] = new Point(this.bounds.x+this.bounds.width, this.bounds.y+attributes_amount*(marginy+attribute_height+1)+name_height+20);
   }
}
