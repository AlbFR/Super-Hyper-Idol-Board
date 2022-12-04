package panels;

import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JPanel;

import panels.menuOptions.EditionPanel;
import panels.menuOptions.LayerChanger;

import enums.SelectedDrawingOption;

public class MenuOptions extends JPanel {
   public EditionPanel editionPanel;
   public LayerChanger layerChanger;
   public MenuOptions() {
      super();

      this.setBackground(Color.lightGray);

      editionPanel = new EditionPanel();
      layerChanger = new LayerChanger();
      this.add(editionPanel);
      this.add(layerChanger);
   }

   public SelectedDrawingOption getSelectedOption() {
      return editionPanel.getSelectedOption();
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}
