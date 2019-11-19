package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class CircleMorph extends Polymorph{
	int width = 50;
	int height = 50;
	
	int x2;
	int y2;
	CircleMorph(int x, int y) {
		super(x, y);
		x2=getY();
		y2=getY();
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect(getX(), getY(), width, height);
	}
	
	int o = 0;
	int i = 0;
	public void update() {
		if(i%4 == 0)
			o++;
		i++;
		setX((int) (150*Math.cos(o) + x2+200));
		setY((int) (150*Math.sin(o))+ y2+200);
		System.out.println("("+getX()+","+getY()+")");
	}
}
