package lab10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;
public class MyJPanelstd extends JPanel implements ActionListener, MouseMotionListener
{
    JButton clickMe;
    JLabel scoreL;
    int height=0, width=0, score = 0, x,y,diff=1;
    Timer buttonMove;
    boolean left = true, up = true;
    Dimension size;
    JFrame frame;
    public MyJPanelstd(JFrame frame)
    {
        super();
        buttonMove = new Timer(50,this);
        buttonMove.start();
        this.frame = frame;
        height=600;
        width=800;
        x = ((width/2)-100);
        y = ((height/2)-100);
        setBackground(Color.black);
        setLayout(null);
        scoreL = new JLabel("Score: "+score);
        clickMe = new Student("Click", "Me!", 20);
        //-------------------------------------------------------	    
        // add buttons to JPanel		
        //-------------------------------------------------------	    
        add(clickMe);
        add(scoreL);
        addMouseMotionListener(this);
        clickMe.addActionListener(this);
        clickMe.setBounds(new Rectangle(x,y,100,50));
        scoreL.setBounds(new Rectangle(width-125,height-100,100,50));
        scoreL.setFont(scoreL.getFont().deriveFont(55.0f));
        scoreL.setForeground(Color.white);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == clickMe)
        {
            score++;
            diff++;
            scoreL.setText("Score: "+score);
        }
        if(obj == buttonMove)
        {
            size = frame.getBounds().getSize();
            width = size.width;
            height = size.height;
            scoreL.setBounds(new Rectangle(width-300,height-100,300,50));
            scoreL.setText("Score: "+score);
            if(x >= width-115)
            {
                left = true;
            }
            if(x <= 10)
            {
                left = false;
            }
            if(left)
            {
                x-=diff;
            }
            if(!left)
            {
                x+=diff;
            }
            if(y <= 10)
            {
                up = false;
            }
            if(y >= height-88)
            {
                up = true;
            }
            if(up)
            {
                y-=diff;
            }
            if(!up)
            {
                y+=diff;
            }
            if(x < 0)
            {
                x = 100;
            }
            if(y < 0)
            {
                y = 100;
            }
            if(x+100 > width)
            {
                x = 100;
            }
            if(y+50 > height)
            {
                y = 100;
            }
            clickMe.setBounds(new Rectangle(x,y,100,50));
        }
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        if(me.getX() >= x-10 && me.getX() <= x+110 && me.getY() >= y-10 && me.getY() <= y+60)
        {
            int r = (int) (Math.random()*width-100);
            int check = (int) (Math.random()*3.0);
            if(check == 0)
            {
                x = r;
                r = (int) (Math.random()*height-100);
                y = r;
                clickMe.setBounds(new Rectangle(x,y,100,50));
            }
        }
    }
}
