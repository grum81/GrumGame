package co.uk.grahamslaven.main;

import java.awt.Color;
import java.awt.Graphics;

public class BasicEnemy extends GameObject {

	public BasicEnemy(int x, int y, ID id) {
		super(x, y, id);

		this.velX = 5;
		this.velY = 5;
	}
	@Override
	public void tick() {
		x += velX;
		y += velY;
		
		if (y <= 0 || y >= (Game.HEIGHT - 55)) velY *= -1;
		if (x <= 0 || x >= (Game.WIDTH - 30)) velX *= -1;
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 16, 16);
		
	}
	
	
	
}
