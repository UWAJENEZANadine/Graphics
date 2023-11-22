
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Question7_1 extends JPanel{
	
	@Override
	public void paintComponent(Graphics gr) {
		super.paintComponent(gr);
		int width = getSize().width;
		int height = getSize().height;
		
		int widthOfCenter = width /2;
		int heigthOfCenter = height /2;
		int step = 40; //distance between lines
		
		//set a color
		gr.setColor(Color.RED);
		for(int i =0; i < 3; i++) {
			
			int x1 = widthOfCenter + (step * i);
			int y1 = heigthOfCenter + (step * i);
			int x2 = widthOfCenter + (step * i);
			int y2 = heigthOfCenter + step + (step * i);
			
//			
			int x3 = widthOfCenter - step - (step * i);
			int y3 = heigthOfCenter + step + (step * i);
			int x4 = widthOfCenter - step - (step * i);
			int y4 = heigthOfCenter - step - (step * i);
			int x5 = widthOfCenter + step + (step * i);
			int y5 = heigthOfCenter - step - (step * i);
			
			gr.drawLine(x1, y1, x2, y2);
			gr.drawLine(x2, y2, x3, y3);
			gr.drawLine(x3, y3, x4, y4);
			gr.drawLine(x4, y4, x5, y5);
			
			
			
		}
		
		//loop for closing the line
		for(int i =0; i<4; i++) {
			int x1 = widthOfCenter + (step * i);
			int y1 = heigthOfCenter + (step * i);
			int x5 = widthOfCenter + (step * i);
			int y5 = widthOfCenter - 11 - (step * i);
			gr.drawLine(x1, y1, x5, y5);
		}

	
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question7_1 p = new Question7_1();
		
		JFrame appl = new JFrame();
		
		appl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appl.add(p);
		appl.setSize(300,300);
		appl.setVisible(true);
		
		
		

	}

}
