package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controller.*;

public class View extends JFrame implements IView{
	JLabel counterJLabel= new JLabel("0");
	JButton incJButton=new JButton("increment");
	IController controller;
	public View() {
		
		JPanel mainPanel=new JPanel(new GridLayout(2, 1, 10, 10));
		mainPanel.add(counterJLabel);
		mainPanel.add(incJButton);
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		counterJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		incJButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				controller.action();
			}
		});
		
		getContentPane().add(mainPanel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(200, 300);
		setVisible(true);
	}
	@Override
	public void setCounter(int v) {
		// TODO Auto-generated method stub
		counterJLabel.setText(""+v);
	}
	@Override
	public void setController(Controller controller) {
		this.controller=controller;
		
	}

}
