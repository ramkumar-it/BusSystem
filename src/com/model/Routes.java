package com.model;

import java.util.Set;

import com.util.ApplicationUtil;

public class Routes {
	private String busId;
 private String busName;
 private String busType;
 private String source;
 private String distination;
 private Set <String> stopingArea;
public Routes(String busName, String busType, String source, String distination, Set<String> stopingArea) {
	super();
	this.busId = "BURM"+new ApplicationUtil().generateUniqueId();
	this.busName = busName;
	this.busType = busType;
	this.source = source;
	this.distination = distination;
	this.stopingArea = stopingArea;
}

public String getBusId() {
	return busId;
}

public String getBusName() {
	return busName;
}
public void setBusName(String busName) {
	this.busName = busName;
}
public String getBusType() {
	return busType;
}
public void setBusType(String busType) {
	this.busType = busType;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDistination() {
	return distination;
}
public void setDistination(String distination) {
	this.distination = distination;
}
public Set<String> getStopingArea() {
	return stopingArea;
}
public void setStopingArea(Set<String> stopingArea) {
	this.stopingArea = stopingArea;
}

@Override
public String toString() {
	return "Routes [busId=" + busId + ", busName=" + busName + ", busType=" + busType + ", source=" + source
			+ ", distination=" + distination + ", stopingArea=" + stopingArea + "]";
}


}
