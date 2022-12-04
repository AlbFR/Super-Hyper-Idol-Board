package buttons.menuOptions;

import java.awt.Graphics;
import javax.swing.JButton;

abstract public class MenuButton extends JButton {
   public MenuButton() {
      super();
      this.setFocusPainted(false);
      this.setSize(50, 200);
   }
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}
