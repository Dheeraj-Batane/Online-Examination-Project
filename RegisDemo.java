import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegisDemo extends JPanel implements ActionListener
{
	ImageIcon bck=new ImageIcon("back1.png");
	ImageIcon sub=new ImageIcon("sub.png");
	ImageIcon res=new ImageIcon("res.png");
	JLabel l[]=new JLabel[8];
	ButtonGroup bg;
	JRadioButton r1,r2,r3;
	JComboBox li,li2,li3;
	JButton b1,b2,b3;
	JLabel hd;
	JTextField t1,t2,t4,t5;
	JPasswordField t3;
	JTextArea t6;
	int i,j,k=0;
	int x=200;
	int y=70;
	
	String s[]={"Username","Name","Password.","Gender","E-Mail","D.O.B.","College","Address"};
	String s1[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String s2[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
	String s3[]={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008"};
	RegisDemo()
	{
		setLayout(null);
		Font f=new Font("Aldhabi",Font.BOLD,15);
		setFont(f);
		
		Font f2=new Font("Algerian",Font.ITALIC,30);
		
		hd=new JLabel("Registration Form");
		add(hd);
		hd.setFont(f2);
		hd.setBounds(300,30,300,35);
		
		
		for(i=1;i<=8;i++)
		{
			
			l[k]=new JLabel(s[k]);
			l[k].setBounds(x,y,150,50);
			add(l[k]);
			//l[k].setForeground(Color.white);
			l[k].setFont(f);
			
			k++;
			
			x=200;
			y+=50;
		}
		
		bg=new ButtonGroup();
		
		
		t1=new JTextField();
		t1.setBounds(350,78,250,25);
		add(t1);
		t1.setOpaque(false);
		t1.setFont(f);
		
		t2=new JTextField();
		t2.setBounds(350,128,250,25);
		add(t2);
		t2.setOpaque(false);
		t2.setFont(f);
		
		t3=new JPasswordField();
		t3.setBounds(350,178,250,25);
		add(t3);
		t3.setOpaque(false);
		t3.setFont(f);
		
		r1=new JRadioButton("Male");
		r1.setFont(f);
		bg.add(r1);
		add(r1);
		r1.setBounds(350,228,60,25);
		
		r2=new JRadioButton("Female");
		r2.setFont(f);
		bg.add(r2);
		add(r2);
		r2.setBounds(410,228,80,25);
		
		r3=new JRadioButton("Others");
		r3.setFont(f);
		bg.add(r3);
		add(r3);
		r3.setBounds(490,228,80,25);
		
		
		t4=new JTextField();
		t4.setBounds(350,278,250,25);
		add(t4);
		t4.setOpaque(false);
		t4.setFont(f);
		
		
		li=new JComboBox(s1);
		li.setBounds(350,330,50,25);
		li.setFont(f);
		add(li);
		
		li2=new JComboBox(s2);
		li2.setBounds(410,330,100,25);
		li2.setFont(f);
		add(li2);
		
		li3=new JComboBox(s3);
		li3.setBounds(520,330,80,25);
		li3.setFont(f);
		add(li3);
		
		
		
		t5=new JTextField();
		t5.setBounds(350,378,250,25);
		add(t5);
		t5.setOpaque(false);
		t5.setFont(f);
		
		t6=new JTextArea();
		t6.setBounds(350,428,250,50);
		add(t6);
		t6.setBackground(Color.black);
		t6.setForeground(Color.white);
		//t6.setOpaque(false);
		t6.setFont(f);
		
		
		
		
		b1=new JButton(bck);
		b1.setBounds(0,600,100,30);
		add(b1);
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		b1.setContentAreaFilled(false);
		
		b2=new JButton(sub);
		b2.setBounds(300,500,100,30);
		add(b2);
		b2.setOpaque(false);
		b2.setBorderPainted(false);
		b2.setContentAreaFilled(false);
		b2.setFont(f);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		
		b3=new JButton(res);
		b3.setBounds(450,500,100,30);
		add(b3);
		b3.setFont(f);
		b3.setOpaque(false);
		b3.setBorderPainted(false);
		b3.setContentAreaFilled(false);
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		t6.setText("");
		
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ImageIcon img1=new ImageIcon("bg1.jpg");
		Image hm1=img1.getImage();
		g.drawImage(hm1,0,0,this);
		
		ImageIcon img2=new ImageIcon("regis.png");
		Image hm2=img2.getImage();
		g.drawImage(hm2,620,200,this);
		
		
	}
	
}