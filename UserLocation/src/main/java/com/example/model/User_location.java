package com.example.model;

import java.math.BigDecimal;
import java.util.Comparator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class User_location  implements Comparable<User_location>{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer Userid;
private String username;
private double latitude;
private double longitude;

public User_location() {
	super();
}

public Integer getUserid() {
	return Userid;
}

public void setUserid(Integer userid) {
	Userid = userid;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public double getLatitude() {
	return latitude;
}

public void setLatitude(double latitude) {
	this.latitude = latitude;
}

public double getLongitude() {
	return longitude;
}

public void setLongitude(double longitude) {
	this.longitude = longitude;
}

public User_location(Integer userid, String username, double latitude, double longitude) {
	super();
	Userid = userid;
	this.username = username;
	this.latitude = latitude;
	this.longitude = longitude;
}

@Override
public int compareTo(User_location o) {
	double distanceA = calculateDistance(this.latitude, this.longitude, o.latitude, o.longitude);
    double distanceB = calculateDistance(o.latitude, o.longitude, this.latitude, this.longitude);

   
    return Double.compare(distanceA, distanceB);
}
private static final double EARTH_RADIUS_KM = 6371.0;
private double calculateDistance(double latitude1, double longitude1, double latitude2, double longitude2) {
	  double lat1Rad = Math.toRadians(longitude1);
      double lon1Rad = Math.toRadians(longitude1);
      double lat2Rad = Math.toRadians(longitude2);
      double lon2Rad = Math.toRadians(longitude2);

      double deltaLat = lat2Rad - lat1Rad;
      double deltaLon = lon2Rad - lon1Rad;

      double a = Math.pow(Math.sin(deltaLat / 2), 2) +
              Math.cos(lat1Rad) * Math.cos(lat2Rad) *
              Math.pow(Math.sin(deltaLon / 2), 2);
      double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

      double distance = EARTH_RADIUS_KM * c;

      return distance;
}





}
