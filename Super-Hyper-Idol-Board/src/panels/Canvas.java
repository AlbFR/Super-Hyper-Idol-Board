package panels;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import canvasObjects.*;

enum selectedDrawingOption {
   CREATE_CLASS
}

public class Canvas extends JPanel implements MouseListener {
   private ArrayList<ClassCanvas> canvasClasses;
   public Canvas() {
      super();

      this.setBackground(Color.white);
   }   

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }

   @Override
   public void mouseClicked(MouseEvent me) {

      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   }

   @Override
   public void mousePressed(MouseEvent me) {
      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   }

   @Override
   public void mouseReleased(MouseEvent me) {
      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   }

   @Override
   public void mouseEntered(MouseEvent me) {
      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   }

   @Override
   public void mouseExited(MouseEvent me) {
      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   }
}
