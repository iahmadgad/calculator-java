/*
* JCalculator
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import dev.iahmadgad.maths.ValueDefiner;

/**
 * GUI class.
 * 
 * @author iAhmadGad
 * @version 0.7
 * @since 0.6
 */

public class GUI 
{
	private JFrame frame;
	private JTextField textField;
	private JButton solveButton, deleteButton, clearButton;
	private JButton numberButtons[];
	private JButton Buttons[];
	private String text[] = {"+", "-", "*", "÷", "sqrt(", "cbrt(", "pow(", "rnd", "π", ".", ",", "sin(", "cos(", "tan(", "!", ")"};
	private int buttonsBounds[][] =
		{{60, 317, 50, 40}, {10, 276, 50, 40}, {60, 276, 50, 40}, {110, 276, 50, 40}, {10, 235, 50, 40}, {60, 235, 50, 40}, {110, 235, 50, 40}, {10, 194, 50, 40}, {60, 194, 50, 40}, {110, 194, 50, 40}, {278, 317, 96, 40}, {180, 317, 96, 40}, {278, 276, 96, 40}, {180, 276, 96, 40}, {278, 235, 96, 40}, {180, 235, 96, 40}, {278, 194, 96, 40}, {180, 194, 96, 40}, {10, 154, 50, 40}, {10, 317, 50, 40}, {110, 317, 50, 40}, {180, 154, 64, 40}, {245, 154, 64, 40}, {310, 154, 64, 40}, {60, 154, 50, 40}, {110, 154, 50, 40}};
	
	/**
	 * Create the application.
	 */
	private GUI()
	{
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try 
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} 
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) 
		{
			e.printStackTrace();
		}
		frame = new JFrame("JCalculator");
		frame.setBounds(100, 100, 400, 450);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("@author iAhmadGad               Java-Calculator-v0.7");
		label.setFont(new Font("Monospaced", Font.PLAIN, 12));
		label.setBounds(10, 0, 364, 27);
		frame.getContentPane().add(label);
		
		JLabel trigonometricFunctionsLabel = new JLabel("Trigonometric functions:");
		trigonometricFunctionsLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
		trigonometricFunctionsLabel.setBounds(180, 129, 194, 27);
		frame.getContentPane().add(trigonometricFunctionsLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 27, 364, 80);
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Monospaced", Font.PLAIN, 20));
		frame.getContentPane().add(textField);
		
		solveButton = new JButton("=");
		solveButton.setBounds(180, 360, 194, 40);
		solveButton.setFont(new Font("Monospaced", Font.PLAIN, 15));
		solveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(String.valueOf(ValueDefiner.getEnhancedValue(textField.getText())));
				textField.setCaretPosition(0);
			}
		});
		frame.getContentPane().add(solveButton);
		
		deleteButton = new JButton("Del");
		deleteButton.setBounds(10, 360, 70, 40);
		deleteButton.setFont(new Font("Monospaced", Font.PLAIN, 15));
		deleteButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
			}
		});
		frame.getContentPane().add(deleteButton);
		
		clearButton = new JButton("AC");
		clearButton.setBounds(90, 360, 70, 40);
		clearButton.setFont(new Font("Monospaced", Font.PLAIN, 15));
		clearButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(null);
			}
		});
		frame.getContentPane().add(clearButton);
		
		numberButtons = new JButton[10];
		for(byte i = 0; i < 10; i++)
		{
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].setBounds(buttonsBounds[i][0], buttonsBounds[i][1], buttonsBounds[i][2], buttonsBounds[i][3]);
			numberButtons[i].setFont(new Font("Monospaced", Font.PLAIN, 15));
			final int escape = i;
			numberButtons[i].addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					textField.setText(textField.getText() + escape);
				}
			});
			frame.getContentPane().add(numberButtons[i]);
		}
		
		Buttons = new JButton[14];
		for(byte i = 0; i < 14; i++)
		{
			Buttons[i] = new JButton(text[i]);
			Buttons[i].setBounds(buttonsBounds[i + 10][0], buttonsBounds[i + 10][1], buttonsBounds[i + 10][2], buttonsBounds[i + 10][3]);
			Buttons[i].setFont(new Font("Monospaced", Font.PLAIN, 14));
			final int escape = i;
			Buttons[i].addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					textField.setText(textField.getText() + text[escape]);
				}
			});
			frame.getContentPane().add(Buttons[i]);
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String args[])
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run() 
			{
				try
				{
					GUI GUI = new GUI();
					GUI.frame.setVisible(true);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}