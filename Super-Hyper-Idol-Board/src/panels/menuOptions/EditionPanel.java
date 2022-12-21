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
   public MenuButton change_color_button;
   public MenuButton layerSwitcherButtons;
   public MenuButton draw_line_button;
   public MenuButton diamond_button;
   public MenuButton free_draw;
   public MenuButton erase_all;

   public EditionPanel() {
      super();
      create_class_button = new MenuButton("Create Class");
      delete_class_button = new MenuButton("Delete Class");
      change_name_button = new MenuButton("Change Name");
      add_attribute_button = new MenuButton("Add Attribute");
      add_method_button = new MenuButton("Add Method");
      change_color_button = new MenuButton("Change Color");
      draw_line_button = new MenuButton("Draw Line");
      diamond_button = new MenuButton("Draw Diamond");
      free_draw = new MenuButton("Free Draw");
      erase_all = new MenuButton("Erase All");

      this.setLayout(new GridLayout(5, 2));
      this.setBackground(new Color(50, 205, 232));
      this.add(create_class_button);
      this.add(delete_class_button);
      this.add(change_name_button);
      this.add(change_color_button);
      this.add(add_attribute_button);
      this.add(add_method_button);
      this.add(draw_line_button);
      this.add(diamond_button);
      this.add(free_draw);
      this.add(erase_all);
   }

   public SelectedDrawingOption getSelectedOption() {
      return this.selected_option;
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}
