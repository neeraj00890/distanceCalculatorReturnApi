package com.dto;

import java.util.Date;

public class InputDTO {

	private String when_Travelled;
	private String distance;
	private String time; //in km
	private String name;
	private String userName;;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDistance() {
		return distance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWhen_Travelled() {
		return when_Travelled;
	}
	public void setWhen_Travelled(String when_Travelled) {
		this.when_Travelled = when_Travelled;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
