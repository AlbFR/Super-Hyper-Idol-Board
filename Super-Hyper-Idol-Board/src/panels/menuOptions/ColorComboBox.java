package panels.menuOptions;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.GridLayout;

public class ColorComboBox extends JPanel implements ActionListener {
    public JComboBox cmb;
    public JButton button;
    public Color color;
    public String aux;
    
    public ColorComboBox() {
        String [] colorOptions = {"Black" , "Red" , "Green" , "Blue"};
        cmb = new JComboBox(colorOptions);
        button = new JButton("Ok");
        cmb.setPreferredSize(new Dimension(250,40)); 
        cmb.setSelectedIndex(0);
        cmb.addActionListener(this);
        this.setLayout(new GridLayout(0,2));
        
        this.add(cmb);
        this.add(button);
        this.setVisible(false);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmb) {
            aux = (String)cmb.getSelectedItem();
            switch(aux) {
                case "Black":
                        color = Color.BLACK;
                        break;
                case "Red":
                        color = Color.RED;
                        break;
                case "Green":
                        color = Color.GREEN;
                        break;
                case "Blue":
                        color = Color.BLUE;
            }
        }
    }
    public Color getColor(){
        return color;
    }
}
