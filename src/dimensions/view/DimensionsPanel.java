package dimensions.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

import dimensions.controller.DimensionsController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class DimensionsPanel extends JPanel
{
	
	private SpringLayout baseLayout;
	private JLabel appLabel;
	private DimensionsController baseController;
	private JTable table;
	private JScrollPane tablePane;
	private TableCellWrapRenderer myCellRenderer;
	
	
	DimensionsPanel(DimensionsController baseController)
	{
		this.baseController = baseController;
		appLabel = new JLabel();
		appLabel.setText("Welcome to my stupid app!!!!");
		baseLayout = new SpringLayout();
		
		myCellRenderer = new TableCellWrapRenderer();
		System.out.println(myCellRenderer);
		setupTable();
		setupPanel();
		setupListeners();
		
	}
	
	private void setupListeners() 
	{
		
		
		
	}

	private void setupPanel()
	{
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(baseLayout);
		this.setSize(1000,300);
		this.add(appLabel);
		this.add(tablePane);
		
	}
	
	private void setupLayout()
	{

		

	}
	
	private void setupTable()
	{
		String [] columnNames = {"column1", "column2"};
		
		table = new JTable(new DefaultTableModel(baseController.getMyBikes(), columnNames ));
		tablePane = new JScrollPane(table);
		for(int col = 0; col < columnNames.length; col++)
		{
			
			table.getColumnModel().getColumn(col).setCellRenderer(myCellRenderer);
		}
		
		
		
		
	}
	
	
	
}
