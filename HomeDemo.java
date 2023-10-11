import javax.swing.*;
import java	.awt.*;
import java	.awt.event.*;

class HomeDemo extends JPanel
{
	ImageIcon im=new ImageIcon("i.png");
	ImageIcon im1=new ImageIcon("i1.png");
	JButton b1,b2;
	HomeDemo()
	{
		setLayout(null);
		
		
		
		
		b1=new JButton(im);
		b1.setBounds(400,300,150,40);
		
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		b1.setContentAreaFilled(false);
		add(b1);
		
		b2=new JButton(im1);
		b2.setBounds(400,400,150,40);
		b2.setOpaque(false);
		b2.setBorderPainted(false);
		b2.setContentAreaFilled(false);
		add(b2);
		
		
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ImageIcon img1=new ImageIcon("bg1.jpg");
		Image hm1=img1.getImage();
		g.drawImage(hm1,0,0,this);
		
		ImageIcon img2=new ImageIcon("pg2.png");
		Image pg1=img2.getImage();
		g.drawImage(pg1,325,50,this);
		
		
		
	}
	
}