package com.model;

import java.sql.Date;
import java.util.Set;


public class Schedule extends Routes{
	
	private Date startingTime;
	private Date endingTime;
	
	public Schedule(String busName, String busType, String source, String distination, Set<String> stopingArea,
			Date startingTime, Date endingTime) {
		super(busName, busType, source, distination, stopingArea);
		this.startingTime = startingTime;
		this.endingTime = endingTime;
	}
	public Date getStartingTime() {
		return startingTime;
	}
	public void setStartingTime(Date startingTime) {
		this.startingTime = startingTime;
	}
	public Date getEndingTime() {
		return endingTime;
	}
	public void setEndingTime(Date endingTime) {
		this.endingTime = endingTime;
	}

	@Override
	public String toString() {
		return "Schedule [startingTime=" + startingTime + ", endingTime=" + endingTime + ", getSource()=" + getSource()
				+ ", getDistination()=" + getDistination() + ", getStopingArea()=" + getStopingArea() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
