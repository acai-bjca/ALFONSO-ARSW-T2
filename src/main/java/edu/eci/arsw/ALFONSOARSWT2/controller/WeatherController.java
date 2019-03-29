package edu.eci.arsw.ALFONSOARSWT2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.ALFONSOARSWT2.services.WeatherServices;

@RestController
@RequestMapping(value = "/cities")
public class WeatherController {
	@Autowired
	private WeatherServices weatherServices;
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public ResponseEntity<?> manejadorGetCity(@PathVariable String name){            
        try{
            //System.out.println("#########################################################");
            return new ResponseEntity<>(weatherServices.getCityByName(name), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }	
    }
}
