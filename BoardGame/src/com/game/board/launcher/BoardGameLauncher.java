package com.game.board.launcher;

import com.game.board.common.factory.BoardGameFactory;

public class BoardGameLauncher {

	
	public static void main(String args[]){
	
		BoardGameFactory.getBoardGame(args[0] == null ? "default" : "default").play();
		
	}
	
}
