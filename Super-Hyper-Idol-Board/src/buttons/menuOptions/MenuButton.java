package buttons.menuOptions;

import java.awt.Graphics;
import javax.swing.JButton;

abstract public class MenuButton extends JButton {
   public MenuButton(String buttonText) {
      super();
      this.setText(buttonText);
   }
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}
