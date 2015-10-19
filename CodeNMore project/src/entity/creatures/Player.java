package entity.creatures;

import java.awt.Graphics;

import they.game.Game;
import they.graphics.Assets;

public class Player extends Creature {
	
	private Game game;
	
	public Player(Game game, float x, float y) {
		super(x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		this.game = game;
	}

	@Override
	public void update() {
		getInput();
		move();
	}

	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		if(game.getKeyManage().up){
			yMove = -speed;
		}
		if(game.getKeyManage().down){
			yMove = speed;
		}
		if(game.getKeyManage().left){
			xMove = -speed;
		}
		if(game.getKeyManage().right){
			xMove = speed;
		}
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawImage(Assets.player, (int)x, (int)y,width,height, null);
		
	}
	
}