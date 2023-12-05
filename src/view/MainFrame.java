package view;
import javax.swing.*;

import model.MechanicalOffice;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
	
	private JTextArea textArea; 
	private JButton button;
	private JTextField textField;
	
	
		public MainFrame(){
			super("MechanicalOffice");

			
			
			textArea = new JTextArea();
			button = new JButton("Start");
			
			add(textArea, BorderLayout.CENTER);
			add(button, BorderLayout.PAGE_END);
			
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					MechanicalOffice m1 = new MechanicalOffice();
			        m1.startDay();
				        new CloseFrame();
						}
			
			});
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);
			setSize(500, 500);
			setLocationRelativeTo(null);
			setVisible(true);
		}
			
			
		
	    }
	        
	    
	        
	        
	        

