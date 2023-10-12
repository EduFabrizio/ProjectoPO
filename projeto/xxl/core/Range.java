package xxl.core;

import xxl.core.Spreadsheet;
import java.util.List;

public class Range{
    private int beginRow;
    private int beginColumn;
    private int endRow;
    private int endColumn;
    private Spreadsheet _spreadsheet;

    public Range(int firstRow, int firstColumn, int lastRow, int lastColumn, Spreadsheet spreadsheet){
        beginRow = firstRow;
        beginColumn = firstColumn;
        endRow = lastRow;
        endColumn = lastColumn;
    }
    List<Cell> getCells(){
        return _spreadsheet.getMatriz();

    }
    public String toString(){
        return "" + beginRow + ";" + beginColumn +":" +endRow +";"+endColumn; 
    }
}