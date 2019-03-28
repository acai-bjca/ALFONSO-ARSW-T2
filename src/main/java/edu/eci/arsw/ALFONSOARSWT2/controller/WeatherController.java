package edu.eci.arsw.ALFONSOARSWT2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.ALFONSOARSWT2.services.WeatherServices;

@RestController
@RequestMapping(value = "/cities")
public class WeatherController {
	@Autowired
	private WeatherServices weatherServices;
	
	@RequestMapping(value="/{name}")
	public ResponseEntity<?> manejadorGetCity(@PathVariable String city){
			return null;	
	}
}
