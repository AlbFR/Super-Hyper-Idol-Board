package panels.menuOptions;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.*;

public class TextFieldPanel extends JPanel {
    public JTextField textField;
    
    public TextFieldPanel() {
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.addFocusListener(new FocusListener(){
            public void focusLost(FocusEvent e){
                textField.setText("Press Enter to submit text...");
            }
            public void focusGained(FocusEvent e){
                textField.setText("");
            }
        });

        this.add(textField);
        //this.pack();
        this.setVisible(false);
    }
}
