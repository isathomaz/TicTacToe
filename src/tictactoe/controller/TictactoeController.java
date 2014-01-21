package tictactoe.controller;

import tictactoe.view.TictactoeFrame;

public class TictactoeController
	{
		private TictactoeFrame myTictactoeFrame;
		
		
		public void start()
			{
				myTictactoeFrame = new TictactoeFrame(this);
			}
	}
