package pkgsuper_hyper_idol_board;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

public class Window extends JFrame {
   public Window() {
      super();
      this.setSize(1100, 700);
      this.setLayout(new BorderLayout(160, 40));
      this.setTitle("Idol Board");
      this.setFocusable(false);

      this.add(new controller.Controller());

      this.setVisible(true);
      this.setBackground(Color.black);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}
