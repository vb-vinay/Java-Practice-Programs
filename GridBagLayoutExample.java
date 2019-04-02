import java.awt.*;
import javax.swing.*;
public class GridBagLayoutExample 
	{	
	public static void main(String[] args) 
		{
		JFrame f=new JFrame();
		f.setSize(800,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        JPanel p=new JPanel(new GridBagLayout());
		p.setBackground(Color.YELLOW);		  
		     f.getContentPane().add(p,BorderLayout.NORTH);		
		     GridBagConstraints c=new GridBagConstraints();
		     c.insets=new Insets(10, 10, 10, 10);
		     JLabel l= new JLabel("TEXT1");
		       Font fk=new Font("Algerian",Font.BOLD,40);
       		l.setFont(fk);
		       l.setForeground(Color.RED);

        c.gridx=1;
        c.gridy=0;
        p.add(l,c);
        
        JLabel l2= new JLabel("TEXT2");
        c.gridx=2;
        c.gridy=0;
        p.add(l2,c);
        
        JLabel l3= new JLabel("TEXT3");
        c.gridx=3;
        c.gridy=0;


  	p.add(l3,c);
        
	}

}
