package com.game.board.common.factory;

import com.game.board.components.DefaultBoard;
import com.game.board.main.BoardGame;
import com.game.board.main.DefaultBoardGame;
import com.game.board.service.BoardGameService;

public class BoardGameFactory {

	public static BoardGame getBoardGame(String boardGameName) {
		switch (boardGameName) {
		case "default":
			return new DefaultBoardGame(new DefaultBoard(),
					new BoardGameService());
		default:
			return null;

		}
	}

}
