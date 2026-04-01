package BoardGame;

public class Piece {
    protected Positon positon;

    private Board board;

    public Piece(){
    }
    public Piece(Board board){
        this.board = board;
        positon = null;
    }
    protected Board getBoard() {
        return board;
    }
}
