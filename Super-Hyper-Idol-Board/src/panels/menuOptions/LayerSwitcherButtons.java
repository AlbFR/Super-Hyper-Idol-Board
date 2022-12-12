package panels.menuOptions;

import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

import buttons.menuOptions.*;
import enums.SelectedDrawingOption;

public class LayerSwitcherButtons extends JPanel{
    private SelectedDrawingOption selected_option;
    public MenuButton layer_one;
    public MenuButton layer_two;
    public boolean in_layer_one;

    public LayerSwitcherButtons(){
        super();
        layer_one = new MenuButton("Layer One");
        layer_two = new MenuButton("Layer Two");
        in_layer_one = true;

        this.setLayout(new GridLayout(2,1));
        this.setBackground(new Color(50, 205, 232));
        this.add(layer_one);
        this.add(layer_two);

    }
    public SelectedDrawingOption getSelectedOption() {
        return this.selected_option;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public boolean getInLayerOne(){
        return in_layer_one;
    }
}
