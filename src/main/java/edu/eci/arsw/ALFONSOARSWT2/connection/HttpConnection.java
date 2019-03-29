package edu.eci.arsw.ALFONSOARSWT2.connection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Service;

import ch.qos.logback.classic.net.SyslogAppender;
import edu.eci.arsw.ALFONSOARSWT2.modules.Sys;

@Service
public class HttpConnection {
    //https://api.openweathermap.org/data/2.5/weather?q=London&APPID=5412068c04d43bc07ca5af85f0c8c6df
	private static String nameCity;
	private static final String USER_AGENT = "Mozilla/5.0";
	private String URL = "https://api.openweathermap.org/data/2.5/weather?q=";
	private static final String key = "&APPID=5412068c04d43bc07ca5af85f0c8c6df\n";
	private String GET_URL;

	public String conectar() throws IOException {		
		URL obj = new URL(GET_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		StringBuffer response = new StringBuffer();
		
		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code :: " + responseCode);
		if(responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			
			
			while ((inputLine = in.readLine()) != null ) {
				response.append(inputLine);
			}
			in.close();
			
			System.out.println(response.toString());			
		}else {
			System.out.println("GET request not worked");
		}		
		
		return response.toString();
	}	
	
	public void setNameCity(String name) {
		GET_URL = URL+name+key;		
	}
}
