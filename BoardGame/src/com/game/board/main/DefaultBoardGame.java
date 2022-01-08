package com.game.board.main;

import com.game.board.components.Board;
import com.game.board.service.BoardGameService;

public class DefaultBoardGame extends BoardGame	{

	public DefaultBoardGame(Board board, BoardGameService boardService) {
		super(board, boardService);
	}

	@Override
	public void play() {
		
	}

}
