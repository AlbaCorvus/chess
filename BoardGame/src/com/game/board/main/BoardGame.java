package com.game.board.main;

import com.game.board.components.Board;
import com.game.board.service.BoardGameService;

public abstract class BoardGame {

	private final Board board;
	private final BoardGameService boardService;
	
	public BoardGame(Board board, BoardGameService boardService){
		this.board = board;
		this.boardService = boardService;
	}
	
	public abstract void play();
	
	
	
}
