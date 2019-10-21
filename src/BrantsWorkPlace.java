    import javax.swing.JFrame;
   	import java.awt.*;
   	import javax.swing.*;
    import javax.swing.ImageIcon;
    import javax.swing.JLabel;

	public class BrantsWorkPlace extends JFrame   {
		
		public static void main(String[] args) {
			JFrame frame = new JFrame();
			  ImageIcon icon = new ImageIcon("bone goblin.png");
			  JLabel label = new JLabel(icon);
			  frame.add(label);
			  frame.setDefaultCloseOperation
			         (JFrame.EXIT_ON_CLOSE);
			  frame.pack();
			  frame.setVisible(true);
			  
	
		}
	
	
	}

    	
	
 
    	
    	
    


