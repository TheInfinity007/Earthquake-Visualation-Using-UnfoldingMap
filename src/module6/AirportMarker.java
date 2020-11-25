package module6;

import java.util.List;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;
import processing.core.PGraphics;

/** 
 * A class to represent AirportMarkers on a world map.
 *   
 * @author Adam Setters and the UC San Diego Intermediate Software Development
 * MOOC team
 *
 */
public class AirportMarker extends CommonMarker {
	public static List<SimpleLinesMarker> routes;
	

	
	public AirportMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());
	
	}
	
	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
		
		String s = this.getStringProperty("code");
		String str = this.getStringProperty("city");
		if(s.length() >= 3 && str.length() < 8) {
			pg.fill(11);
			pg.ellipse(x, y, 5, 5);
		}
				
	}

	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		 // show rectangle with title

		pg.pushStyle();
		
		pg.fill(255, 255, 255);
		pg.rect(x-10, y-10, 20, 20);
		
		pg.fill(0);
		String str = this.getProperty("country") + " " + this.getProperty("name");
		pg.text(str, x, y);
		
		pg.popStyle();
		
	}
	
}
