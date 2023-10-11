//Online Examination Portal
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class FDemo extends JFrame implements ActionListener
{
	
	HomeDemo home;//home page of project
	AdmLg adm;//Admin Login Page
	UsrLg usr;//User Login Page
	AdmHome adhm;// Admin home page
	RegisDemo regis;//Registration Page of User
	UsrHome usrhm;//user home page
	usrExm exm;//user exam attempting page
	Managecourse mng;//manage course page
	editCourse edt;//edit course page
	addCourse add;//add new course page
	user us;//user page
	examDisplay examDis;
	Container cn;
	CardLayout card;
	int q1=0;
	FDemo()
	{
		cn=getContentPane();
		setTitle("Online Examination");
		setResizable(false);
		
		card=new CardLayout();
		setLayout(card);
		
		
		home=new HomeDemo();
		adm=new AdmLg();
		usr=new UsrLg();
		adhm=new AdmHome();
		regis=new RegisDemo();
		usrhm=new UsrHome();
		mng=new Managecourse();
		edt=new editCourse();
		add=new addCourse();
		exm=new usrExm();
		us=new user();
		examDis=new examDisplay();
		
		
		add("hm",home);
		add("ed",examDis);
		add("adm",adm);
		add("us",usr);
		add("usr",usrhm);
		add("adhm",adhm);
		add("rgs",regis);
		add("mng",mng);
		add("edt",edt);
		add("add",add);
		add("exm",exm);
		add("user",us);
		
		
		home.b1.addActionListener(this);
		home.b2.addActionListener(this);
		adm.b1.addActionListener(this);
		adm.b2.addActionListener(this);
		regis.b1.addActionListener(this);
		regis.b2.addActionListener(this);
		usrhm.b1.addActionListener(this);
		usrhm.b2.addActionListener(this);
		us.b1.addActionListener(this);
		usr.b1.addActionListener(this);
		usr.b2.addActionListener(this);
		usr.b3.addActionListener(this);
		adhm.b[0].addActionListener(this);
		adhm.b[2].addActionListener(this);
		adhm.b[3].addActionListener(this);
		mng.b1.addActionListener(this);
		mng.b3.addActionListener(this);
		mng.b4.addActionListener(this);
		edt.b1.addActionListener(this);
		add.b1.addActionListener(this);
		add.b2.addActionListener(this);
		exm.b1.addActionListener(this);
		exm.b2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==usrhm.b2)
		{
			card.show(cn,"ed");
		}
		if(e.getSource()==home.b1 || e.getSource()==adhm.b[2])
		{
			card.show(cn,"adm");
		}
		if(e.getSource()==home.b2)
		{
			card.show(cn,"us");
		}
		
		if(e.getSource()==exm.b1)
		{
			
			q1=1;
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam?useSSl=false","root","root");
				Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
				String q="select *from c ";
				
				ResultSet rs=st.executeQuery(q);
				if(rs.absolute(q1))
				{
				
				exm.t1.setText(rs.getString(1));
				exm.t2.setText(rs.getString(2));
				exm.t3.setText(rs.getString(3));
				exm.t4.setText(rs.getString(4));
				exm.t5.setText(rs.getString(5));
				exm.t6.setText(rs.getString(6));
				
				}
					
				
			}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
			
			
		}
		if(e.getSource()==adhm.b[3])
		{
			card.show(cn,"user");
			
			
		}
		
		
		if(e.getSource()==usrhm.b2)
		{
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam?useSSl=false","root","root");
				Statement st=con.createStatement();
				String q="select *from c ";
				
				ResultSet rs=st.executeQuery(q);
				if(rs.next())
				{
				card.show(cn,"exm");
				exm.t1.setText(rs.getString(1));	
				exm.t2.setText(rs.getString(2));	
				exm.t3.setText(rs.getString(3));	
				exm.t4.setText(rs.getString(4));	
				exm.t5.setText(rs.getString(5));	
				exm.t6.setText(rs.getString(6));	
				
				
				}
					
				
			}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
			
			
		}
		
		if(e.getSource()==regis.b2)
		{
			String s1=regis.t1.getText();
			String s2=regis.t2.getText();
			String s3=regis.t3.getText();
			String s4="";
			if(regis.r1.isSelected())
			{
				s4=regis.r1.getLabel();
			}
			else if(regis.r2.isSelected())
			{
				s4=regis.r2.getLabel();
			}
			else if(regis.r3.isSelected())
			{
				s4=regis.r3.getLabel();
			}
			String s5=regis.t4.getText();
			String s6=regis.t5.getText();
			String s7=regis.t6.getText();	
		if(s1=="" ||s2==""||s3==""||s4==""||s5==""||s6==""||s7=="")
		{
				JOptionPane.showMessageDialog(null,"All fields are Mandatory");
		}
		else{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam?useSSl=false","root","root");
				Statement st=con.createStatement();
				String q="insert into regis values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"') ";
				
				st.executeUpdate(q);
				
				JOptionPane.showMessageDialog(null,"Registered Successfully");
				card.show(cn,"us");
				
			}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
			
			
			
		
		}
		}
		
		
		if(e.getSource()==add.b2)
		{
			String s1=add.t1.getText();
			String s2=add.t3.getText();
			String s3=(String)add.li.getSelectedItem();
			
		if(s1=="" ||s2==""||s3=="")
		{
				JOptionPane.showMessageDialog(null,"All fields are Mandatory");
		}
		else{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam?useSSl=false","root","root");
				Statement st=con.createStatement();
				
				
				
				String q="create table "+s1+"(Qid varchar(5),Question varchar(250),OptionA varchar(50), OptionB varchar(50),OptionC varchar(50),OptionD varchar(50),Correct varchar(50))";
				st.executeUpdate(q);
				st.executeUpdate("insert into course values('"+s1+"','"+s2+"','"+s3+"')");
				
				
				JOptionPane.showMessageDialog(null,"Course Added Successfully");
				mng.li.addItem(s1);
				card.show(cn,"mng");
				con.close();
				
			}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
		}
			
		}
		
		if(e.getSource()==mng.b3)
		{
			String s1=(String)mng.li.getSelectedItem();
			card.show(cn,"edt");
			
			
		}
		
		if(e.getSource()==mng.b4)
		{
			card.show(cn,"add");
		}
		
		if(e.getSource()==mng.b1)
		{
			card.show(cn,"adhm");
		}
		
		if(e.getSource()==adhm.b[0] || e.getSource()==edt.b1 ||e.getSource()==add.b1)
		{
			card.show(cn,"mng");
		}
		
		if(e.getSource()==usr.b1)
		{
			String s1=usr.tx1.getText();
			String s2=usr.tx2.getText();
			
			if(s1=="" ||s2=="")
			{
				JOptionPane.showMessageDialog(null,"All fields are Mandatory");
			}
			else{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam?useSSl=false","root","root");
				Statement st=con.createStatement();
				String q="select *from regis where Username='"+s1+"' and Password='"+s2+"' ";
				
				ResultSet rs=st.executeQuery(q);
				if(rs.next())
				{
					
				card.show(cn,"usr");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Username or Password");
				}	
				
			}
			catch(Exception e2)
			{
				System.out.println(e2);
			}
			}
		}
		
		if(e.getSource()==usr.b3)
		{
			card.show(cn,"rgs");
		}
		if(e.getSource()==regis.b1)
		{
			card.show(cn,"us");
		}
		
		if(e.getSource()==adm.b1|| e.getSource()==us.b1 || e.getSource()==adhm.b[2])
		{
			card.show(cn,"adhm");
		}
		
		if(e.getSource()==adm.b2 || e.getSource()==usr.b2 || e.getSource()==usrhm.b1)
		{
			card.show(cn,"hm");
		}
		
	}
}
class main
{
	public static void main(String []arg)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setBounds(200,0,1000,700);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}