import javax.swing.*;
import java.awt.event.*;
public class emi implements ActionListener {
	JFrame f1;
	JFrame f2;
	JLabel l1,l2,l3;
	JComboBox jb,jb1,jb2;
	JButton b1;
	emi()
	{
		f1=new JFrame("Loan Form");
		l1=new JLabel("Loan Type");
		l1.setBounds(10,50,80,25);

	
		f1.add(l1);

		jb=new JComboBox();
		jb.addItem("Home");
		jb.addItem("Car");
		jb.addItem("Business");
		jb.setBounds(100,50,80,25);

		f1.add(jb);

		l2=new JLabel("Loan Amount");
		l2.setBounds(250,50,80,25);
		f1.add(l2);
		jb1=new JComboBox();
		jb1.addItem("1,0000000");
		jb1.addItem("5,00000");
		jb1.addItem("20,00000");
		jb1.setBounds(350,50,80,25);
		f1.add(jb1);





		l3=new JLabel("EMI");
		l3.setBounds(500,50,80,25);
		f1.add(l3);
		jb2=new JComboBox();
		jb2.addItem("6");
		jb2.addItem("1");
		jb2.addItem("1.5");
		jb2.setBounds(550,50,80,25);

		f1.add(jb2);
		b1=new JButton("Submit");
		b1.setBounds(100,150,80,25);

		b1.addActionListener(this);

		f1.add(b1);

		f1.setSize(800,700);
		f1.setLayout(null);

		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{  
			f2=new JFrame("Detail Form");
f1.setVisible(false);
			JLabel l1=new JLabel("Loan Type");
			l1.setBounds(100,100,80,25);
			f2.add(l1);
			
			JLabel l8=new JLabel();
			
			JLabel l2=new JLabel("Loan Amount");
			l2.setBounds(100,150,80,25);
			f2.add(l2);
			
			JLabel l3=new JLabel("EMI");
			l3.setBounds(100,200,80,25);
			f2.add(l3);
			
			JLabel l4=new JLabel("Pay");
			l4.setBounds(100,250,80,25);
			f2.add(l4);
			
			JLabel l5=new JLabel("Rate of Intrest");
			l5.setBounds(100,300,100,25);
			f2.add(l5);
			
			JLabel l6=new JLabel("Time");
			l6.setBounds(100,350,80,25);
			f2.add(l6);
			
			JLabel l7=new JLabel("Total Amount");
			l7.setBounds(100,400,80,25);
			f2.add(l7);
						
			f2.setSize(800,700);
			f2.setLayout(null);
			f2.setVisible(true);
			
		}
	}
	public static void main(String arg[])
	{
		new emi();
	
	}

}
