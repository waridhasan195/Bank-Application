package bankdemo;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class lastpage {
	
	void lastpage1(){
		
		JFrame frame;
		JLabel l1;
		JButton b1,b2,b3,b4,b5;
		
		frame=new JFrame("java");
		frame.setLayout(null);	
		//frame.setSize(1200, 800);
	    frame.setBounds(100, 100, 625, 374);
	    frame.setSize(1200, 800);
		
	    frame.getContentPane().setBackground(Color.RED);
		b1=new JButton("Chack Balance");
		
		b1.setBounds(100, 100, 300, 70);
		
		b2=new JButton("Deposite");
		b2.setBounds(100, 250, 300, 70);
		
		b3=new JButton("WithDrowl");
		b3.setBounds(100, 400, 300,70 );
		
		b4=new JButton("Transfare");
		b4.setBounds(100, 550, 300, 70);
		
		b5=new JButton("Logout");
		b5.setBounds(600, 600, 250, 50);
		
		
		
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		
		frame.setVisible(true);
		
		
		
	}
	

}
