package edu.eci.arsw.ALFONSOARSWT2.persistence;

import java.io.IOException;

import edu.eci.arsw.ALFONSOARSWT2.modules.City;


public interface WeatherPersistence {
	public String getCityByName(String name) throws IOException;
}
