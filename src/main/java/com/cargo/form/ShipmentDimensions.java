package com.cargo.form;

public class ShipmentDimensions {
	
	private int pieces;
	private float weight;
	private float length;
	private float width;
	private float height;
	private float volume;
	private boolean tiltable;
	
	public ShipmentDimensions(int pieces, float weight, float length, float width, float height, boolean tiltable) {
		
		this.pieces = pieces;
		this.weight = weight;
		this.height =  height;
		this.length = length;
		this.width = width;
		this.tiltable = tiltable;
	}
	public int getPieces() {
		return pieces;
	}
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getVolume() {
		return volume;
	}
	public void setVolume(float volume) {
		this.volume = volume;
	}
	public boolean getTiltable() {
		return tiltable;
	}
	public void setTiltable(String tiltable) {
		if (tiltable.equalsIgnoreCase("yes"))
			this.tiltable = true;
		else
			this.tiltable = false;
	}

}
