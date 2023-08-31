package calculator;

import iahmadgad.math.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

/**
 * JCalculator
 * @version 0.5
 * Window Class
 * @author iAhmadGad
 */

public class Window{

	static String input;	
	
	public static void main(String[] args){
		{

			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JFrame frame = new JFrame("Java Calculator");
			frame.setTitle("Java Calculator");
			frame.setSize(400, 450);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			final JTextField textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.LEFT);
			textField.setEditable(false);
			textField.setBackground(Color.WHITE);
			textField.setBounds(10, 27, 364, 80);
			textField.setFont(new Font("Monospaced", Font.PLAIN, 40));
			frame.getContentPane().add(textField);

			JButton solveButton = new JButton("=");
			solveButton.setFocusable(false);
			solveButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			solveButton.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
						 
					input = textField.getText();
					textField.setText(Double.toString(new Solve(textField.getText()).getValue()));
					textField.setCaretPosition( 0 );
					 
			    }  
				});
			solveButton.setBounds(180, 360, 194, 40);
			frame.getContentPane().add(solveButton);
			
			JButton addButton = new JButton("+");
			addButton.setFocusable(false);
			addButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			addButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "+");
					
				}
			});
			addButton.setBounds(278, 317, 96, 40);
			frame.getContentPane().add(addButton);
			
			JButton subButton = new JButton("-");
			subButton.setFocusable(false);
			subButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			subButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "-");
					
				}
			});
			subButton.setBounds(180, 317, 96, 40);
			frame.getContentPane().add(subButton);
			
			JButton mtpButton = new JButton("*");
			mtpButton.setFocusable(false);
			mtpButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			mtpButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "*" /*"x"*/);
					
				}
			});
			mtpButton.setBounds(278, 276, 96, 40);
			frame.getContentPane().add(mtpButton);
			
			JButton dvdButton = new JButton("/");
			dvdButton.setFocusable(false);
			dvdButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			dvdButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "/"/*"\u00F7"*/);
					
				}
			});
			dvdButton.setBounds(180, 276, 96, 40);
			frame.getContentPane().add(dvdButton);
			
			JButton rtButton = new JButton("\u221A");
			rtButton.setFocusable(false);
			rtButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			rtButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "\u221A");
					
				}
			});
			rtButton.setBounds(278, 235, 96, 40);
			frame.getContentPane().add(rtButton);
			
			JButton powButton = new JButton("^");
			powButton.setFocusable(false);
			powButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			powButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "^");
					
				}
			});
			powButton.setBounds(180, 235, 96, 40);
			frame.getContentPane().add(powButton);
			
			JButton crtButton = new JButton("3\u221A");
			crtButton.setFocusable(false);
			crtButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			crtButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					input = textField.getText();
					textField.setText(input + "3\u221A");
					
				}
			});
			crtButton.setBounds(278, 194, 96, 40);
			frame.getContentPane().add(crtButton);
			
			
			
			/*JButton piButton = new JButton("\u03C0");
			piButton.setFocusable(false);
			piButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			piButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					input = textField.getText();
					textField.setText(input + "\u03C0");
					
				}
			});
			piButton.setBounds(180, 194, 96, 40);
			frame.getContentPane().add(piButton);*/
			
			
		    JButton pointButton = new JButton(".");
			pointButton.setFocusable(false);
			pointButton.setFont(new Font("Monospaced", Font.PLAIN, 11));
			pointButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + ".");

				}
			});
			pointButton.setBounds(10, 317, 50, 40);
			frame.getContentPane().add(pointButton);
			
			JButton commaButton = new JButton(",");
			commaButton.setFont(new Font("Monospaced", Font.PLAIN, 11));
			commaButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + ",");

				}
			});
			commaButton.setFocusable(false);
			commaButton.setBounds(110, 317, 50, 40);
			frame.getContentPane().add(commaButton);
			
			JButton deleteButton = new JButton("Del");
			deleteButton.setFocusable(false);
			deleteButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			deleteButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input.substring(0, input.length() - 1));

				}
			});
			deleteButton.setBounds(10, 360, 70, 40);
			frame.getContentPane().add(deleteButton);
			
			JButton clearButton = new JButton("AC");
			clearButton.setFocusable(false);
			clearButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			clearButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					textField.setText(null);
				}
			});
			clearButton.setBounds(90, 360, 70, 40);
			frame.getContentPane().add(clearButton);
			
			JButton zeroButton = new JButton("0");
			zeroButton.setFocusable(false);
			zeroButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			zeroButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "0");
					
				}
			});
			zeroButton.setBounds(60, 317, 50, 40);
			frame.getContentPane().add(zeroButton);
			
			
			JButton oneButton = new JButton("1");
			oneButton.setFocusable(false);
			oneButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			oneButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "1");
					
				}
			});
			oneButton.setBounds(10, 276, 50, 40);
			frame.getContentPane().add(oneButton);
			
			JButton twoButton = new JButton("2");
			twoButton.setFocusable(false);
			twoButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			twoButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "2");
					
				}
			});
			twoButton.setBounds(60, 276, 50, 40);
			frame.getContentPane().add(twoButton);
			
			JButton threeButton = new JButton("3");
			threeButton.setFocusable(false);
			threeButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			threeButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "3");
					
				}
			});
			threeButton.setBounds(110, 276, 50, 40);
			frame.getContentPane().add(threeButton);
			
			JButton fourButton = new JButton("4");
			fourButton.setFocusable(false);
			fourButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			fourButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "4");
					
				}
			});
			fourButton.setBounds(10, 235, 50, 40);
			frame.getContentPane().add(fourButton);
			
			JButton fiveButton = new JButton("5");
			fiveButton.setFocusable(false);
			fiveButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			fiveButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "5");
					
				}
			});
			fiveButton.setBounds(60, 235, 50, 40);
			frame.getContentPane().add(fiveButton);
			
			JButton sixButton = new JButton("6");
			sixButton.setFocusable(false);
			sixButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			sixButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "6");
					
				}
			});
			sixButton.setBounds(110, 235, 50, 40);
			frame.getContentPane().add(sixButton);
			
			JButton sevenButton = new JButton("7");
			sevenButton.setFocusable(false);
			sevenButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			sevenButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "7");
					
				}
			});
			sevenButton.setBounds(10, 194, 50, 40);
			frame.getContentPane().add(sevenButton);
			
			JButton eightButton = new JButton("8");
			eightButton.setFocusable(false);
			eightButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			eightButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "8");
					
				}
			});
			eightButton.setBounds(60, 194, 50, 40);
			frame.getContentPane().add(eightButton);
			
			JButton nineButton = new JButton("9");
			nineButton.setFocusable(false);
			nineButton.setFont(new Font("Monospaced", Font.PLAIN, 20));
			nineButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "9");
					
				}
			});
			nineButton.setBounds(110, 194, 50, 40);
			frame.getContentPane().add(nineButton);
			
			/*JButton randomButton = new JButton("rn");
			randomButton.setFont(new Font("Monospaced", Font.PLAIN, 11));
			randomButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "rn");
					
				}
			});
			randomButton.setFocusable(false);
			randomButton.setBounds(10, 154, 50, 40);
			frame.getContentPane().add(randomButton);*/
			
			JLabel lblNewLabel = new JLabel("@author iAhmadGad                            JC-v0.5");
			lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
			lblNewLabel.setBounds(10, 0, 364, 27);
			frame.getContentPane().add(lblNewLabel);
			
			JButton sinButton = new JButton("sin");
			sinButton.setFocusable(false);
			sinButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "sin");
					
				}
			});
			sinButton.setFont(new Font("Monospaced", Font.PLAIN, 17));
			sinButton.setBounds(180, 154, 64, 40);
			frame.getContentPane().add(sinButton);
			
			JButton cosButton = new JButton("cos");
			cosButton.setFocusable(false);
			cosButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "cos");
					
				}
			});
			cosButton.setFont(new Font("Monospaced", Font.PLAIN, 17));
			cosButton.setBounds(245, 154, 64, 40);
			frame.getContentPane().add(cosButton);
			
			JButton tanButton = new JButton("tan");
			tanButton.setFocusable(false);
			tanButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = textField.getText();
					textField.setText(input + "tan");
					
				}
			});
			tanButton.setFont(new Font("Monospaced", Font.PLAIN, 17));
			tanButton.setBounds(310, 154, 64, 40);
			frame.getContentPane().add(tanButton);
			
			JLabel lblTrigonometricFunctions = new JLabel("Trigonometric functions:");
			lblTrigonometricFunctions.setFont(new Font("Monospaced", Font.PLAIN, 12));
			lblTrigonometricFunctions.setBounds(180, 129, 194, 27);
			frame.getContentPane().add(lblTrigonometricFunctions);

			frame.setVisible(true);
			
		}
	}
}
