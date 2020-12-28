package com.cargo.form;

public class ShipmentDetails {

	private int pieces;
	private float weight;
	private float volume;
	private String cmdtyCode;
	private String uldType;
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
	public float getVolume() {
		return volume;
	}
	public void setVolume(float volume) {
		this.volume = volume;
	}
	public String getCmdtyCode() {
		return cmdtyCode;
	}
	public void setCmdtyCode(String cmdtyCode) {
		this.cmdtyCode = cmdtyCode;
	}
	public String getUldType() {
		return uldType;
	}
	public void setUldType(String uldType) {
		this.uldType = uldType;
	}
}
