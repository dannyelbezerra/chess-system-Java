package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {

		this.board = board;
		position = null; //o java já joga o valor nulo, caso não queira colocar o valor da posição.
	}

	protected Board getBoard() {
		return board;
	}


	
	
	
	
	
	
	
	
	

}
