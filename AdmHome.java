import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AdmHome extends JPanel 
{
	
	JButton b[]=new JButton[5];
	int x=100;
	int y=200;
	int i,j,k=0;
	//String s1[]={"Manage Course","Course Result","LogOut","Users"};
	AdmHome()
	{
		setLayout(null);
		for(i=1;i<=2;i++)
		{
			for(j=1;j<=2;j++)
			{
			b[k]=new JButton("");
			b[k].setBounds(x,y,150,50);
			add(b[k]);
			//b[k].setBackground(Color.red);
			//b[k].setForeground(Color.white);
			b[k].setOpaque(false);
			b[k].setBorderPainted(false);
			b[k].setContentAreaFilled(false);
			x+=300;
			k++;
			}
			x=100;
			y+=250;
		}
		
		repaint();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ImageIcon img1=new ImageIcon("bg1.jpg");
		Image hm1=img1.getImage();
		g.drawImage(hm1,0,0,this);
		
		ImageIcon img2=new ImageIcon("mng.png");
		Image hm2=img2.getImage();
		g.drawImage(hm2,100,200,this);
		
		ImageIcon img3=new ImageIcon("crs.png");
		Image hm3=img3.getImage();
		g.drawImage(hm3,400,200,this);
		
		ImageIcon img4=new ImageIcon("log.png");
		Image hm4=img4.getImage();
		g.drawImage(hm4,100,450,this);
		
		ImageIcon img5=new ImageIcon("usr.png");
		Image hm5=img5.getImage();
		g.drawImage(hm5,400,450,this);
		
		
		
	}
}
	