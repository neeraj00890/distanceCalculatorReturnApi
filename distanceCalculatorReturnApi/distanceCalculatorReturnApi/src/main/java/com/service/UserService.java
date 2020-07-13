package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dto.InputDTO;

@Service
public class UserService implements IUserService {

	@Autowired
	RestTemplate restTemplate;
	
	
	
	public ResponseEntity<String>  storeUser(InputDTO input) {
		String  URL ="http://distance-calculator/user/input";
		HttpHeaders header= new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity< Object> entity= new HttpEntity<>(input,header);
		ResponseEntity<String> response=restTemplate.exchange(URL, HttpMethod.POST, entity, String.class);
		return response;
		
	
		
	}
	
	public ResponseEntity<String> getDistance(String startTimeStamp,String endTimeStamp,String userName){
		HttpHeaders header= new HttpHeaders();
		String URL="http://distance-calculator/user/getDistance/"+userName+"?startTimeStamp="+startTimeStamp+"&"+"endTimeStamp="+endTimeStamp;
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity< Object> entity= new HttpEntity<>(header);
		ResponseEntity<String> response=restTemplate.exchange(URL,
				HttpMethod.GET, entity, String.class);
		return response;
	}
}
