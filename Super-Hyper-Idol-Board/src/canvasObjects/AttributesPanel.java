package canvasObjects;

import java.util.ArrayList;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
// import javax.swing.JLabel;

public class AttributesPanel extends JPanel {
	private ArrayList<CanvasClassAttribute> labels;
	private static final int WIDTH = 100;

	public AttributesPanel(int x, int y) {
		labels = new ArrayList<CanvasClassAttribute>();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBounds(x, y, WIDTH, 10);
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
	}

	public void addAttribute(String attribute) {
		this.labels.add(new CanvasClassAttribute(attribute, this.getBounds().x, this.getBounds().y + this.labels.size()*CanvasClassAttribute.HEIGHT));
		// this.setSize(WIDTH, this.labels.size() * CanvasClassAttribute.HEIGHT);
		this.setHeight(CanvasClassAttribute.HEIGHT * this.labels.size());
		this.add(this.labels.get(this.labels.size()-1));
	}

	private void setHeight(int h) {
		this.setBounds(this.getBounds().x, this.getBounds().y, WIDTH, h);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i=0;i<this.labels.size();++i) {
			this.labels.get(i).paintComponent(g);
		}
	}
}
