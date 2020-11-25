package practicePApplet;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class EarthquakeCityMap extends PApplet {
	private UnfoldingMap map;
	
	public void setup()
	{
		size(800, 600, OPENGL);
		map = new UnfoldingMap(this, 50, 50, 700, 500, new Google.GoogleMapProvider());	
		MapUtils.createDefaultEventDispatcher(this, map);
		
	}
	
	public void draw()
	{
		map.draw();
	}
}
