public class Board
{
//this is a change
	private static int board[][];
	private final BOARD_WIDTH = 8;
	private final BOARD_HEIGHT = 8;
	private final int RED = 1;
	private final int BLACK = -1;
	private final int EMPTY = 0;

	public Board()
	{
		for(int i=0; i<BOARD_HEIGHT; i++)
		{
			for(int j=0; j<BOARD_WIDTH; j++)
			{
				
			}
		}
	}

	public void movePiece(int piece, int row, int column, int new_row, int new_column)
	{
		if(validMove(row, column, new_row,new_column))
		{
			board[new_row][new_column] = piece;
		}else{
			System.out.println("Invalid move");
		}
	}

	public void validMove(int row, int column, int new_row, int new_column)
	{
		if(row+1 == new_row && column+1 == new_column && new_row < BOARD_WIDTH && new_column < BOARD_HEIGHT)
		{
			return true;
		}else if(row+1 == new_row && column-1 == new_column && new_row < BOARD_HEIGHT && new_column > 0){
			return true;
		}else{
			return false;
		}
	}
}
=======
}
