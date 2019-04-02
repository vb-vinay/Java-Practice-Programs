import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
	class CLayout implements ActionListener
	{
	JFrame f;
	JPanel jp;
	JButton b[];
	CardLayout cl;
	CLayout (String s)
		{
		jp=new JPanel();
		cl=new CardLayout();
		jp.setLayout(cl);
		f.add(jp);
				f=new JFrame("swing");
				b= new JButton[5];

		String s1[]={"north","south","east","west","centre"};

		String x[]={BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.EAST,BorderLayout.WEST,BorderLayout.CENTER};

		for(int i=0;i<b.length;i++)
		{
		b[i]=new JButton(s1[i]);
		b[i].addActionListener(this);
		jp.add(b[i],x[i]);
		}

		f.add (jp);

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(400,400);
pack();
f.setVisible(true);
}


public void actionPerformed (ActionEvent e)
	{
		cl.next(jp);
	}
public static void main(String...s)
	{
	new CLayout("second string");
	}
}