package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.InputDTO;
import com.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@PostMapping(value="/input", produces="application/json")
	private ResponseEntity<String> storeInput(@RequestBody InputDTO input) {
		
		return userService.storeUser(input);
		}
	
	@GetMapping(value="/getDistance/{userName}",  produces="application/json")
	private ResponseEntity<String> getDistance(@RequestParam String startTimeStamp ,@RequestParam String endTimeStamp,@PathVariable String userName ) {
		return userService.getDistance(startTimeStamp,endTimeStamp,userName);
		
		}

}
