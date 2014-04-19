public class Board
{

	private static int board[][];
	private final int BOARD_WIDTH = 8;
	private final int BOARD_HEIGHT = 8;
	private final int RED = 1;
	private final int BLACK = -1;
	private final int EMPTY = 0;

	public Board()
	{
		for(int i=0; i<BOARD_HEIGHT; i++)
		{
			for(int j=0; j<BOARD_WIDTH; j++)
			{
				Tile t = new Tile(i,j);	
			}
		}
	}
	public boolean isTileEmpty(Tile tile){
		//see if tile.status is empty
		if(tile.status == 0){
			return true;
		}
		else{
			return false;
		}

	}

	public void movePiece(int piece, int row, int column, int new_row, int new_column)
	{
		if(isValidMove(row, column, new_row,new_column))
		{
			board[new_row][new_column] = piece;
		}else{
			System.out.println("Invalid move");
		}
	}

	public boolean isValidMove(int row, int column, int new_row, int new_column)
	{
		
		//	1.) check to see if isJumpAvailable == true. 
		if(isJumpAvailable){
			//force player to take jump.
			//pop up an alert("There is a jump on the board at " + jumpLocation(tile) +" and you must take it");

			//something to consider down the line, if there move the player is considering taking is available/unavailable, highlight the border of the tile to green/red
			System.out.println("A jump is available and you must take it.");
			return null;
		}
		// 2.) is the tile you're 
		else if({

		}

		//not exactly sure this is the best way to try and check if this is a valid move. I think we need more conditions to check here.
		/*
		if(row+1 == new_row && column+1 == new_column && new_row < BOARD_WIDTH && new_column < BOARD_HEIGHT)
		{
			return true;
		}else if(row+1 == new_row && column-1 == new_column && new_row < BOARD_HEIGHT && new_column > 0){
			return true;
		}else{
			return false;
		}
		*/
	}


}
