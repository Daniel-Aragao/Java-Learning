package they.game;

import java.awt.Dimension;

import they.display.Display;

public class Launcher {

	public static void main(String[] args) {
		Game game = new Game("MainCall",new Dimension(1024,600));
		game.start();
	}

}
