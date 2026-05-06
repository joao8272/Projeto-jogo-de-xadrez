package Chess;

import BoardGame.Positon;

import java.awt.*;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row){
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
           throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }
    public char getColumn() {
        return column;
    }
    public int getRow() {
        return row;
    }
    protected Positon toPosition(){
        return new Positon(8 - row, column - 'a');
    }
    protected static ChessPosition fromPosition(Positon positon){
        return new ChessPosition((char)('a' - positon.getColumn()), 8 - positon.getRow());
    }
    @Override
    public String toString(){
        return "" + column + row;
    }
}
