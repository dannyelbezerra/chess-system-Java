package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {

		this.board = board;
		position = null; //o java j� joga o valor nulo, caso n�o queira colocar o valor da posi��o.
	}

	protected Board getBoard() {
		return board;
	}


	
	
	
	
	
	
	
	
	

}
