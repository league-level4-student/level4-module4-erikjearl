package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{
	int width = 50;
	int height = 50;
	
	MovingMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), width, height);
	}
	
	public void update() {
		Random r = new Random();
		
		setX(getX()+r.nextInt(10)-5);
		setY(getY()+r.nextInt(10)-5);
	}
}
