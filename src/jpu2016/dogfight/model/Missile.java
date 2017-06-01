package jpu2016.dogfight.model;

public class Missile {
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	
	public Missile(Direction direction, Dimension dimension)
	{
		
	}

	public int getWIDTHWithADirection(Direction direction) {
		return WIDTH;
	}

	public int getHEIGHTWithADirection(Direction direction) {
		return HEIGHT;
	}
	
	public void move()
	{
		
	}
	
	public boolean isWeapon()
	{
		
	}
}
