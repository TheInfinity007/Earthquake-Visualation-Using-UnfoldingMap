package guimodule;

public class Airport implements Comparable<Airport> {

	private int airportId;
	private String name;
	private String city;
	private String country;
	private String code3;
	private String code4;
	private double latitude;
	private double longitude;
	private int altitude;
	private float timezone;
	private char dst;
	private String dbTimezone;

	public Airport() {
		// TODO Auto-generated constructor stub
	}

	public Airport(int airportId, String name, String city, String country, String code3, String code4, double latitude,
			double longitude, int altitude, float timezone, char dst, String dbTimezone) {
		this.airportId = airportId;
		this.name = name;
		this.city = city;
		this.country = country;
		this.code3 = code3;
		this.code4 = code4;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.timezone = timezone;
		this.dst = dst;
		this.dbTimezone = dbTimezone;
	}
	
	public int getAirportId() {
		return this.airportId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public String getCode3() {
		return this.code3;
	}
	
	public String getCode4() {
		return this.code4;
	}
	
	public double getLatitude() {
		return this.latitude;
	}
	
	public double getLongitude() {
		return this.longitude;
	}
	
	public int getAltitude() {
		return this.altitude;
	}
	
	public float getTimezone() {
		return this.timezone;
	}
	
	public char getDst() {
		return this.dst;
	}
	
	public String getDbTimezone() {
		return this.dbTimezone;
	}
	
	public int compareTo(Airport other) {
		return getCity().compareTo(other.getCity());
	}

}
