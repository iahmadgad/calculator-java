package windowPack;

import javax.swing.*;

import scriptPack.Solve;

import java.awt.Font;
import java.awt.event.*;

public class Window {

	static Solve solve = new Solve();
	
	static String input;
	
	public static void main(String[] args){
		{
			
			JFrame frmJavaCalculator = new JFrame("Simple Calculator");
			frmJavaCalculator.setTitle("Java Calculator");
			frmJavaCalculator.setSize(400, 400);
			frmJavaCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			final JTextField TextField = new JTextField();
			TextField.setBounds(10, 11, 364, 80);
			TextField.setFont(new Font("Tahoma", Font.PLAIN, 40));
			
			
			
			JButton runButton = new JButton("=");
			runButton.setBounds(180, 310, 194, 40);
			runButton.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent RunEvent){  
					 
				input = TextField.getText();
				TextField.setText(solve.out(input));
				 
				             
		    }  
			});
			frmJavaCalculator.getContentPane().add(TextField);
			frmJavaCalculator.getContentPane().add(runButton);
			frmJavaCalculator.getContentPane().setLayout(null);
			
			JButton addWriteB = new JButton("+");
			addWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "+");
					
				}
			});
			addWriteB.setBounds(278, 267, 96, 40);
			frmJavaCalculator.getContentPane().add(addWriteB);
			
			JButton subWriteB = new JButton("-");
			subWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "-");
					
				}
			});
			subWriteB.setBounds(180, 267, 96, 40);
			frmJavaCalculator.getContentPane().add(subWriteB);
			
			JButton mtpWriteB = new JButton("x");
			mtpWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "x");
					
				}
			});
			mtpWriteB.setBounds(278, 226, 96, 40);
			frmJavaCalculator.getContentPane().add(mtpWriteB);
			
			JButton dvdWriteB = new JButton("\u00F7");
			dvdWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "\u00F7");
					
				}
			});
			dvdWriteB.setBounds(180, 226, 96, 40);
			frmJavaCalculator.getContentPane().add(dvdWriteB);
			
			JButton rtWriteB = new JButton("\u221A");
			rtWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "\u221A");
					
				}
			});
			rtWriteB.setBounds(278, 185, 96, 40);
			frmJavaCalculator.getContentPane().add(rtWriteB);
			
			/* JButton rndWriteB = new JButton("rn");
			rndWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "rn");
					
				}
			});
			rndWriteB.setBounds(180, 185, 96, 40);
			Frame.getContentPane().add(rndWriteB); */
			
			JButton powWriteB = new JButton("^");
			powWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "^");
					
				}
			});
			powWriteB.setBounds(180, 144, 96, 40);
			frmJavaCalculator.getContentPane().add(powWriteB);
			
			JButton crtWriteB = new JButton("3\u221A");
			crtWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					input = TextField.getText();
					TextField.setText(input + "3\u221A");
					
				}
			});
			crtWriteB.setBounds(278, 144, 96, 40);
			frmJavaCalculator.getContentPane().add(crtWriteB);
			
			
			
			JButton piWriteB = new JButton("\u03C0");
			piWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					input = TextField.getText();
					TextField.setText(input + "\u03C0");
					
				}
			});
			piWriteB.setBounds(278, 102, 96, 40);
			frmJavaCalculator.getContentPane().add(piWriteB);
			
			JButton pointB = new JButton(".");
			pointB.setBounds(180, 102, 96, 40);
			frmJavaCalculator.getContentPane().add(pointB);
			
			JButton deleteB = new JButton("Del");
			deleteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input.substring(0, input.length() - 1));

				}
			});
			deleteB.setBounds(10, 310, 70, 40);
			frmJavaCalculator.getContentPane().add(deleteB);
			
			JButton acB = new JButton("AC");
			acB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					TextField.setText(null);
				}
			});
			acB.setBounds(90, 310, 70, 40);
			frmJavaCalculator.getContentPane().add(acB);
			
			JButton zeroWriteB = new JButton("0");
			zeroWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "0");
					
				}
			});
			zeroWriteB.setBounds(60, 226, 50, 40);
			frmJavaCalculator.getContentPane().add(zeroWriteB);
			
			
			JButton oneWriteB = new JButton("1");
			oneWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "1");
					
				}
			});
			oneWriteB.setBounds(10, 185, 50, 40);
			frmJavaCalculator.getContentPane().add(oneWriteB);
			
			JButton twoWriteB = new JButton("2");
			twoWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "2");
					
				}
			});
			twoWriteB.setBounds(60, 185, 50, 40);
			frmJavaCalculator.getContentPane().add(twoWriteB);
			
			JButton threeWriteB = new JButton("3");
			threeWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "3");
					
				}
			});
			threeWriteB.setBounds(110, 185, 50, 40);
			frmJavaCalculator.getContentPane().add(threeWriteB);
			
			JButton fourWriteB = new JButton("4");
			fourWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "4");
					
				}
			});
			fourWriteB.setBounds(10, 144, 50, 40);
			frmJavaCalculator.getContentPane().add(fourWriteB);
			
			JButton fiveWriteB = new JButton("5");
			fiveWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "5");
					
				}
			});
			fiveWriteB.setBounds(60, 144, 50, 40);
			frmJavaCalculator.getContentPane().add(fiveWriteB);
			
			JButton sixWriteB = new JButton("6");
			sixWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "6");
					
				}
			});
			sixWriteB.setBounds(110, 144, 50, 40);
			frmJavaCalculator.getContentPane().add(sixWriteB);
			
			JButton sevenWriteB = new JButton("7");
			sevenWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "7");
					
				}
			});
			sevenWriteB.setBounds(10, 102, 50, 40);
			frmJavaCalculator.getContentPane().add(sevenWriteB);
			
			JButton eightWriteB = new JButton("8");
			eightWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "8");
					
				}
			});
			eightWriteB.setBounds(60, 102, 50, 40);
			frmJavaCalculator.getContentPane().add(eightWriteB);
			
			JButton nineWriteB = new JButton("9");
			nineWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "9");
					
				}
			});
			nineWriteB.setBounds(110, 102, 50, 40);
			frmJavaCalculator.getContentPane().add(nineWriteB);
			
			JLabel lblNewLabel = new JLabel("@author iAhmadGad");
			lblNewLabel.setBounds(10, 280, 150, 14);
			frmJavaCalculator.getContentPane().add(lblNewLabel);
			
			frmJavaCalculator.setVisible(true);
			
		}
	}
}
