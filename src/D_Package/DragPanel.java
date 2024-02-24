package D_Package;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;

public class DragPanel extends JPanel {

	
	ImageIcon  image = new ImageIcon("smile.png");
	final int WIDTH = image.getIconWidth();
	final int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point prevpt;
	Point currentpt;
	
	DragPanel(){
		
		imageCorner = new Point(0,0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		
		
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
		
		
		
	}
	
	public void  paintComponent(Graphics g) {
		
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
		
	}
	
	private class ClickListener extends MouseAdapter{
		
		public void mousePressed(MouseEvent e) {
			prevpt = e.getPoint();
		}
		
	}
	
	private class DragListener extends MouseMotionAdapter{
		
		public void mouseDragged(MouseEvent e) {
			currentpt =  e.getPoint();
			
			imageCorner.translate((int)(currentpt.getX() - prevpt.getX()), (int)(currentpt.getY() - prevpt.getY()));
			
			prevpt = currentpt;
			repaint();
		}
		
	}
}
