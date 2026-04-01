package BoardGame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(){
    }
    public Board(int rows, int columns){
        if(rows < 1 || columns < 1){
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }
    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }
    public Piece piece(int row, int column){
        if(!positionExists(row, column)){
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    public Piece piece(Positon positon){
        if(!positionExists(positon)){
            throw new BoardException("Position not on the board");
        }
        return pieces[positon.getRow()][positon.getColumn()];
    }
    public void placePiece(Piece piece, Positon positon){
        if(thereIsAPiece(positon)){
          throw new BoardException(" There is already a piece on position " + positon);
        }
        pieces[positon.getRow()][positon.getColumn()] = piece;
        piece.positon = positon;
    }
    private boolean positionExists(int row, int column){
      return row >= 0 && row < rows && column >= 0 && column < columns;
    }
    public boolean positionExists(Positon positon){
       return positionExists(positon.getRow(), positon.getColumn());
    }
    public boolean thereIsAPiece(Positon positon){
        if(!positionExists(positon)){
            throw new BoardException("Position not on the board");
        }
        return piece(positon) != null;
    }
}
