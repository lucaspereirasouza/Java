package objetos;

import classes.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class ShapesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog(
			"Enter 1 to draw rectangles \n"+
			"Enter 2 to draw ovals");
				
		int choice = Integer.parseInt(input);
		
		Shapes panel = new Shapes(choice);
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);
				
	}

}