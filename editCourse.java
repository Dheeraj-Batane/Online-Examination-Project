import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class editCourse extends JPanel
{
	newCourse nc;
	viewCourse vc;
	updateCourse uc;
	removeCourse rc;
	JTabbedPane tab1;
	JButton b1,b2;
	JLabel u1,u2,u3,u4;
	JTextField t1,t2,t3,t4;
	ImageIcon bck=new ImageIcon("back2.png");
	
	ImageIcon sav2=new ImageIcon("save.png");
	
	ImageIcon img2=new ImageIcon("new.png");
		
	ImageIcon img3=new ImageIcon("view.png");
		
	ImageIcon img4=new ImageIcon("delete.png");
		
	ImageIcon img5=new ImageIcon("updt.png");
		
	
	editCourse()
	{
		Font f=new Font("Algerian",Font.BOLD,15);
		setFont(f);
		setLayout(null);
		tab1=new JTabbedPane(JTabbedPane.TOP);
		tab1.setBounds(20,40,700,500);
		nc=new newCourse();
		vc=new viewCourse();
		uc=new updateCourse();
		rc=new removeCourse();
		
		
		tab1.addTab("",img2,nc);
		tab1.addTab("",img3,vc);
		tab1.addTab("",img4,uc);
		tab1.addTab("",img5,rc);
		
		repaint();
		add(tab1);
		
		u1=new JLabel("Course Name");
		u1.setBounds(800,200,130,30);
		u1.setFont(f);
		u1.setForeground(Color.white);
		add(u1);
		
		t1=new JTextField();
		t1.setBounds(780,240,170,30);
		t1.setOpaque(false);
		t1.setFont(f);
		add(t1);
		
		u2=new JLabel("Time");
		u2.setBounds(830,290,130,30);
		u2.setFont(f);
		u2.setForeground(Color.white);
		add(u2);
		
		t2=new JTextField();
		t2.setBounds(780,320,50,30);
		t2.setOpaque(false);
		t2.setFont(f);
		add(t2);
		
		t3=new JTextField();
		t3.setBounds(840,320,50,30);
		t3.setOpaque(false);
		t3.setFont(f);
		add(t3);
		
		t4=new JTextField();
		t4.setBounds(900,320,50,30);
		t4.setOpaque(false);
		t4.setFont(f);
		add(t4);
		
		
		u3=new JLabel("Each Mark");
		u3.setBounds(790,370,130,40);
		u3.setFont(f);
		u3.setForeground(Color.white);
		add(u3);
		
		
		
		u4=new JLabel("Total Question :");
		u4.setBounds(750,420,200,30);
		u4.setFont(f);
		u4.setForeground(Color.white);
		add(u4);
		
		
		b2=new JButton(sav2);
		b2.setBounds(800,480,100,30);
		add(b2);
		b2.setOpaque(false);
		b2.setBorderPainted(false);
		b2.setContentAreaFilled(false);
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



// ***************************************************************************
class newCourse extends JPanel implements ActionListener
{
	JTextField t1,t3,t4,t5,t6;
	JTextArea t2;
	JLabel u1,u2,u3,u4,u5,u6,u7;
	JComboBox li;
	Managecourse mng;
	String s1[]={"Option 1","Option 2","Option 3","Option 4"};
	JButton b1;
	ImageIcon sav=new ImageIcon("save.png");
	newCourse()
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
		
		b1=new JButton(sav);
		b1.setBounds(400,400,100,30);
		add(b1);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		b1.setContentAreaFilled(false);
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			String s3=t3.getText();
			String s4=t4.getText();
			String s5=t5.getText();
			String s6=t6.getText();
			String s7=(String)li.getSelectedItem();
			//String s8=(String)mng.li.getSelectedItem();
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam?useSSl=false","root","root");
				Statement st=con.createStatement();
				String q="insert into java values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"') ";
				
				st.executeUpdate(q);
				
				JOptionPane.showMessageDialog(null,"Question Added");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				
				
			}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
			


		
		}
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ImageIcon img1=new ImageIcon("bg1.jpg");
		Image hm1=img1.getImage();
		g.drawImage(hm1,0,0,this);
	}
}

// *******************************************************
class viewCourse extends JPanel 
{
	JTextField t1,t3,t4,t5,t6;
	JTextArea t2;
	JLabel u1,u2,u3,u4,u5,u6,u7;
	JComboBox li;
	String s1[]={};
	
	viewCourse()
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
		
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ImageIcon img1=new ImageIcon("bg1.jpg");
		Image hm1=img1.getImage();
		g.drawImage(hm1,0,0,this);
	}
}
// **********************************************************
class updateCourse extends JPanel
{
	JTextField t1,t3,t4,t5,t6;
	JTextArea t2;
	JLabel u1,u2,u3,u4,u5,u6,u7;
	JComboBox li;
	String s1[]={"Option 1","Option 2","Option 3","Option 4"};
	JButton b1;
	ImageIcon up=new ImageIcon("rmv.png");
	updateCourse()
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
		
		b1=new JButton(up);
		b1.setBounds(400,400,100,30);
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

// **********************************************************
class removeCourse extends JPanel
{
	JTextField t1,t3,t4,t5,t6;
	JTextArea t2;
	JLabel u1,u2,u3,u4,u5,u6,u7;
	JComboBox li;
	String s1[]={"Option 1","Option 2","Option 3","Option 4"};
	JButton b1;
	ImageIcon rmv=new ImageIcon("up.png");
	removeCourse()
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
		
		b1=new JButton(rmv);
		b1.setBounds(400,400,100,30);
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


