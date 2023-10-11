import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
class user extends JPanel
{

		JTable jt;
		JScrollPane sp;
		JButton b1;
		DefaultTableModel tableModel;
		user()
		{
			// setLayout(null);
			// jt.setBounds(100,100,500,500);
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam?allowPublicKeyRetrieval=true&useSSL=false","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select *from regis");
			String []columns={"User Name","Name","Gender","Email","College","Address"};
			tableModel = new DefaultTableModel(columns, 0);
			while(rs.next())
			{
				String x1=rs.getString("Username");
				String x2=rs.getString("Name");
				String x3=rs.getString("Gender");
				String x4=rs.getString("Email");
				String x5=rs.getString("College");
				String x6=rs.getString("Address");
				String []data={x1,x2,x3,x4,x5,x6};
				tableModel.addRow(data);
			}
				jt =new JTable(tableModel);
			sp=new JScrollPane(jt);
				add(sp);
			con.close();
			}
			catch(Exception e1)
			{
			System.out.println(e1);
			}
			
		b1=new JButton("Back");
		// b1.setBounds(400,400,100,30);
		add(b1);
		// b1.setOpaque(false);
		// b1.setBorderPainted(false);
		// b1.setContentAreaFilled(false);
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