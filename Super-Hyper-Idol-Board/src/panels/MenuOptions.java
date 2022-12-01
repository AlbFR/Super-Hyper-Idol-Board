package panels;

import java.awt.Graphics;

import javax.swing.JPanel;

import panels.menuOptions.EditionPanel;
import panels.menuOptions.LayerChanger;

public class MenuOptions extends JPanel {
   public MenuOptions() {
      super();

      this.setSize(150, 50);
      this.add(new EditionPanel());
      this.add(new LayerChanger());
   }
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}
