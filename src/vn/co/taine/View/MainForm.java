package vn.co.taine.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MainForm {

	public MainForm() {
		JFrame frame = new JFrame("TopLevelDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar greenMenuBar = new JMenuBar();
		greenMenuBar.setOpaque(true);
		greenMenuBar.setBackground(new Color(255,0,0));
		greenMenuBar.setPreferredSize(new Dimension(400,20));
		
		JLabel yellowLabel = new JLabel();
		yellowLabel.setOpaque(true);
		yellowLabel.setBackground(new Color(0,255,0));
		yellowLabel.setPreferredSize(new Dimension(20,599));	
		
		JPanel panel = new JPanel();
		panel.setOpaque(true);
		panel.setBackground(new Color(0,0,255));
		panel.setPreferredSize(new Dimension(200,200));
		
		frame.setJMenuBar(greenMenuBar);
		frame.getContentPane().add(yellowLabel,BorderLayout.CENTER);
		frame.add(panel,BorderLayout.EAST);
		frame.add(panel,BorderLayout.WEST);
		frame.getContentPane().add(panel,BorderLayout.EAST);
		
		
		
		frame.pack();
		frame.setVisible(true);
	
	}

}
