package they.game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import they.screen.Display;
import they.screen.ImageLoader;

public class Game implements Runnable {
	private Display display;
	private Dimension dim;
	private int width, height;
	private String title;
	
	private Thread thread;	
	private boolean gameLoop = false;
	
	private BufferStrategy bs;
	private Graphics g;
	


	public Game(String title, Dimension dim) {
		this.dim = dim;
		width = dim.width;
		height = dim.height;
		this.title = title;
	}

	private void init() {
		display = new Display(title, dim);
	}

	private void tick(){ // tick or update
		
	}
	
	private void render(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, dim.width, dim.height);
		//Draw Here!
		
		//https://www.youtube.com/watch?v=Vmpe6mht3qE&list=PLah6faXAgguMnTBs3JnEJY0shAc18XYQZ&index=8
		
		//End Drawing!
		bs.show();
		g.dispose();
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
