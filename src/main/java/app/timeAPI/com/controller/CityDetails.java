package app.timeAPI.com.controller;

import java.util.ArrayList;
import java.util.List;

public class CityDetails {
	
	private static List<City> cityDetails = new ArrayList<>();
	
	public static void addCity(City city) {
		cityDetails.add(city);
	}

	public List<City> getCityDetails() {
		return cityDetails;
	}

	public void setCityDetails(List<City> cityDetails) {
		this.cityDetails = cityDetails;
	}
}
