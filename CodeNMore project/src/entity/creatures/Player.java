package entity.creatures;

import java.awt.Graphics;

import they.graphics.Assets;

public class Player extends Creature {

	public Player(float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Assets.player, (int)x, (int)y, null);
		
	}
	
}