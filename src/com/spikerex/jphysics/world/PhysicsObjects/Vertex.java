package com.spikerex.jphysics.world.PhysicsObjects;

public class Vertex extends PhysicsObject{
	public boolean fixed;
	public Vertex(int x,int y,boolean fixed){
		super(x, y);
		this.fixed = fixed;
	}
}
