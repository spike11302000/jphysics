package com.spikerex.jphysics.world.PhysicsObjects;

public class PhysicsObject {
	public int x,y;
	public int vx,vy;
	public PhysicsObject(int x,int y){
		this.x = x;
		this.y = y;
		this.vx = 0;
		this.vy = 0;
	}
}
