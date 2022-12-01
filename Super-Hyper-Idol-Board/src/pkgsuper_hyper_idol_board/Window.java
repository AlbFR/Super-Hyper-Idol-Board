package pkgsuper_hyper_idol_board;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

import panels.MenuOptions;
import panels.Canvas;

public class Window extends JFrame {
   public Window() {
      super();
      this.setSize(900, 600);
      this.setLayout(new BorderLayout(170, 40));
      this.setTitle("Board");

      this.add(new MenuOptions(), BorderLayout.WEST);
      this.add(new Canvas(), BorderLayout.CENTER);

      this.setVisible(true);
      this.setBackground(Color.black);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}
