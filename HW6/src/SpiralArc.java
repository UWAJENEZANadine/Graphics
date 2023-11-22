import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SpiralArc extends JPanel{


	
	public void paintComponent(Graphics gr) {
		int x = getSize().width /2 ;
		int y = getSize().height /2;
		int width = 20 ;
		int height = 20;
		int startAngle = 0;
		int arcAngle = 180;
		int depth = 15;
	
		for(int i =0; i < 10; i++) {
			if(i % 2 != 0) {
				y = y - depth;
				width = width + 2 * depth;
				height = height + 2 * depth;
				gr.drawArc(x, y, width ,height, startAngle, arcAngle);
				
			}else {
				x = x -2 * depth;
				y = y - depth;
				width = width + 2 * depth;
				height = height + 2 * depth;
				gr.drawArc(x, y, width, height, startAngle, -arcAngle);
			}
				
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralArc p = new SpiralArc();
		
		JFrame appl = new JFrame();
		
		appl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appl.add(p);
		appl.setSize(280,280);
		appl.setVisible(true);

	}

}
