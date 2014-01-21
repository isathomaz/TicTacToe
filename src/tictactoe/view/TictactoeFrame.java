package tictactoe.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import tictactoe.controller.TictactoeController;

public class TictactoeFrame extends JFrame
	{
		private TictactoeController baseController;
		private TictactoePanel basePanel;
		
		public TictactoeFrame(TictactoeController baseController)
			{
				this.baseController = baseController;
				basePanel = new TictactoePanel(baseController);
				
				setupFrame();
			}
		private void setupFrame()
			{
				this.setContentPane(basePanel);
				this.setSize(800, 600);
				this.setVisible(true);
			}

	
	}
