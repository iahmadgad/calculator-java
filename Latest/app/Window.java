package app;

import javax.swing.*;

import script.CalcOperation;
import script.Delete;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.*;

public class Window {

	static CalcOperation Run = new CalcOperation();
	
	static String input, output;
	
	public static void main(String[] args){
		{
			
			JFrame Frame = new JFrame("Simple Calculator");
			Frame.setSize(400, 400);
			
			JTextField TextField = new JTextField();
			TextField.setBounds(10, 11, 364, 80);
			TextField.setFont(new Font("Tahoma", Font.PLAIN, 40));
			
			
			
			JButton RunButton = new JButton("=");
			RunButton.setBounds(180, 310, 194, 40);
			RunButton.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent RunEvent){  
					 
				input = TextField.getText();
				output = Run.calc(input);
				TextField.setText(output);
				 
				             
		    }  
			});
			Frame.getContentPane().add(TextField);
			Frame.getContentPane().add(RunButton);
			Frame.getContentPane().setLayout(null);
			
			JButton AddWriteB = new JButton("+");
			AddWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "+");
					
				}
			});
			AddWriteB.setBounds(278, 267, 96, 40);
			Frame.getContentPane().add(AddWriteB);
			
			JButton SubWriteB = new JButton("-");
			SubWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "-");
					
				}
			});
			SubWriteB.setBounds(180, 267, 96, 40);
			Frame.getContentPane().add(SubWriteB);
			
			JButton MtpWriteB = new JButton("x");
			MtpWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "x");
					
				}
			});
			MtpWriteB.setBounds(278, 226, 96, 40);
			Frame.getContentPane().add(MtpWriteB);
			
			JButton DvdWriteB = new JButton("\u00F7");
			DvdWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "\u00F7");
					
				}
			});
			DvdWriteB.setBounds(180, 226, 96, 40);
			Frame.getContentPane().add(DvdWriteB);
			
			JButton RtWriteB = new JButton("\u221A");
			RtWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "\u221A");
					
				}
			});
			RtWriteB.setBounds(278, 185, 96, 40);
			Frame.getContentPane().add(RtWriteB);
			
			JButton RndWriteB = new JButton("rn");
			RndWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "rn");
					
				}
			});
			RndWriteB.setBounds(180, 185, 96, 40);
			Frame.getContentPane().add(RndWriteB);
			
			JButton PowWriteB = new JButton("^");
			PowWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "^");
					
				}
			});
			PowWriteB.setBounds(180, 144, 96, 40);
			Frame.getContentPane().add(PowWriteB);
			
			JButton CrtWriteB = new JButton("3\u221A");
			CrtWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					input = TextField.getText();
					TextField.setText(input + "3\u221A");
					
				}
			});
			CrtWriteB.setBounds(278, 144, 96, 40);
			Frame.getContentPane().add(CrtWriteB);
			
			
			
			JButton PiWriteB = new JButton("\u03C0");
			PiWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					input = TextField.getText();
					TextField.setText(input + "\u03C0");
					
				}
			});
			PiWriteB.setBounds(278, 102, 96, 40);
			Frame.getContentPane().add(PiWriteB);
			
			JButton PointB = new JButton(".");
			PointB.setBounds(180, 102, 96, 40);
			Frame.getContentPane().add(PointB);
			
			JButton DelB = new JButton("Del");
			DelB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					output = Delete.Op(input);
					TextField.setText(output);

				}
			});
			DelB.setBounds(10, 310, 70, 40);
			Frame.getContentPane().add(DelB);
			
			JButton ACB = new JButton("AC");
			ACB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					TextField.setText(null);
				}
			});
			ACB.setBounds(90, 310, 70, 40);
			Frame.getContentPane().add(ACB);
			
			JButton ZeroWriteB = new JButton("0");
			ZeroWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "0");
					
				}
			});
			ZeroWriteB.setBounds(60, 226, 50, 40);
			Frame.getContentPane().add(ZeroWriteB);
			
			
			JButton OneWriteB = new JButton("1");
			OneWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "1");
					
				}
			});
			OneWriteB.setBounds(10, 185, 50, 40);
			Frame.getContentPane().add(OneWriteB);
			
			JButton TwoWriteB = new JButton("2");
			TwoWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "2");
					
				}
			});
			TwoWriteB.setBounds(60, 185, 50, 40);
			Frame.getContentPane().add(TwoWriteB);
			
			JButton ThreeWriteB = new JButton("3");
			ThreeWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "3");
					
				}
			});
			ThreeWriteB.setBounds(110, 185, 50, 40);
			Frame.getContentPane().add(ThreeWriteB);
			
			JButton FourWriteB = new JButton("4");
			FourWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "4");
					
				}
			});
			FourWriteB.setBounds(10, 144, 50, 40);
			Frame.getContentPane().add(FourWriteB);
			
			JButton FiveWriteB = new JButton("5");
			FiveWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "5");
					
				}
			});
			FiveWriteB.setBounds(60, 144, 50, 40);
			Frame.getContentPane().add(FiveWriteB);
			
			JButton SixWriteB = new JButton("6");
			SixWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "6");
					
				}
			});
			SixWriteB.setBounds(110, 144, 50, 40);
			Frame.getContentPane().add(SixWriteB);
			
			JButton SevenWriteB = new JButton("7");
			SevenWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "7");
					
				}
			});
			SevenWriteB.setBounds(10, 102, 50, 40);
			Frame.getContentPane().add(SevenWriteB);
			
			JButton EightWriteB = new JButton("8");
			EightWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "8");
					
				}
			});
			EightWriteB.setBounds(60, 102, 50, 40);
			Frame.getContentPane().add(EightWriteB);
			
			JButton NineWriteB = new JButton("9");
			NineWriteB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input = TextField.getText();
					TextField.setText(input + "9");
					
				}
			});
			NineWriteB.setBounds(110, 102, 50, 40);
			Frame.getContentPane().add(NineWriteB);
			
			Frame.setVisible(true);
			
		}
	}
}
