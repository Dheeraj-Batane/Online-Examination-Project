import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class examportal extends JPanel implements ActionListener
{
	JTextField t1,t3,t4,t5,t6;
	JTextArea t2;
	JLabel u1,u2,u3,u4,u5,u6,u7;
	JComboBox li;
	int i=0;
	String s1[]={"Option 1","Option 2","Option 3","Option 4"};
	JButton b1,b2;
	// ImageIcon sav=new ImageIcon("save.png");
	examportal()
	{
	
		Font f=new Font("Aldhabi",Font.BOLD,20);
		setFont(f);
		setLayout(null);
		
		u1=new JLabel("Question ID:");
		u1.setBounds(10,10,150,20);
		u1.setFont(f);
		add(u1);
		
		t1=new JTextField();
		t1.setBounds(150,10,60,30);
		t1.setOpaque(false);
		t1.setFont(f);
		t1.setEditable(false);
		add(t1);
		
		u2=new JLabel("Question:");
		u2.setBounds(10,50,100,30);
		u2.setFont(f);
		add(u2);
		
		t2=new JTextArea();
		t2.setBounds(120,50,500,140);
		t2.setBackground(Color.gray);
		t2.setForeground(Color.white);
		t2.setFont(f);
		add(t2);
		
		u3=new JLabel("Option 1:");
		u3.setBounds(10,200,100,30);
		u3.setFont(f);
		add(u3);
		
		t3=new JTextField();
		t3.setBounds(120,200,350,30);
		t3.setFont(f);
		t3.setOpaque(false);
		add(t3);
		
		u4=new JLabel("Option 2:");
		u4.setBounds(10,250,100,30);
		u4.setFont(f);
		add(u4);
		
		t4=new JTextField();
		t4.setBounds(120,250,350,30);
		t4.setFont(f);
		t4.setOpaque(false);
		add(t4);
		
		u5=new JLabel("Option 3:");
		u5.setBounds(10,300,100,30);
		u5.setFont(f);
		add(u5);
		
		t5=new JTextField();
		t5.setBounds(120,300,350,30);
		t5.setFont(f);
		t5.setOpaque(false);
		add(t5);
		
		u6=new JLabel("Option 4:");
		u6.setBounds(10,350,100,30);
		u6.setFont(f);
		add(u6);
		
		t6=new JTextField();
		t6.setBounds(120,350,350,30);
		t6.setFont(f);
		t6.setOpaque(false);
		add(t6);
		
		u7=new JLabel("Correct Option:");
		u7.setBounds(10,400,150,40);
		u7.setFont(f);
		add(u7);
		
		
		
		li=new JComboBox(s1);
		li.setBounds(200,400,150,30);
		li.setFont(f);
		add(li);
		
		b1=new JButton("Next");
		b1.setBounds(400,400,100,30);
		add(b1);
		// b1.setOpaque(false);
		// b1.setBorderPainted(false);
		// b1.setContentAreaFilled(false);
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
	
		b2=new JButton("Back");
		b2.setBounds(100,600,100,30);
		add(b2);
		// b1.setOpaque(false);
		// b1.setBorderPainted(false);
		// b1.setContentAreaFilled(false);
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
	
		
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ImageIcon img1=new ImageIcon("bg1.jpg");
		Image hm1=img1.getImage();
		g.drawImage(hm1,0,0,this);
	}
}
