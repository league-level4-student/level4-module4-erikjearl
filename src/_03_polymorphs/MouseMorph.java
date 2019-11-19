package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

public class MouseMorph extends Polymorph{
	int width = 50;
	int height = 50;
	
	MouseMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(getX(), getY(), width, height);
	}
	
	public void update() {
		setX(MouseInfo.getPointerInfo().getLocation().x-25);
		setY(MouseInfo.getPointerInfo().getLocation().y-60);
	}
	
	
	
}
