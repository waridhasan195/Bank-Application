package bankdemo;

import java.awt.Color;
import java.awt.EventQueue;


import java.sql.*;

import javax.swing.*;
import java.sql.Connection;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class mainmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Gui b=new Gui();
	}

}


class Gui{
   
    JFrame mainframe;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    ImageIcon i;
    JRadioButton rb1;
    JButton b1,b2,b3,b4,b5,b6;
    JPanel panel;
    ImageIcon image;   
    
   Gui(){
       mainframe=new JFrame("JAVA");
     
       mainframe.setBounds(100, 100, 625, 374);
       mainframe.setSize(1200, 800);
       mainframe.getContentPane().setBackground(Color.RED);
       mainframe.getContentPane().setLayout(null);
      
       
       l1=new JLabel("SWSIS BANK");
       l1.setFont(new Font("Tahoma",Font.BOLD,30));
       l1.setForeground(Color.DARK_GRAY);
       l1.setBounds(384, 84, 600, 37);
     
       
       //l7=new JLabel("Search ");
      // l7.setForeground(Color.red);
      // l7.setBounds(300, 150, 200,30);
       
      
       
       b3=new JButton("User login");
       b3.setBounds(150,300, 200, 30);
       b3.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
        	   mainframe.setVisible(false);
        	   
        	
        	   mainmenulogin b=new mainmenulogin();
        	b.mainmenuligin1();
        	  
           }
       
       });
       
       b4=new JButton("Admin login");
       b4.setBounds(400, 300, 200, 30);
      b4.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
        	   mainframe.setVisible(false);
        	   
        	   
        	   mainmenulogin b=new mainmenulogin();
        	   b.mainmenulogin2();
        	   
        	//b.mainmenuligin11();
        	//b.customer();
        	
        	   
           };
       
       });
       
       b5=new JButton("Help");
       b5.setBounds(650, 300, 200, 30);
       b5.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
        	   mainframe.setVisible(false);
        	   
        	
        	   mainmenulogin b=new mainmenulogin();
        	b.help();
        	   
        	   
           }
       
       });
       
       
       
       l6= new JLabel("") ;
       l6.setForeground(Color.CYAN);
       l6.setBounds(150, 450, 400, 30);
      
      
              // JTextField k = new JTextField(5);
              // k.setBounds(200, 200, 200, 30);
               
              // JTextField d = new JTextField(5);
             //  d.setBounds(300, 200, 200, 30);
        JPasswordField p = new JPasswordField(5) ;
        p.setBounds(100, 230, 190, 30);
        
       // panel.setSize(1200,800);
       // panel.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\morcelin\\13414241_1731737013768565_368076057_n.jpg"));
      
      // mainframe.add(d);
      //D mainframe.add(l7);  
       mainframe.add(l1);		
       mainframe.add(l6);
       mainframe.add(b3);
       mainframe.add(b4);
       mainframe.add(b5);
    
       mainframe.setVisible(true); 
   } 
   
}


