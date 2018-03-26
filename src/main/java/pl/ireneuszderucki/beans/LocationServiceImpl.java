package pl.ireneuszderucki.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LocationServiceImpl implements LocationService {

	@Override
	public List<String> getLocations() {
		List<String> locations = new ArrayList<>();
		locations.add("Warszawa");
		locations.add("Krakow");
		locations.add("Lodz");
		locations.add("Wroclaw");
		locations.add("Poznan");
		locations.add("Gdańsk");
		locations.add("Gdynia");
		locations.add("Sopot");
		locations.add("Szczecin");
		locations.add("Katowice");
		locations.add("Kielce");
		locations.add("Zielona Gora");
		locations.add("Rzeszow");
		return locations;
	}

}
