package states;

import java.awt.Graphics;

import they.game.Game;
import tile.Tile;
import world.World;
import entity.creatures.Player;

public class GameState extends State{

	private Player player;
	private World world;
	
	public GameState(Game game){
		super(game);
		player = new Player(game,100, 100);
		world = new World(game,"res/worlds/world2.txt");
		
	}
	
	
	
	@Override
	public void update() {
		world.update();
		player.update();
	}

	@Override
	public void draw(Graphics g) {
		world.draw(g);
		player.draw(g);
	}
	
}
