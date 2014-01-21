package tictactoe.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import tictactoe.controller.TictactoeController;
import java.awt.Color;

public class TictactoePanel extends JPanel
	{
		private TictactoeController baseController;
		private SpringLayout baseLayout;
		private JButton submitButton;
		private JButton submitButtontwo;
		private JButton submitButtonthree;
		private JButton submitButtonfour;
		private JButton submitButtonfive;
		private JButton submitButtonsix;
		private JButton submitButtonseven;
		private JButton submitButtoneight;
		private JButton submitButtonnine;
		
		public TictactoePanel(TictactoeController baseController)
			{
			
				this.baseController = baseController;
				
				submitButton = new JButton("Button!!");
				
				submitButtontwo = new JButton("Button!!");
				submitButtonthree = new JButton("Button!!");
				submitButtonfour = new JButton("Button!!");
				submitButtonfive = new JButton("Button!!");
				submitButtonsix = new JButton("Button!!");
				submitButtonseven = new JButton("Button!!");
				submitButtoneight = new JButton("Button!!");
				submitButtonnine = new JButton("Button!!");
				
				
				baseLayout = new SpringLayout();
				baseLayout.putConstraint(SpringLayout.NORTH, submitButtonthree, 45, SpringLayout.SOUTH, submitButtonnine);
				baseLayout.putConstraint(SpringLayout.WEST, submitButtonthree, 10, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, submitButtonthree, -6, SpringLayout.NORTH, submitButtontwo);
				baseLayout.putConstraint(SpringLayout.EAST, submitButtonthree, -6, SpringLayout.WEST, submitButtonseven);
				baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 0, SpringLayout.NORTH, submitButtoneight);
				baseLayout.putConstraint(SpringLayout.WEST, submitButton, 8, SpringLayout.EAST, submitButtoneight);
				baseLayout.putConstraint(SpringLayout.NORTH, submitButtoneight, 0, SpringLayout.NORTH, submitButtonnine);
				baseLayout.putConstraint(SpringLayout.WEST, submitButtoneight, 18, SpringLayout.EAST, submitButtonnine);
				baseLayout.putConstraint(SpringLayout.WEST, submitButtonfive, 0, SpringLayout.WEST, submitButtonfour);
				baseLayout.putConstraint(SpringLayout.SOUTH, submitButtonfive, 0, SpringLayout.SOUTH, submitButtonthree);
				baseLayout.putConstraint(SpringLayout.NORTH, submitButtonsix, 6, SpringLayout.SOUTH, submitButtonseven);
				baseLayout.putConstraint(SpringLayout.SOUTH, submitButtonsix, -235, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, submitButtonseven, 0, SpringLayout.SOUTH, submitButtonthree);
				baseLayout.putConstraint(SpringLayout.EAST, submitButtonseven, 0, SpringLayout.EAST, submitButtonsix);
				baseLayout.putConstraint(SpringLayout.WEST, submitButtonsix, 6, SpringLayout.EAST, submitButtontwo);
				baseLayout.putConstraint(SpringLayout.EAST, submitButtonsix, -493, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, submitButtonfour, 171, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, submitButtonfour, -235, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, submitButtontwo, 225, SpringLayout.SOUTH, submitButtonnine);
				baseLayout.putConstraint(SpringLayout.EAST, submitButtontwo, 83, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.WEST, submitButtonfour, 6, SpringLayout.EAST, submitButtonsix);
				baseLayout.putConstraint(SpringLayout.EAST, submitButtonfour, 79, SpringLayout.EAST, submitButtonsix);
				baseLayout.putConstraint(SpringLayout.NORTH, submitButtontwo, 138, SpringLayout.SOUTH, submitButtonnine);
				baseLayout.putConstraint(SpringLayout.WEST, submitButtontwo, 10, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, submitButtonnine, 10, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, submitButtonnine, 10, SpringLayout.WEST, this);
				
				setupPanel();
				setupLayout();
			}
		
		private void setupPanel()
			{
				this.setLayout(baseLayout);
				this.add(submitButton);
				this.add(submitButtontwo);
				this.add(submitButtonthree);
				this.add(submitButtonfour);
				this.add(submitButtonfive);
				this.add(submitButtonsix);
				this.add(submitButtonseven);
				this.add(submitButtoneight);
				this.add(submitButtonnine);
			}
		
		private void setupLayout()
			{
				setBackground(new Color(0, 51, 102));
				
			}
				
		
		
	}
