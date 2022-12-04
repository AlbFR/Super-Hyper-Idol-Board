package canvasObjects;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Color;

public class ClassCanvas {
   Rectangle bounds;
   private static Color color = Color.black;
   public ClassCanvas(int xi, int yi, int xf, int yf) {
      bounds = new Rectangle(xi, yi, xf-xi, yf-yi);
   }
   public void paintComponent(Graphics g) {
      g.setColor(color);
      g.drawRect(this.bounds.x, this.bounds.y, this.bounds.width, this.bounds.height);
   }
}
