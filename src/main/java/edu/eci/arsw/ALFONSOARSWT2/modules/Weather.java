package edu.eci.arsw.ALFONSOARSWT2.modules;

public class Weather {
	private int id;
	private String main;
	private String description;
	private String icon;
	private int visibility;
	
	
	
	public Weather() {
		super();
	}
	public Weather(int id, String main, String description, String icon, int visibility) {
		super();
		this.id = id;
		this.main = main;
		this.description = description;
		this.icon = icon;
		this.visibility = visibility;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getVisibility() {
		return visibility;
	}
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	
	
}
