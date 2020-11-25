package practicePApplet;

import processing.core.*;

public class MyPApplet extends PApplet{

	private String URL = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcR6DnjMDnrP5EsIve7n2undSzYNFF8y5bNyqA&usqp=CAU";
	private PImage backgroundImg;
	
	private String URL1 = "https://www.extremetech.com/wp-content/uploads/2017/09/17C698_012-640x360.jpg";
	private String URL2 = "file:///C:/Users/RAM/Documents/eclipse-workspace/UCSDUnfoldingMaps/data/palmTrees.jpg";
	
	public void setup()
	{
		size(200, 200);
		background(0, 0, 0);
		backgroundImg = loadImage(URL2, "jpg" );
	}
	
	public void draw()
	{
		backgroundImg.resize(0, height);
		image(backgroundImg, 0, 0);
		int [] color = sunColorSet(second());
		fill(color[0], color[1], color[2]);
		ellipse(width/4, height/5, width/5, height/5);	
	}
	
	public int[] sunColorSet(float seconds)
	{
		int[] rgb = new int[3];
		float diffFrom30 = Math.abs(30-seconds);
		
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		return rgb;
	}

}
