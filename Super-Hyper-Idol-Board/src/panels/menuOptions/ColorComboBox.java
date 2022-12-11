package panels.menuOptions;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.Dimension;

public class ColorComboBox extends JPanel {
    public JComboBox cmb;
    
    public ColorComboBox(){
        String [] colorOptions = {"Black" , "Red" , "Green" , "Blue"};
        cmb = new JComboBox(colorOptions);
        cmb.setPreferredSize(new Dimension(250,40));    
        
        this.add(cmb);
        this.setVisible(true);
    }
}
