package controller;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.awt.BorderLayout;

import javax.swing.JPanel;

import panels.*;

public class Controller extends JPanel implements MouseListener {
	private Canvas canvas;
	private MenuOptions menuOptions;
	private int name_meth_attr_flag;

	public Controller() {
		this.canvas = new Canvas(); // View
		try {
			ObjectInputStream readingFile = new ObjectInputStream(new FileInputStream("canvas.dat"));
			this.canvas = (Canvas)readingFile.readObject();
			readingFile.close();
		}
		catch (Exception e) {
			System.out.println(e);
			this.canvas = new Canvas(); // View
		}
		this.menuOptions = new MenuOptions(); // Model
		this.setFocusable(false);
	  
		menuOptions.editionPanel.create_class_button.addActionListener(event -> {
			canvas.createNewCanvasClass();
			canvas.repaint();
		});

		menuOptions.editionPanel.delete_class_button.addActionListener(event -> {
			canvas.deleteCanvasClass(canvas.focused_class);
			canvas.repaint();
		});

		menuOptions.editionPanel.change_name_button.addActionListener(event -> {
			if(this.canvas.getFocusedCanvasClass() != null){
				name_meth_attr_flag = 1;
				menuOptions.textFieldPanel.setVisible(true);
				menuOptions.textFieldPanel.textField.setText("Press Enter to submit name...");
				menuOptions.repaint();
			}
		});

		menuOptions.editionPanel.change_color_button.addActionListener(event -> {
			if(this.canvas.getFocusedCanvasClass() != null){
				menuOptions.colorComboBox.setVisible(true);
				menuOptions.repaint();
			}
		});

		menuOptions.colorComboBox.button.addActionListener(event -> {
			if(this.canvas.getFocusedCanvasClass() != null){
				canvas.getFocusedCanvasClass().setBorderColor(menuOptions.colorComboBox.getColor());
				canvas.repaint();
				menuOptions.colorComboBox.setVisible(false);
				menuOptions.repaint();
			}
		});

		menuOptions.editionPanel.add_attribute_button.addActionListener(event -> {
			if(this.canvas.getFocusedCanvasClass() != null){
				name_meth_attr_flag = 2;
				menuOptions.textFieldPanel.setVisible(true);
				menuOptions.repaint();
			}
		});

		menuOptions.editionPanel.add_method_button.addActionListener(event -> {
			if(this.canvas.getFocusedCanvasClass() != null){
				name_meth_attr_flag = 3;
				menuOptions.textFieldPanel.setVisible(true);
				menuOptions.repaint();
			}
		});

		menuOptions.textFieldPanel.textField.addActionListener(event -> {
			if (this.canvas.getFocusedCanvasClass() != null) {
				if (name_meth_attr_flag == 1) {
						this.canvas.getFocusedCanvasClass().setCanvasClassName(menuOptions.textFieldPanel.textField.getText());
						this.canvas.repaint();
				}
				if (name_meth_attr_flag == 2) {
						this.canvas.getFocusedCanvasClass().addAttribute(menuOptions.textFieldPanel.textField.getText());
						this.canvas.repaint();
				}
				if (name_meth_attr_flag == 3) {
						this.canvas.getFocusedCanvasClass().addMethod(menuOptions.textFieldPanel.textField.getText());
						this.canvas.repaint();
				}
				menuOptions.textFieldPanel.setVisible(false);
			}
		});

		menuOptions.layerSwitcherButtons.layer_one.addActionListener(event -> {
			if (menuOptions.layerSwitcherButtons.getInLayerOne() == true) {
				System.out.println("Already in Layer One.");
			} else {
				System.out.println("Switched to Layer One");
				menuOptions.layerSwitcherButtons.in_layer_one = true;
			}
		});

		menuOptions.layerSwitcherButtons.save.addActionListener(event -> {
			System.out.println("Progress saved.");
			try {
				ObjectOutputStream writingFile = new ObjectOutputStream(new FileOutputStream("canvas.dat"));
				writingFile.writeObject(this.canvas);
				writingFile.close();
			}
			catch (Exception e) {
				System.out.println(e);
			}
		});

		menuOptions.layerSwitcherButtons.layer_two.addActionListener(event -> {
			if (menuOptions.layerSwitcherButtons.getInLayerOne() == false) {
				System.out.println("Already in Layer Two.");
			} else {
				System.out.println("Switched to Layer Two");
				menuOptions.layerSwitcherButtons.in_layer_one = false;
			}
		});

		menuOptions.editionPanel.erase_all.addActionListener(event -> {
			this.canvas.eraseAll();
			this.canvas.repaint();
		});

		menuOptions.editionPanel.draw_line_button.addActionListener(event -> {

		});

		this.setLayout(new BorderLayout());
		this.add(menuOptions, BorderLayout.WEST);
		this.add(canvas, BorderLayout.CENTER);
		this.addMouseListener(this);
		this.canvas.addMouseListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// menuOptions.paintComponent(g);
		// canvas.paintComponent(g);
	}

	public void setNewFocusedClass(int new_focus) {
		this.canvas.setNewFocusedClass(new_focus);
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		// setNewFocusedClass(canvas.clickedOnAnyClass(me.getX(), me.getY()));
		// this.repaint();
		// this.canvas.moving_class = this.canvas.clickedOnAnyClass(me.getX(), me.getY());
		// this.repaint();
	}

	@Override
	public void mousePressed(MouseEvent me) {
		// setNewFocusedClass(canvas.clickedOnAnyClass(me.getX(), me.getY()));
		// this.canvas.moving_class = this.canvas.clickedOnAnyClass(me.getX(), me.getY());
		// this.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent me) {
	}

	@Override
	public void mouseEntered(MouseEvent me) {
	}

	@Override
	public void mouseExited(MouseEvent me) {
	}
}
