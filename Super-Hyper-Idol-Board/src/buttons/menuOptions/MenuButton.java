package buttons.menuOptions;

import java.awt.Graphics;
import javax.swing.JButton;

public class MenuButton extends JButton {
   public MenuButton(String button_text) {
      super();
      this.setFocusPainted(false);
      this.setSize(50, 200);
      this.setText(button_text);
   }
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}
