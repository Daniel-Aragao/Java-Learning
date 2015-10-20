package tile;

import java.awt.image.BufferedImage;

import they.graphics.Assets;

public class RockTile extends Tile{

	public RockTile(int id) {
		super(Assets.stone, id);
		
	}

	@Override
	public boolean isSolid(){
		return true;
	}
	
}
