package org.fogbowcloud.sebal.model.image;

public class GeoLoc {
	private int i;
	private int j;
	private double lat;
	private double lon;

	public GeoLoc(int i, int j, double lat, double lon) {
		this.i = i;
		this.j = j;
		this.lat = lat;
		this.lon = lon;
	}

	public GeoLoc() {
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}