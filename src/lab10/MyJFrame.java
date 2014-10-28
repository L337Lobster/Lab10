package lab10;

import java.awt.*;
import javax.swing.*;

public class MyJFrame extends JFrame
{
	MyJPanelstd mjp;
        final int WIDTH = 800, HEIGHT=600;
	public MyJFrame ()
	{
		super ("My First Frame");
//------------------------------------------------------
// Create components
    	mjp = new MyJPanelstd(this);
//------------------------------------------------------
// Choose a Layout for JFrame and 
// add Jpanel to JFrame according to layout    	
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(mjp,"Center");
//------------------------------------------------------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (new Dimension(WIDTH, HEIGHT));
		setVisible(true);
                setLocationRelativeTo(null);
	}
}
