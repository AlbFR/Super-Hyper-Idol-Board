package pkgsuper_hyper_idol_board;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

// import controller.Controller;
// import panels.MenuOptions;
// import panels.Canvas;
// import controller.Controller;

public class Window extends JFrame {
   public Window() {
      super();
      this.setSize(800, 500);
      this.setLayout(new BorderLayout(160, 40));
      this.setTitle("Board");

      this.add(new controller.Controller());
      // this.add(new MenuOptions(), BorderLayout.WEST);
      // this.add(new Canvas(), BorderLayout.CENTER);

      this.setVisible(true);
      this.setBackground(Color.black);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}
