import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

public class KochCurve extends JPanel {

	private final int recursionDepthDontUseInYourCode;

	public KochCurve(int recursionDepth) {
		this.recursionDepthDontUseInYourCode = recursionDepth;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//10 percent to the right, and 10 percent to the left
		int x1 = (int)(this.getWidth()*.1); 
		int x2 = (int)(this.getWidth()*.9);

		int y1 = (int)(this.getHeight()/2);
		int y2 = y1;

		drawKochCurve(x1, y1, x2, y2, recursionDepthDontUseInYourCode, (Graphics2D) g);
	}


	//TODO:  Finish this method
	private void drawKochCurve(int x1, int y1, int x2, int y2, int recursionDepth, Graphics2D g) {
		//This is how you draw a line - Somehow we have to work recursion into it
		g.drawLine(x1, y1, x2, y2);

		//Math to get the other 3 points
		double angle = Math.PI / 3; // 60 degrees
		int x3 = (x1*2 + x2) / 3;
		int y3 = (y1*2 + y2) / 3;
		int x4 = (x1 + x2*2) / 3;
		int y4 = (y1 + y2*2) / 3;
		int x5 = (int)(x3 + (x4-x3)*Math.cos(angle) + (y4-y3)*Math.sin(angle));
		int y5 = (int)(y3 - (x4-x3)*Math.sin(angle) + (y4-y3)*Math.cos(angle));

	}


	public static void main(String[] args) {

		//TODO: You can change the recursion here: 
		int recursiveDepth = 6;
		KochCurve k = new KochCurve(recursiveDepth);


		//Don't change these things, as it just sets up the GUI
		JFrame f = new JFrame();
		f.add(k);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setVisible(true);




	}

}
