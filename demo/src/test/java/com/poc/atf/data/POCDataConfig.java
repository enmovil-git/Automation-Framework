package com.poc.atf.data;

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class POCDataConfig {
	
	JSONParser parser = null;
	JSONObject json = null;
	ObjectMapper objectMapper = null;
	
	public POCLoginData getLoginData() {
		POCLoginData loginData = null;
		try {
			parser = new JSONParser();
			json = (JSONObject) parser.parse(new FileReader("src/main/resources/poc-data/poc-login-data.json"));
			objectMapper = new ObjectMapper();
			loginData = objectMapper.readValue(json.toString(), POCLoginData.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginData;
	} 
	
	public IntransitConsignmentsData getIntransitConsignmentsData() {
		IntransitConsignmentsData intransitConsignmentsData = null;
		try {
			parser = new JSONParser();
			json = (JSONObject) parser.parse(new FileReader("src/main/resources/poc-data/IntransitConsignments.json"));
			objectMapper = new ObjectMapper();
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			intransitConsignmentsData = objectMapper.readValue(json.toString(), IntransitConsignmentsData.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return intransitConsignmentsData;
	} 
}
	
	
	
	
