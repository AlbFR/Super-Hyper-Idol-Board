package panels.menuOptions;

import java.awt.GridLayout;
import java.awt.Graphics;
import javax.swing.JPanel;

import buttons.menuOptions.*;

import enums.SelectedDrawingOption;

public class EditionPanel extends JPanel {
   private SelectedDrawingOption selected_option;
   public MenuButton create_class_button;
   public MenuButton delete_class_button;

   public EditionPanel() {
      super();
      // create_class_button = new CreateClassButton();
      // delete_class_button = new DeleteClassButton();
      create_class_button = new MenuButton("Create Class");
      delete_class_button = new MenuButton("Delete Class");
      // create_class_button.addActionListener(event -> {
      //    selected_option = SelectedDrawingOption.CREATE_CLASS;
      // });
      // delete_class_button.addActionListener(event -> selected_option = SelectedDrawingOption.DELETE_CLASS);

      this.setLayout(new GridLayout(3, 2));
      this.add(create_class_button);
      this.add(delete_class_button);
   }

   public SelectedDrawingOption getSelectedOption() {
      return this.selected_option;
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
   }
}
