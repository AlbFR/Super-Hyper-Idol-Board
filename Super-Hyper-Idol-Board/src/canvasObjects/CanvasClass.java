package canvasObjects;

import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

// import org.w3c.dom.events.MouseEvent;

public class CanvasClass extends JPanel implements MouseListener, FocusListener {
	private static final Color focused_color = new Color(50, 205, 231);
	private static final Border focused_border = BorderFactory.createLineBorder(focused_color, 1);
	// private CanvasClassFramework structure;
	// private CanvasClassLabels labels;

	private CanvasClassName nameLabel;
	private LabelsPanel attributesPanel;
	private LabelsPanel methodsPanel;

	// private ArrayList<String> methods;
	private Color border_color = Color.black;
	public final static int WIDTH = 100;
	private boolean focused;
	private int BASE_HEIGHT_COMPONENT = 5;
	private int height = NAME_HEIGHT;

	public static final int NAME_HEIGHT = 20;
	public static final int ATTRIBUTE_HEIGHT = 15;
	public static final int METHOD_HEIGHT = 15;


	public CanvasClass(String name) {
		this.setBounds(20, 20, WIDTH, height);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setFocusable(true);
		this.addFocusListener(this);

		this.nameLabel = new CanvasClassName(name, this.getBounds().x, this.getBounds().y);
		this.attributesPanel = new LabelsPanel(0, CanvasClassName.HEIGHT);
		this.methodsPanel = new LabelsPanel(0, CanvasClassName.HEIGHT);

		// this.methods = new ArrayList<String>();

		// this.structure = new CanvasClassFramework(this.getBounds().x, this.getBounds().y);
		// this.labels = new CanvasClassLabels(this.getBounds().x, this.getBounds().y, name);
		this.setFocused(true);
		this.border_color = Color.BLACK;
		this.setBorder(BorderFactory.createLineBorder(this.border_color, 2));
		this.setBackground(Color.WHITE);
		
		// this.add(this.labels);
		this.add(this.nameLabel);
		// this.attributesPanel.setMinimumSize(new Dimension(CanvasClass.WIDTH, 5));
		// this.attributesPanel.setPreferredSize(new Dimension(CanvasClass.WIDTH, 5));
		this.add(this.attributesPanel);
		// this.methodsPanel.setMinimumSize(new Dimension(CanvasClass.WIDTH, 5));
		this.add(this.methodsPanel);
	}

	public void addAttribute(String attribute) {
		this.attributesPanel.addLabel(attribute);
		this.setSize(WIDTH, this.getBounds().height + CanvasClassAttribute.HEIGHT);
	}

	public void addMethod(String method) {
		this.methodsPanel.addLabel(method);
		this.setSize(WIDTH, this.getBounds().height + CanvasClassAttribute.HEIGHT);
	}

	public void setCanvasClassName(String name){
		this.nameLabel.setText(name);
	}

	public void setBorderColor(Color color) {
		this.border_color = color;
	}

	public boolean clickedOnRectangle(int x, int y) {
		if (x < this.getBounds().x || this.getBounds().x+this.getBounds().width < x)
			return false;
		if (y < this.getBounds().y || this.getBounds().y+this.getBounds().height < y)
			return false;
		return true;
	}

	public void setFocused(boolean focused) {
		if (focused) {
			this.setBorder(focused_border);
		}
		else {
			this.setBorder(BorderFactory.createLineBorder(this.border_color, 1));
		}
		this.focused = focused;
		// this.structure.setFocused(focused);
	}
	
	public void recalculateGeometry(int x, int y) {
		this.setBounds(x, y, WIDTH, this.getBounds().height);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	@Override
	public void mouseClicked(MouseEvent event) {}
	@Override
	public void mouseEntered(MouseEvent event) {}
	@Override
	public void mouseExited(MouseEvent event) {}
	@Override
	public void mousePressed(MouseEvent event) {}
	@Override
	public void mouseReleased(MouseEvent event) {}
	@Override
	public void focusGained(FocusEvent event) {
		this.setFocused(true);	
	}
	@Override
	public void focusLost(FocusEvent event) {
		this.setFocused(false);	
	}
}
