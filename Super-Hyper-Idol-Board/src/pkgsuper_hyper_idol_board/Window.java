package pkgsuper_hyper_idol_board;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import controller.Controller;

public class Window extends JFrame {
   public Controller controller;
   public Window() {
      super();
      this.setSize(1100, 700);
      this.setLayout(new BorderLayout(160, 40));
      this.setTitle("Super Idol Board");
      this.setFocusable(false);
      
      controller = new Controller();
      this.add(controller);

      this.setVisible(true);
      this.setBackground(Color.black);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}
