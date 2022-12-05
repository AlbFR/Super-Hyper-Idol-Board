package panels.menuOptions;

import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

import buttons.menuOptions.*;

import enums.SelectedDrawingOption;

public class EditionPanel extends JPanel {
   private SelectedDrawingOption selected_option;
   public MenuButton create_class_button;
   public MenuButton delete_class_button;
   public MenuButton change_name_button;
   public MenuButton add_attribute_button;
   public MenuButton add_method_button;

   public EditionPanel() {
      super();
      create_class_button = new MenuButton("Create Class");
      delete_class_button = new MenuButton("Delete Class");
      change_name_button = new MenuButton("Change Name");
      add_attribute_button = new MenuButton("Add Attribute");
      add_method_button = new MenuButton("Add Method");

      this.setLayout(new GridLayout(3, 2));
      this.setBackground(new Color(50, 205, 232));
      this.add(create_class_button);
      this.add(delete_class_button);
      this.add(change_name_button);
      this.add(add_attribute_button);
      this.add(add_method_button);
   }

   public SelectedDrawingOption getSelectedOption() {
      return this.selected_option;
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}
