package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    
    ArrayList<Polymorph> arr = new ArrayList<>();
    
    Polymorph bluePoly;
    Polymorph redPoly;
    Polymorph movePoly;
    
    public static void main(String[] args) {
    	new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseListener(this);
   	 
   	 
   	 for(int i = 0; i < 10; i++) {
   		 Random ran = new Random();
   		 int x = ran.nextInt(WIDTH-350);
   		 int y = ran.nextInt(HEIGHT-350);
   		 
   		 arr.add(new BluePolymorph(x, y));
   		 arr.add(new RedMorph(x+100, y+100));
   		 arr.add(new MovingMorph(x+150, y+150));
   		 arr.add(new MouseMorph(x, y));
   		 arr.add(new CircleMorph(x-50, y-50));
   	 }
   	
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for(Polymorph p: arr) {
   		 p.draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 for(Polymorph p: arr) {
   		 p.update();
   	 }
   	 
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX() == 1 && e.getY() == 1) {
			System.out.println("hi");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
