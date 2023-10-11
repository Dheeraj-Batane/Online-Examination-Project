import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class FDemo extends JFrame implements ActionListener
{
	HomeDemo home;
	Container cn;
	CardLayout card;
	FDemo()
	{
		cn=getContentPane();
		setTitle("Online Examination");
		setResizable(false);
		
		card=new CardLayout();
		setLayout(card);
		
		home=new HomeDemo();
		add("hm",home);
		
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
}
class main
{
	public static void main(String []arg)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setBounds(100,100,1000,800);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}