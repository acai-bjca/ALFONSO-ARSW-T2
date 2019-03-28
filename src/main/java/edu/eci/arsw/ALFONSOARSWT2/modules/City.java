package edu.eci.arsw.ALFONSOARSWT2.modules;

public class City {
	
	private double longitud;
	private double latitud;
	private Weather weather;
	private String base;
	private int dt;
	private int id;
	private String name;
	private int cond;
	private Clouds clouds;
	private Main main;
	private Sys sys;
	private Wind wind;
	
	public City(double longitud, double latitud, Weather weather, String base, int dt, int id, String name, int cond,
			Clouds clouds, Main main, Sys sys, Wind wind) {
		super();
		this.longitud = longitud;
		this.latitud = latitud;
		this.weather = weather;
		this.base = base;
		this.dt = dt;
		this.id = id;
		this.name = name;
		this.cond = cond;
		this.clouds = clouds;
		this.main = main;
		this.sys = sys;
		this.wind = wind;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public int getDt() {
		return dt;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCond() {
		return cond;
	}
	public void setCond(int cond) {
		this.cond = cond;
	}
	
	
	
}
