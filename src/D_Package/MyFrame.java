package D_Package;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	DragPanel dragPanel = new DragPanel();
	
	
	
	MyFrame(){
		
		
		
		this.add(dragPanel);
		this.setTitle("Drag and drop panel");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
	}

}
