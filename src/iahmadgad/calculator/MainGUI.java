package iahmadgad.calculator;

import java.awt.*;
import javax.swing.*;

public class MainGUI 
{
	private MainGUI()
	{
		JFrame frame = new JFrame("JCaclculator");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		new MainGUI();
	}
}
