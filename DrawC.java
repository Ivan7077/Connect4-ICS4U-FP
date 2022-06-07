import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DrawC extends JFrame implements ActionListener{

	private JFrame framein;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;

	
	public DrawC(){
	
		framein = new JFrame("Connect Four");
	 
	    button1 = new JButton();
	    button1.setText("PvP");
	    button1.setFocusable(false);
	    button1.addActionListener(this);
	    button1.setBounds(50,100,100,50);
	        
	    button2 = new JButton();
	    button2.setText("PvE-Hard");
	    button2.setFocusable(false);
	    button2.addActionListener(this);
	    button2.setBounds(150,100,100,50);

	    button3 = new JButton();
	    button3.setText("PvE-Medium");
	    button3.setFocusable(false);
	    button3.addActionListener(this);
	    button3.setBounds(250,100,100,50);
	    
	    button4 = new JButton();
	    button4.setText("PvE-Easy");
	    button4.setFocusable(false);
	    button4.addActionListener(this);
	    button4.setBounds(450,100,100,50);

	    

	        
	 	

        framein.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framein.pack();
        framein.setSize(500,500);
        framein.add(button1);
        framein.add(button2);
        framein.add(button3);
        framein.add(button4);

        framein.setVisible(true);
        
	 	
        
        
        
	 	
	}

	public static void main(String[] args) {
		new DrawC();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			System.out.println("mode0");
		}
		else if(e.getSource()==button2) {
			System.out.println("mode1");
		}
		else if(e.getSource()==button3) {
			System.out.println("mode2");
		}
		else if(e.getSource()==button4) {
			System.out.println("mode3");
		}
	
}


	
}