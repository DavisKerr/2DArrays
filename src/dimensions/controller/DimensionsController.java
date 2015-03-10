package dimensions.controller;

import dimensions.model.MountainBikes;
import dimensions.view.DimensionsFrame;

public class DimensionsController 
{
	private MountainBikes [][] myBikes;
	
	private DimensionsFrame baseFrame;
	
	public DimensionsController()
	{
		myBikes = new MountainBikes[3][2];
		
		fillBikes();
		
		baseFrame = new DimensionsFrame(this);
	}
	
	public MountainBikes[][] getMyBikes()
	{
		return myBikes;
	}

	public void setMyBikes(MountainBikes[][] myBikes) 
	{
		this.myBikes = myBikes;
	}

	public void start()
	{
		
	}

	private void fillBikes() 
	{
		int counter = 0;
		String name;
		int speedLevel;
		boolean isAwesome = false;
		int choice;
		
		for(int row = 0; row < myBikes.length; row++)
		{
			for(int col = 0; col < myBikes[0].length; col++)
			{
				
				if(myBikes[row][col] == null)
				{
					name = "bike " + counter;
					speedLevel = (int) ((Math.random()) * 10);
					choice = (int) ((Math.random()) * 2);
					if(choice == 0)
					{
						isAwesome = true;
					}
					else if(choice == 1)
					{
						isAwesome = false;
					}
					myBikes[row][col] = new MountainBikes(name, speedLevel, isAwesome);
					counter++;
				}
				
			}
		}
		//System.out.println(myBikes);
		
	}

	public DimensionsFrame getBaseFrame()
	{
		return baseFrame;
	}


}
