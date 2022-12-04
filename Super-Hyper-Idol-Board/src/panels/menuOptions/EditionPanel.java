package panels.menuOptions;

import java.awt.GridLayout;
import java.awt.Graphics;
import javax.swing.JPanel;

import buttons.menuOptions.*;

public class EditionPanel extends JPanel {
   MenuButton create_class_button;
   MenuButton delete_class_button;

   public EditionPanel() {
      super();
      create_class_button = new CreateClassButton();
      delete_class_button = new DeleteClassButton();
      this.setLayout(new GridLayout(3, 2));
      this.add(create_class_button);
      this.add(delete_class_button);
      System.out.println(this.getComponents());
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}
