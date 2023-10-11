import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Managecourse extends JPanel 
{
	ImageIcon bck=new ImageIcon("back2.png");
	ImageIcon edt=new ImageIcon("edt.png");
	ImageIcon add=new ImageIcon("add.png");
	ImageIcon dlt=new ImageIcon("dlt.png");
	JButton b1,b2,b3,b4;
	JComboBox li;
	int count=0;
	int i=0;
	Managecourse()
	{
		
		setLayout(null);
		Font f=new Font("Aldhabi",Font.BOLD,15);
		setFont(f);
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
		
		
		
		
		
		
		li=new JComboBox(s);
		li.setBounds(370,300,200,50);
		li.setFont(f);
		add(li);
		
		
		b1=new JButton(bck);
		b1.setBounds(0,600,100,30);
		add(b1);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		b1.setContentAreaFilled(false);
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		
		b2=new JButton(dlt);
		b2.setBounds(370,370,100,30);
		add(b2);
		b2.setOpaque(false);
		b2.setBorderPainted(false);
		b2.setContentAreaFilled(false);
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
		
		b3=new JButton(edt);
		b3.setBounds(500,370,100,30);
		add(b3);
		b3.setOpaque(false);
		b3.setBorderPainted(false);
		b3.setContentAreaFilled(false);
		b3.setBackground(Color.red);
		b3.setForeground(Color.white);
		
		b4=new JButton(add);
		b4.setBounds(550,300,150,50);
		add(b4);
		b4.setOpaque(false);
		b4.setBorderPainted(false);
		b4.setContentAreaFilled(false);
		b4.setBackground(Color.red);
		b4.setForeground(Color.white);
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ImageIcon img1=new ImageIcon("bg1.jpg");
		Image hm1=img1.getImage();
		g.drawImage(hm1,0,0,this);
	}
}	