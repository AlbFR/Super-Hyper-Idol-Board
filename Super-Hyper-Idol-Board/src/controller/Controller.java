package controller;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.BorderLayout;
import javax.swing.JPanel;

import panels.*;

public class Controller extends JPanel implements MouseListener {
   private Canvas canvas;
   private MenuOptions menuOptions;
   public Controller() {
      canvas = new Canvas(); // View
      menuOptions = new MenuOptions(); // Model
      
      menuOptions.editionPanel.create_class_button.addActionListener(event -> {
         canvas.createNewCanvasClass();
         canvas.repaint();
      });

      this.setLayout(new BorderLayout(160, 40));      
      this.add(menuOptions, BorderLayout.WEST);
      this.add(canvas, BorderLayout.CENTER);
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      menuOptions.paintComponent(g);
      canvas.paintComponents(g);
   }

   @Override
   public void mouseClicked(MouseEvent me) {
      // System.out.println(me.getX()-160);
      // System.out.println(me.getY()-40);
   }
   @Override
   public void mousePressed(MouseEvent me) {}
   @Override
   public void mouseReleased(MouseEvent me) {}
   @Override
   public void mouseEntered(MouseEvent me) {}
   @Override
   public void mouseExited(MouseEvent me) {}
}
