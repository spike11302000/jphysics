package com.spikerex.jphysics.world;

import java.util.ArrayList;
import java.util.List;

import com.spikerex.jphysics.graphics.Screen;
import com.spikerex.jphysics.world.PhysicsObjects.PhysicsObject;

public class World {
	public int width,height;
	public float gravity;
	public List<PhysicsObject> phyObj = new ArrayList<PhysicsObject>();
	
	public World(int width,int height){
		this.width = width;
		this.height = height;
		this.gravity = 9.8f;
	}
	public void render(Screen screen){
		for(PhysicsObject po : phyObj){
			po.render(screen);
		}
	}
	public void update(int tick){
		for(PhysicsObject po : phyObj){
			po.update(tick);
		}
	}
}
