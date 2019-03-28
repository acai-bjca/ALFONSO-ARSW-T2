package edu.eci.arsw.ALFONSOARSWT2.modules;

public class Sys {
	private int typo;
	private int id;
	private double messsage;
	private String country;
	private int sunrise;
	private int sunset;
	
	
	
	public Sys() {
		super();
	}
	public Sys(int typo, int id, double messsage, String country, int sunrise, int sunset) {
		super();
		this.typo = typo;
		this.id = id;
		this.messsage = messsage;
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}
	public int getTypo() {
		return typo;
	}
	public void setTypo(int typo) {
		this.typo = typo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMesssage() {
		return messsage;
	}
	public void setMesssage(double messsage) {
		this.messsage = messsage;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSunrise() {
		return sunrise;
	}
	public void setSunrise(int sunrise) {
		this.sunrise = sunrise;
	}
	public int getSunset() {
		return sunset;
	}
	public void setSunset(int sunset) {
		this.sunset = sunset;
	}
	
	
	
	
}
