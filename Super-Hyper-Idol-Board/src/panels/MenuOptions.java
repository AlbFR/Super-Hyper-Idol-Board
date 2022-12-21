package panels;

import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JPanel;

import enums.SelectedDrawingOption;
import panels.menuOptions.EditionPanel;
import panels.menuOptions.LayerSwitcherButtons;
import panels.menuOptions.ColorComboBox;
import panels.menuOptions.TextFieldPanel;

public class MenuOptions extends JPanel {
   public EditionPanel editionPanel;
   public TextFieldPanel textFieldPanel;
   public ColorComboBox colorComboBox;
   public LayerSwitcherButtons layerSwitcherButtons;
   public MenuOptions() {
      super();

      this.setBackground(Color.lightGray);
      this.setLayout(new GridLayout(4, 0));
      
      editionPanel = new EditionPanel();
      textFieldPanel = new TextFieldPanel();
      colorComboBox = new ColorComboBox();
      layerSwitcherButtons = new LayerSwitcherButtons();
      
      // this.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
     
      this.add(editionPanel);
      this.add(textFieldPanel);
      this.add(colorComboBox);
      this.add(layerSwitcherButtons);
   }

   

   public SelectedDrawingOption getSelectedOption() {
      return editionPanel.getSelectedOption();
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}
