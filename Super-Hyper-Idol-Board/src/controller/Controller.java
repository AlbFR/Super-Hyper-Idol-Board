package controller;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import panels.*;
import canvasObjects.CanvasClass;

public class Controller extends JPanel implements MouseListener {
   private Canvas canvas;
   private MenuOptions menuOptions;
   private String text; 
   public Controller() {
      canvas = new Canvas(); // View
      menuOptions = new MenuOptions(); // Model
      
      menuOptions.editionPanel.create_class_button.addActionListener(event -> {
         canvas.createNewCanvasClass();
         canvas.repaint();
      });

      menuOptions.editionPanel.delete_class_button.addActionListener(event -> {
         canvas.deleteCanvasClass(canvas.focused_class);
         canvas.repaint();
      });
      
      menuOptions.editionPanel.change_name_button.addActionListener(event -> {
        CanvasClass c = canvas.getFocusedCanvasClass();  
        c.setCanvasClassName(menuOptions.textFieldPanel.textField.getText());
        canvas.repaint();
      });

      

      // menuOptions.editio

      this.setBackground(Color.CYAN);
      this.setLayout(new BorderLayout(160, 40));      
      this.add(menuOptions, BorderLayout.WEST);
      this.add(canvas, BorderLayout.CENTER);
      this.addMouseListener(this);
      this.canvas.addMouseListener(this);
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      menuOptions.paintComponent(g);
      canvas.paintComponent(g);
   }

   public void setNewFocusedClass(int new_focus) {
      this.canvas.setNewFocusedClass(new_focus);
   }

   @Override
   public void mouseClicked(MouseEvent me) {
      setNewFocusedClass(canvas.clickedOnAnyClass(me.getX(), me.getY()));
      this.repaint();
      this.canvas.moving_class = this.canvas.clickedOnAnyClass(me.getX(), me.getY());
      this.repaint();
   }
   @Override
   public void mousePressed(MouseEvent me) {
      setNewFocusedClass(canvas.clickedOnAnyClass(me.getX(), me.getY()));
      this.canvas.moving_class = this.canvas.clickedOnAnyClass(me.getX(), me.getY());
      this.repaint();
   }
   @Override
   public void mouseReleased(MouseEvent me) {}
   @Override
   public void mouseEntered(MouseEvent me) {}
   @Override
   public void mouseExited(MouseEvent me) {}
}
