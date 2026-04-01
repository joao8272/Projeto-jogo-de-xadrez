package Chess;

import BoardGame.Board;
import BoardGame.Positon;
import Chess.Pieces.King;
import Chess.Pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i=0; i<board.getRows(); i++){
            for(int j=0; j< board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }
    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Positon(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Positon(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Positon(7, 4));
    }
}
