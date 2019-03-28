package edu.eci.arsw.ALFONSOARSWT2.persistence.impl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import edu.eci.arsw.ALFONSOARSWT2.Exception.WeatherException;
import edu.eci.arsw.ALFONSOARSWT2.connection.HttpConnection;
import edu.eci.arsw.ALFONSOARSWT2.modules.City;
import edu.eci.arsw.ALFONSOARSWT2.persistence.WeatherPersistence;

@Service
public class WeatherPersistenceImpl implements WeatherPersistence{
	private Map<String, City> ciudades = new HashMap<>();
	@Autowired
	private HttpConnection conection;
	
	@Override
	public String getCityByName(String name) throws IOException {
		String ciudadJson = "";
		if(!ciudades.containsKey(name)) {
			ciudadJson = conection.conectar();
		}else {
			Gson gson = new Gson();
			ciudadJson = gson.toJson(ciudades.get(name));
			System.out.println(ciudadJson);
		}
		return ciudadJson;
	}
}
			 