package bankdemo;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class mainmenulogin {
	
	JFrame  frame;
	JTextField l11;
	JPasswordField l22;
	JTextField l33;
	JLabel l1,l2,l3,l4,l5,l1a,l2a,l3a,l4a,l5a,l6a,ll1,ll2;
	JPanel p;
	JButton b1,b2,b3,b4,b11;
	
	
	void mainmenulogin2(){
		

		frame=new JFrame("java 1");
		
		frame.setLayout(null);
	
		frame.setBounds(100, 100, 625, 374);
		frame.setSize(1200, 800);
		frame.getContentPane().setBackground(Color.RED);
        //frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\morcelin\\13414241_1731737013768565_368076057_n.jpg"));
		//frame.setForeground(Color.blue);
		ll1=new JLabel("userid");
		ll1.setBounds(100, 100,300, 30);
		
		JTextField k1=new JTextField();
		k1.setBounds(200, 100,200, 30);
		
		ll2=new JLabel("passeord");
		ll2.setBounds(100, 150, 200, 30);
		
		JPasswordField k111=new JPasswordField();
		k111.setBounds(200, 150, 200, 30);
		
		b11=new JButton("login");
		b11.setBounds(350, 200, 90, 30);
		//b11.setBackground(Color.BLACK);
		//b11.setForeground(Color.RED);
		
		 b11.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent e){
	        	   frame.setVisible(false);
	        	   
	        	  customer();
	         
	           }
	       
	       });
		frame.add(ll1);
		frame.add(ll2);
		frame.add(k1);
		frame.add(k111);
		frame.add(b11);
		frame.setVisible(true);
		
	}
	
	
	
	void mainmenuligin1(){
		
		frame=new JFrame("java 1");
		
		frame.setLayout(null);
	
		frame.setBounds(100, 100, 625, 374);
		frame.setSize(1200, 800);
        frame.getContentPane().setBackground(Color.RED);
        //frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\morcelin\\13414241_1731737013768565_368076057_n.jpg"));
		//frame.setForeground(Color.blue);
		l1=new JLabel("userid");
		l1.setBounds(100, 100,300, 30);
		
		JTextField k=new JTextField();
		k.setBounds(200, 100,200, 30);
		
		l2=new JLabel("passeord");
		l2.setBounds(100, 150, 200, 30);
		
		JPasswordField k1=new JPasswordField();
		k1.setBounds(200, 150, 200, 30);
		
		b1=new JButton("login");
		b1.setBounds(350, 200, 90, 30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.RED);
		
		
		
		b1.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent e){
	        	   try{
	        		   FileReader fr=new FileReader("File\\ass.txt");
						BufferedReader bu=new BufferedReader(fr);
						String [] n=new String [1000];
						int x=0;
						String s;
						while((s=bu.readLine())!=null){
							n[x]=s;
							x++;
						}
						for(String st: n){
							StringTokenizer kt=new StringTokenizer(st,"#");
							while(kt.hasMoreTokens()){
								String na =kt.nextElement().toString();
								String u =kt.nextElement().toString();
								String p =kt.nextElement().toString();
								String a = kt.nextElement().toString();
							     
								String i =kt.nextElement().toString();
								String ph =kt.nextElement().toString();
								if(k.getText().equals(u)&&k1.getText().equals(p)){
									JOptionPane.showMessageDialog(null, "success");;
									lastpage b=new lastpage();
									frame.setVisible(false);
									b.lastpage1();
									
									return;
								}
							}
						}
						
	        		   
	        	   }catch(Exception e3){
	        		   JOptionPane.showMessageDialog(null, "Invalid username and password");
	        		   
	        	   }
	        	  
	           }
	       });
		
		
		
		
		
		
		
		 b1.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent e){
	        	   //frame.setVisible(false);
	        	   
	        	  // customer();
	         
	       //  lastpage v=new lastpage();
	        	//  v.lastpage1();
	           }
	       
	       });
		
		
		
		 
       frame.add(l1);
       frame.add(k);
       frame.add(l2);
       frame.add(k1);
       frame.add(b1);

        frame.setVisible(true);
		
	}
	void help(){
		
		frame=new JFrame("java help");
		frame.setLayout(null);
		frame.setBounds(100, 100, 625, 374);
		frame.setSize(1200, 800);
		 frame.getContentPane().setBackground(Color.RED);
		
		l3= new JLabel("CONTACT WITH US");
		l3.setBounds(100, 100, 300, 30);
		
		//b2=new JButton("call");
		//b2.setBounds(600, 200, 100, 30);
		
		
		l4=new JLabel("phone number      0170000000 ");
		l4.setBounds(100, 200, 300, 30);
		
		
		
		l5=new JLabel("Visit us             www.DBBD.BD.com");
		l5.setBounds(100, 250, 300, 30);
		
		frame.add(l3);
		frame.add(l4);
		//frame.add(a);
		frame.add(l5);
		//frame.add(b2);
		frame.setVisible(true);
		
		
	}
	
	void customer(){
		
		mainmenuligin1();

		
		frame=new JFrame("java 3");
		frame.setLayout(null);
		frame.setBounds(100, 100, 625, 374);
		frame.setSize(1200, 800);
		frame.getContentPane().setBackground(Color.RED);
		l1a=new JLabel("Full Name ");
		l1a.setBounds(100, 100, 300, 30);	
		JTextField l11=new JTextField();
		l11.setBounds(200, 100, 300, 30);	
		l4a=new JLabel("User Id");
		l4a.setBounds(100, 200, 300, 30);
		JTextField l44=new JTextField();
		l44.setBounds(200, 200, 300, 30);
		l2a=new JLabel("Password");
		l2a.setBounds(100, 300, 300, 30);
		JPasswordField l22=new JPasswordField();
		l22.setBounds(200, 300, 300, 30);
		l3a=new JLabel("phone number");
		l3a.setBounds(100, 400, 300,30);
		JTextField l33=new JTextField();
		l33.setBounds(200, 400, 300, 30);
		l5a=new JLabel("Address ");
		l5a.setBounds(100, 500, 300, 30);
		JTextField l66=new JTextField();
		l66.setBounds(200, 500, 300, 30);
		l6a=new JLabel("Email Adderss ");
		l6a.setBounds(100, 600, 300, 30);
		JTextField l77=new JTextField();
		l77.setBounds(200, 600, 300, 30);
		JButton b4=new JButton("submit");
		b4.setBounds(500, 650, 100, 30);
		 b4.addActionListener(new ActionListener(){
	           public void actionPerformed(ActionEvent e){
	        	   frame.setVisible(false);
	        	   
	        	  // readf l=new readf();
		        
		        
	        	
					
					try {
						   File f= new File("D:\\fun\\ass.txt");
						FileWriter	fw = new FileWriter(f,true);
					
					BufferedWriter bw=new BufferedWriter(fw);
	        	   //String u="";
	        	   //String p="";
					String fullname=(l11.getText());
					String userid=(l44.getText());
					String password=(l22.getText());
					String number=(l33.getText());
					String address=(l66.getText());
					String emailaddress=(l77.getText());
						bw.write(fullname+"#"+userid+"#"+password+"#"+number+"#"+address+"#"+emailaddress+"#");					
						bw.newLine();
						bw.flush();
						bw.close();
						
					//	String s=l.readd();
						JOptionPane.showMessageDialog(null," Data Saved Successfully");
						frame.dispose(); 
						
						
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					     	   
	           }
	          
	         
	         
	           
	     
	       });

		frame.add(l1a);
		frame.add(l6a);
		frame.add(l77);
		frame.add(l4a);
		frame.add(l44);
		frame.add(l5a);
		frame.add(l66);
		frame.add(l11);
		frame.add(l2a);
		frame.add(l22);
		frame.add(l3a);
		frame.add(l33);
		frame.add(b4);
		
		frame.setVisible(true);	
	}
	
}