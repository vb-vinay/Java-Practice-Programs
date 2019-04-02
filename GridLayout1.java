import javax.swing.*;
import java.awt.*;

	 class GridLayout1
	{
	  public static void main(String[] args) 
		{	
		    JFrame frame = new JFrame(" example of GridLayout");
		   frame.setResizable(false);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		    JPanel panel=new JPanel();
		    panel.setLayout(new GridLayout(5,2,40,40));
		
		 JLabel jl=new JLabel("Enter name");
		  panel.add(jl);
	
		    panel.add(new JTextField());

		    panel.add(new JLabel("Enter Roll"));

		    panel.add(new JTextField());

		    panel.add(new JLabel("Enter Class"));
		    panel.add(new JTextField());

		    panel.add(new JLabel("Enter Total Marks"));
		    panel.add(new JTextField());
		
		    panel.add(new JButton("Ok"));
		    panel.add(new JButton("Cancel"));

		    frame.add(panel);
		    frame.setSize(400,400);
		    frame.setVisible(true);
		  }
}