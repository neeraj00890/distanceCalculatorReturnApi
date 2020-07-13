package com.service;

import org.springframework.http.ResponseEntity;

import com.dto.InputDTO;

public interface IUserService  {

	public ResponseEntity<String>  storeUser(InputDTO input);
	public ResponseEntity<String> getDistance(String startTimeStamp,String endTimeStamp,String userName);
}
