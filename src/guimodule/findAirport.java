package guimodule;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class findAirport {

	public static void main(String[] args) throws IOException {
		String dataFile = "data/airports.dat";
		ArrayList<Airport> airports = readFile(dataFile);
		
		String code = findAirportCode("Cold Lake", airports);
		System.out.println(code);

		Collections.sort(airports);
		
		code = findAirportCodeBS("Goroka", airports);
		System.out.println(code);
		
		
	}
	
	//Binary Search Code
	public static String findAirportCodeBS(String toFind, ArrayList<Airport> airports) {
		
		int low = 0;
		int high = airports.size()-1;
		int mid;
		
		while(low <= high) {
			mid = (low + high)/2;
			int compare = toFind.compareTo(airports.get(mid).getCity());
			if(compare == 0) {
				return airports.get(mid).getCode3();
			}
			if(compare < 0) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		
		return null;
	}
	
	//	Linear Search code
	public static String findAirportCode(String toFind, ArrayList<Airport> airports) {
		
		for(int i = 0; i < airports.size(); i++) {
			Airport curr = airports.get(i);
			if(toFind.equals(curr.getCity())) {
				return curr.getCode3();
			}
		}
		return null;
	}
	
	//	Reading the file and converting into the arraylist of airports
	public static ArrayList<Airport> readFile(String fname) throws IOException{
		ArrayList<Airport> airports = new ArrayList<Airport>();
		
		FileInputStream fio = new FileInputStream(fname);
		BufferedReader br = new BufferedReader(new InputStreamReader(fio));
		
		String line = br.readLine();
		
		int n = 100;
		
		while(line != null && n-- > 0) {
			
			String [] data = line.split(",");
			
			for(int i = 0; i < data.length; i++) {
				data[i] = data[i].replace("\"", "");
			}
			
			int airportId = Integer.parseInt(data[0]);
			String name = data[1];
			String city = data[2];
			String country = data[3];
			String code3 = data[4];
			String code4 = data[5];
			double latitude = Double.parseDouble(data[6]);
			double longitude = Double.parseDouble(data[7]);
			int altitude = Integer.parseInt(data[8]);
			float timezone = Float.parseFloat(data[9]);
			char dst = data[10].charAt(0);
			String dbTimezone = data[11];
			
			Airport airport = new Airport(airportId, name, city, country, code3, code4, latitude, longitude, altitude, timezone, dst, dbTimezone);
			airports.add(airport);
			
			line = br.readLine();
		}
		
		br.close();
		
		return airports;
	}

}
