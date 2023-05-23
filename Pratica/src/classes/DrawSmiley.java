package classes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//Rosto
		g.setColor(Color.yellow);
		g.fillOval(10, 10, 200, 200);
		//Rosto
		g.setColor(Color.black);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65,30,30);
		//Boca
		g.fillOval(50,110,120,60);
		//Sorriso
		//Retoque da boca para criar um sorriso
		g.setColor(Color.yellow);
		g.fillRect(50,110,120,30);
		g.fillOval(50,120,120,40);
		
		
	}
}// Fim da classe DrawSmiley

