package vn.co.taine.View;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MainForm implements ItemListener{
	String switchArr[]= {"BUTTONPANEL","TEXTPANEL"};
	JFrame frame = new JFrame("TopLevelDemo");
	JMenuBar greenMenuBar = new JMenuBar();
	CardLayout cl = new CardLayout();
	JPanel cards = new JPanel();	
	JComboBox cb = new JComboBox(switchArr);
	
	public MainForm()  {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		greenMenuBar.setOpaque(true);
		greenMenuBar.setBackground(new Color(255, 0, 0));
		greenMenuBar.setPreferredSize(new Dimension(400, 20));

		// body

		JButton btnPannel = new JButton("btnPannel");
		btnPannel.setOpaque(true);
		btnPannel.setBackground(new Color(255, 255, 0));
		btnPannel.setPreferredSize(new Dimension(130, 50));

		JPanel BUTTONPANEL = new JPanel();
		BUTTONPANEL.add(btnPannel);

		JTextField txtField = new JTextField("txtField");
		txtField.setOpaque(true);
		txtField.setBackground(new Color(255, 255, 0));
		txtField.setPreferredSize(new Dimension(130, 50));

		JPanel TEXTPANEL = new JPanel();
		TEXTPANEL.add(txtField);

		JButton btnOne = new JButton("switch to 2");
		JButton btnSecond = new JButton("switch to 1");

	
		cards.setLayout(cl);

		BUTTONPANEL.add(btnOne);
		TEXTPANEL.add(btnSecond);

		cards.add(BUTTONPANEL, "BUTTONPANEL");
		cards.add(TEXTPANEL, "TEXTPANEL");

		BUTTONPANEL.setBackground(Color.blue);
		TEXTPANEL.setBackground(Color.YELLOW);
		

		
		

		cl.show(cards, "BUTTONPANEL");

		btnOne.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				cl.show(cards, "TEXTPANEL");
				cb.setSelectedIndex(1);
			}
		});

		btnSecond.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				cl.show(cards, "BUTTONPANEL");
				cb.setSelectedIndex(0);
			}
		});
		
		cb.addItemListener(this); 		
		

		JLabel yellowLabel = new JLabel();
		yellowLabel.setOpaque(true);
		yellowLabel.setBackground(new Color(0, 255, 0));
		yellowLabel.setPreferredSize(new Dimension(200, 409));
		
		

		
		
		JPanel panelBody = new JPanel();
		panelBody.add(yellowLabel);
		panelBody.add(Box.createGlue());
		panelBody.add(cards);
		panelBody.add(Box.createGlue());
		panelBody.add(cb);

		// right
		JButton btnAdd = new JButton("Add me");
		btnAdd.setOpaque(true);
		btnAdd.setBackground(new Color(255, 255, 0));
		btnAdd.setPreferredSize(new Dimension(130, 50));

		JButton btnDelete = new JButton("Delete me");
		btnDelete.setOpaque(true);
		btnDelete.setBackground(new Color(255, 0, 0));
		btnDelete.setPreferredSize(new Dimension(130, 50));

		JButton btnModified = new JButton("Modified me");
		btnModified.setOpaque(true);
		btnModified.setBackground(new Color(255, 255, 0));
		btnModified.setPreferredSize(new Dimension(130, 50));

		JButton btnProperties = new JButton("Properties");
		btnProperties.setOpaque(true);
		btnProperties.setBackground(new Color(255, 0, 0));
		btnProperties.setPreferredSize(new Dimension(130, 50));

		JButton btnClear = new JButton("Clear");
		btnClear.setOpaque(true);
		btnClear.setBackground(new Color(255, 255, 0));
		btnClear.setPreferredSize(new Dimension(130, 50));

		JPanel panel = new JPanel();
		panel.setOpaque(true);
		panel.setBackground(new Color(0, 0, 255));
		panel.setPreferredSize(new Dimension(200, 200));
		panel.add(btnAdd);
		panel.add(Box.createVerticalGlue());
		panel.add(btnDelete);
		panel.add(Box.createRigidArea(new Dimension(5, 0)));
		panel.add(btnModified);
		panel.add(Box.createHorizontalStrut(10));
		panel.add(btnProperties);
		panel.add(Box.createVerticalStrut(10));
		panel.add(btnClear);

		JPanel grid = new JPanel();
		GridLayout layout = new GridLayout(2, 2);
		grid.setLayout(layout);
		grid.setOpaque(true);
		grid.setBackground(new Color(171, 155, 122));
		grid.setPreferredSize(new Dimension(50, 60));

		JButton btn = new JButton("click me");
		btn.setOpaque(true);
		btn.setBackground(new Color(193, 196, 205));
		btn.setPreferredSize(new Dimension(200, 100));

		JButton btn2 = new JButton("click me2");
		btn2.setOpaque(true);
		btn2.setBackground(new Color(193, 196, 205));
		btn2.setPreferredSize(new Dimension(200, 100));

		JPanel panelFooter = new JPanel();
		panelFooter.setOpaque(true);
		panelFooter.setBackground(new Color(255, 0, 0));
		panelFooter.setPreferredSize(new Dimension(200, 200));
		panelFooter.add(btn);
		panelFooter.add(Box.createHorizontalGlue());
		panelFooter.add(btn2);

		// add item to frame
		frame.setJMenuBar(greenMenuBar);	
		frame.add(panelBody);
		frame.add(panel, BorderLayout.EAST);
		frame.add(grid, BorderLayout.WEST);
		frame.add(panelFooter, BorderLayout.AFTER_LAST_LINE);

		frame.pack();
		frame.setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent event) {
		 if (event.getStateChange() == ItemEvent.SELECTED) {
	          Object item = event.getItem();
	          if(item =="TEXTPANEL") {	        	
	        		  cl.show(cards, "TEXTPANEL");
	          }
	          else {
	        		cl.show(cards, "BUTTONPANEL");
	          }
	          
	       }
		
	}

}
