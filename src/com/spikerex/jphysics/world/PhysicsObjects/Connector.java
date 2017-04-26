package com.spikerex.jphysics.world.PhysicsObjects;

public class Connector extends PhysicsObject{
	public Vertex vert1,vert2;
	public Connector(int x,int y,Vertex vert1,Vertex vert2){
		super(x, y);
		this.vert1 = vert1;
		this.vert2 = vert2;
	}
}
