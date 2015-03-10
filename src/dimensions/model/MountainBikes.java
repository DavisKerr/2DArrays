package dimensions.model;

public class MountainBikes implements Comparable
{
	
	
	private String name;
	private int speedLevel;
	private boolean isAwesome;
	
	public MountainBikes(String name, int speedLevel, boolean isAwesome)
	{
		this.name = name;
		this.speedLevel = speedLevel;
		this.isAwesome = isAwesome;
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public int getSpeedLevel()
	{
		return speedLevel;
	}
	
	public boolean getIsAwesome()
	{
		return isAwesome;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setSpeedLevel(int speedLevel) {
		this.speedLevel = speedLevel;
	}

	public void setAwesome(boolean isAwesome) {
		this.isAwesome = isAwesome;
	}

	@Override
	public String toString()
	{
		String bikeInfo = "";
		
		bikeInfo += "Hi, I am a mountain bike object :D. My name is " + name;
		bikeInfo += ". I have a speed level of: " + speedLevel;
		
		if(isAwesome)
		{
			bikeInfo += ". davis say's i'm awesome too :D.";
		}
		else
		{
			bikeInfo += ". Im not awesome :(";
		}
		
		return bikeInfo;
	}
	
	public int compareTo(Object comparedBike) 
	{
		int compared = 0;
		
		if((this.speedLevel < ((MountainBikes) comparedBike).getSpeedLevel()) || (!this.isAwesome && ((MountainBikes) comparedBike).getIsAwesome()))
		{
			compared = -1;
		}
		else if((this.speedLevel > ((MountainBikes) comparedBike).getSpeedLevel()) || (this.isAwesome && !((MountainBikes) comparedBike).getIsAwesome()))
		{
			compared = 1;
		}
		
		return compared;
		
	}
	
	
	
}
