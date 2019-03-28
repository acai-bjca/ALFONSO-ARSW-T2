package edu.eci.arsw.ALFONSOARSWT2.modules;

public class Wind {
	private double speed;
	private double deg;
	
	
	
	public Wind(double speed, double deg) {
		super();
		this.speed = speed;
		this.deg = deg;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getDeg() {
		return deg;
	}
	public void setDeg(double deg) {
		this.deg = deg;
	}
	
	
	
}
