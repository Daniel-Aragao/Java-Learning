package they.game;

import java.awt.Dimension;

import they.screen.Display;

public class Game implements Runnable {
	private Display display;
	private Dimension dim;
	private String title;
	
	private Thread thread;	
	private boolean gameLoop = false;

	public Game(String title, Dimension dim) {
		this.dim = dim;
		this.title = title;
	}

	private void init() {
		display = new Display(title, dim);
	}

	private void tick(){ // tick or update
		
	}
	
	private void render(){
		
	}
	
	// Game Loop => update all variables, positions of objects, etc. =>
	// render(draw) everything to the screen and then star over
	public void run() {
		init();
		
		while(gameLoop){
			tick();
			render();
		}
		
		stop();
		
	}

	public synchronized void start() {
		if(gameLoop){
			return;
		}
		gameLoop = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop() {
		if(!gameLoop)
			return;
		gameLoop = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
