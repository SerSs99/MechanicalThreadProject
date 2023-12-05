package view;

import javax.swing.*;

import model.MechanicalOffice;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CloseFrame extends JFrame{
	
	private JButton button;
	private JTextArea textArea;
	
	
	public CloseFrame() {
		super("MechanicalOffice");
			
		button=new JButton("Close");
		textArea=new JTextArea();
		textArea.append("Today the work was done!");
		button.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		
		});
		
		add(textArea, BorderLayout.CENTER);
		add(button,BorderLayout.PAGE_END);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	
	
	

}
}