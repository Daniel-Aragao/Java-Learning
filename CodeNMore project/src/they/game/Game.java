package they.game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import states.GameState;
import states.State;
import states.State;
import they.display.Display;
import they.graphics.Assets;

public class Game implements Runnable {
	private Display display;
	private Dimension dim;
	private int width, height;
	private String title;

	private Thread thread;
	private boolean gameLoop = false;

	private BufferStrategy bs;
	private Graphics g;

	//States
	private State gameState;
	
	
	public Game(String title, Dimension dim) {
		this.dim = dim;
		width = dim.width;
		height = dim.height;
		this.title = title;
	}

	private void init() {
		display = new Display(title, dim);
		Assets.init();
		
		gameState = new GameState();
		State.setState(gameState);
	}

	
	private void tick() { // tick or update
		if(State.getState()!=null){
			State.getState().update();
		}
	}

	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if (bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		// Clear Screen
		g.clearRect(0, 0, dim.width, dim.height);
		// Draw Here!

		if(State.getState()!=null){
			State.getState().draw(g);
		}

		// End Drawing!
		bs.show();
		g.dispose();
	}

	// Game Loop => update all variables, positions of objects, etc. =>
	// render(draw) everything to the screen and then star over
	public void run() {
		init();

		int fps = 60;
		double targetTime = 1000000000 / fps;
		double delta = 0;
		long currentTime;
		long lastTime = System.nanoTime();
		long timer = 0;
		int frames = 0;

		while (gameLoop) {
			currentTime = System.nanoTime();
			delta += (currentTime - lastTime) / targetTime;
			timer += currentTime - lastTime;
			lastTime = currentTime;

			if (delta >= 1) {
				tick();
				render();
				frames++;
				delta--;
			}
			if(timer>=1000000000){
				System.out.println("FPS:"+frames);
				frames = 0;
				timer = 0;
			}
		}

		stop();

	}

	public synchronized void start() {
		if (gameLoop) {
			return;
		}
		gameLoop = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop() {
		if (!gameLoop)
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
