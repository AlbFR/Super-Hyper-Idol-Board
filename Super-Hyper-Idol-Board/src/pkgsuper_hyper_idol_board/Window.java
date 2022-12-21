package pkgsuper_hyper_idol_board;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

import javax.swing.JFrame;

import controller.Controller;

public class Window extends JFrame {
   public Window() {
      super();
      this.setSize(1100, 700);
      this.setLayout(new BorderLayout(160, 40));
      this.setTitle("Super Idol Board");
      this.setFocusable(false);

      Controller controller;
 		try {
			ObjectInputStream readingFile = new ObjectInputStream(new FileInputStream("controller.dat"));
			controller = (Controller)readingFile.readObject();
			readingFile.close();
		}
		catch (Exception e) {
			System.out.println(e);
			controller = new Controller(); // View
      }
      this.add(controller);

      this.setVisible(true);
      this.setBackground(Color.black);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}
