package app;

import javax.swing.*;

import script.CalcOperation;

import java.awt.Font;
import java.awt.event.*;
public class WindowV1 {

	static CalcOperation Run = new CalcOperation();
	
	static String input, output;
	static int result;
	
	public static void main(String[] args){
		{
			
			JFrame Frame = new JFrame("BLA");
			Frame.setSize(400, 400);
			
			JLabel InputLabel = new JLabel("Type the Math Operation Here:");
			InputLabel.setBounds(50,50, 180,30);
			
			JLabel OutputLabel = new JLabel("The answer will appear Here:");
			OutputLabel.setBounds(50,210, 180,30);
			
			JTextField InputField = new JTextField();
			InputField.setBounds(50, 80, 180, 80);
			InputField.setFont(new Font("Tahoma", Font.PLAIN, 40));
			
			JTextField OutputField = new JTextField();
			OutputField.setBounds(50, 240, 180, 80);
			OutputField.setFont(new Font("Tahoma", Font.PLAIN, 40));
			
			JButton RunButton = new JButton("=");
			RunButton.setBounds(50, 170, 180, 40);
			RunButton.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent RunEvent){  
					 
				input = InputField.getText();
				output = Run.calc(input);
				OutputField.setText(output);
				 
				             
		    }  
			});  
			
			Frame.add(InputLabel);
			Frame.add(OutputLabel);
			Frame.add(InputField);
			Frame.add(OutputField);
			Frame.add(RunButton);
			Frame.setLayout(null);
			Frame.setVisible(true);
			
		}
	}
	
}
