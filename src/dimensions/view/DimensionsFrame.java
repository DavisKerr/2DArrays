package dimensions.view;


import javax.swing.JFrame;

import dimensions.controller.DimensionsController;

public class DimensionsFrame extends JFrame
{
	private DimensionsPanel basePanel;
	
	
	public DimensionsFrame(DimensionsController baseController)
	{
		
		this.basePanel = new DimensionsPanel(baseController);
		
		setupFrame();
		
	}


	private void setupFrame() 
	{
		
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setResizable(true);
		this.setVisible(true);
		
	}
	
}
