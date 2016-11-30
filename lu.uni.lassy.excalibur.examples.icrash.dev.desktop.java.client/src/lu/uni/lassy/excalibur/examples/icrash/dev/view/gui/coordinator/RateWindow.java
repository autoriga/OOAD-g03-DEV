package lu.uni.lassy.excalibur.examples.icrash.dev.view.gui.coordinator;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class RateWindow extends JFrame
{

	private static final long serialVersionUID = 1L;
	private String rate;

	public RateWindow(int rate)
	{
		 this.setLayout(null);
		 this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.setVisible(false);
		 
		 this.rate = Integer.toString(rate);
		 
	     setBounds(0, 0, 250, 250);
	     repaint();
	}

	public void paint(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D) g;
        
    	int fontSize = (30);
        Font f = new Font("Comic Sans MS", Font.BOLD, fontSize);
        g2.setFont(f);
        g2.drawString("YOUR RATE", 30, 50);
        g2.drawString("IS " + rate, 60, 90); 
	}
}