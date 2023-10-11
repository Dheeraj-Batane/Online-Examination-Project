import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class addCourse extends JPanel
{
	JButton b1,b2;
	JLabel u1,u2,u3;
	JTextField t1,t2,t3,t4;
	JComboBox li;
	String s1[]={"1","2","3","4","5"};
	ImageIcon bck=new ImageIcon("back2.png");
	addCourse()
	{
		setLayout(null);
		Font f=new Font("Aldhabi",Font.BOLD,20);
		setFont(f);
		
		u1=new JLabel("Course Name");
		u1.setBounds(300,200,130,30);
		u1.setFont(f);
		u1.setForeground(Color.white);
		add(u1);
		
		t1=new JTextField();
		t1.setBounds(450,200,170,30);
		t1.setOpaque(false);
		t1.setFont(f);
		add(t1);
		
		u2=new JLabel("Time");
		u2.setBounds(300,260,130,30);
		u2.setFont(f);
		u2.setForeground(Color.white);
		add(u2);
		
		t2=new JTextField();
		t2.setBounds(450,260,50,30);
		t2.setOpaque(false);
		t2.setFont(f);
		add(t2);
		
		t3=new JTextField();
		t3.setBounds(520,260,50,30);
		t3.setOpaque(false);
		t3.setFont(f);
		add(t3);
		
		t4=new JTextField();
		t4.setBounds(590,260,50,30);
		t4.setOpaque(false);
		t4.setFont(f);
		add(t4);
		
		
		u3=new JLabel("Each Mark");
		u3.setBounds(300,330,130,40);
		u3.setFont(f);
		u3.setForeground(Color.white);
		add(u3);
		
		li=new JComboBox(s1);
		li.setBounds(450,330,150,30);
		li.setFont(f);
		add(li);
		
		
		b2=new JButton("Add Course");
		b2.setBounds(380,380,130,30);
		add(b2);
		// b2.setOpaque(false);
		// b2.setBorderPainted(false);
		// b2.setContentAreaFilled(false);
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
		
		b1=new JButton(bck);
		b1.setBounds(20,570,100,30);
		add(b1);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		b1.setContentAreaFilled(false);
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ImageIcon img1=new ImageIcon("bg1.jpg");
		Image hm1=img1.getImage();
		g.drawImage(hm1,0,0,this);
	}
}