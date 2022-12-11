package panels;

import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JPanel;

import panels.menuOptions.EditionPanel;
import panels.menuOptions.LayerChanger;

import enums.SelectedDrawingOption;
import panels.menuOptions.TextFieldPanel;

public class MenuOptions extends JPanel {
   public EditionPanel editionPanel;
   public TextFieldPanel textFieldPanel;
   public LayerChanger layerChanger;
   public MenuOptions() {
      super();

      this.setBackground(Color.lightGray);
      this.setLayout(new GridLayout(3, 0));

      editionPanel = new EditionPanel();
      textFieldPanel = new TextFieldPanel();
      layerChanger = new LayerChanger();
     
      this.add(editionPanel);
      this.add(textFieldPanel);
      this.add(layerChanger);
   }

   public SelectedDrawingOption getSelectedOption() {
      return editionPanel.getSelectedOption();
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}
