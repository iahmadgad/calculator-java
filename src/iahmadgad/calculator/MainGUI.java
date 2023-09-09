package iahmadgad.calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainGUI 
{
	private JFrame frame;
	private JTextField textField;
	private JButton solveButton;
	private JButton numberButtons[];
	private JButton typeButtons[];
	private String typeText[] = {"+", "-", "x", "÷", "sqrt(", "cbrt(", "pow(", "rnd(", "π", ".", ",", "sin", "cos", "tan"};
	private int buttonsBounds[][] = 
		{{60, 317, 50, 40}, {10, 276, 50, 40}, {60, 276, 50, 40}, {110, 276, 50, 40}, {10, 235, 50, 40}, {60, 235, 50, 40}, {110, 235, 50, 40}, {10, 194, 50, 40}, {60, 194, 50, 40}, {110, 194, 50, 40}, {278, 317, 96, 40}, {180, 317, 96, 40}, {278, 276, 96, 40}, {180, 276, 96, 40}, {278, 235, 96, 40}, {180, 235, 96, 40}, {278, 194, 96, 40}, {180, 194, 96, 40}, {10, 154, 50, 40}, {10, 317, 50, 40}, {110, 317, 50, 40}, {180, 154, 64, 40}, {245, 154, 64, 40}, {310, 154, 64, 40}};
	
	/**
	 * Create the application.
	 */
	private MainGUI()
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
		
		textField = new JTextField();
		textField.setBounds(0, 0, 384, 80);
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Monospaced", Font.PLAIN, 40));
		
		solveButton = new JButton("=");
		solveButton.setBounds(180, 360, 194, 40);
		solveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(String.valueOf(Parser.getEnhancedValue(textField.getText())));
			}
		});
		
		numberButtons = new JButton[10];
		for(byte i = 0; i < 10; i++)
		{
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].setBounds(buttonsBounds[i][0], buttonsBounds[i][1], buttonsBounds[i][2], buttonsBounds[i][3]);
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
		
		for(byte i = 0; i < 10; i++)
		{
			
		}
		
		typeButtons = new JButton[14];
		for(byte i = 0; i < 14; i++)
		{
			typeButtons[i] = new JButton(typeText[i]);
			typeButtons[i].setBounds(buttonsBounds[i + 10][0], buttonsBounds[i + 10][1], buttonsBounds[i + 10][2], buttonsBounds[i + 10][3]);
			final int escape = i;
			typeButtons[i].addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					textField.setText(textField.getText() + typeText[escape]);
				}
			});
			frame.getContentPane().add(typeButtons[i]);
		}
		
		for(byte i = 0; i < 14; i++)
		{
			
		}
		
		frame.getContentPane().add(solveButton);
		frame.getContentPane().add(textField);
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
					MainGUI GUI = new MainGUI();
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
