import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class UsrHome extends JPanel 
{
	ImageIcon lgout=new ImageIcon("lgout.png");
	ImageIcon str=new ImageIcon("str.png");
	JComboBox l1;
	JLabel l2;
	JButton b1,b2;
	int count=0;
	int d=0;
	UsrHome()
	{
		setLayout(null);
		Font f=new Font("Aldhabi",Font.BOLD,30);
		setFont(f);
		if(d==0)
		try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam?useSSl=false","root","root");
				Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
				String q="select *from course ";
				
				ResultSet rs=st.executeQuery(q);
				while(rs.next())
				{
				count++;
				}
					
				d=1;
			}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
		
		
		String s[]=new String[count];
		int i=0;
		try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam?useSSl=false","root","root");
				Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
				String q="select *from course ";
				
				ResultSet rs=st.executeQuery(q);
				while(rs.next())
				{
				
				s[i]=rs.getString(1);
				i++;
				}
					
				
			}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
			
		
		l1=new JComboBox(s);
		l1.setBounds(440,260,150,50);
		l1.setFont(f);
		add(l1);
		
		
		l2=new JLabel("Select Subject:");
		l2.setBounds(150,250,250,40);
		l2.setFont(f);
		add(l2);
		b1=new JButton(lgout);
		b1.setBounds(0,600,100,30);
		add(b1);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		b1.setContentAreaFilled(false);
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		
		b2=new JButton(str);
		b2.setBounds(350,320,150,40);
		add(b2);
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
		b2.setOpaque(false);
		b2.setBorderPainted(false);
		b2.setContentAreaFilled(false);
		
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ImageIcon img1=new ImageIcon("bg1.jpg");
		Image hm1=img1.getImage();
		g.drawImage(hm1,0,0,this);
	}
	
}
