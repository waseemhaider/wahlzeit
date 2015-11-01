package org.wahlzeit.model;
import java.io.Serializable;


/* Coordinate class for adding new coordinate attribute to foto class 
 */
public class Coordinate implements Serializable{
	private static final long serialVersionUID = 1176090257347090645L;
	private double latitude;
	private double longitude;
	
	public Coordinate(){
		
	}
	
	public Coordinate(double latitude, double longitude){
		this.setLatitude(latitude);
		this.setLongitude(longitude);
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
}