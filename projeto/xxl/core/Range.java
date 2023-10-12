package xxl.core;

import xxl.core.Spreadsheet;

import java.util.ArrayList;
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
        int i =0;
        Cell[][] matCells = _spreadsheet.getMatrizCells();
        ArrayList<Cell> lstCells = new ArrayList<Cell>();
        if(beginColumn == endColumn){
            for(Cell cell: lstCells){
                cell = matCells[i++][beginColumn];
        }}
        if(beginRow==endRow){
            for(Cell cell: lstCells){
                cell = matCells[beginRow][i++];
            }
        }
        return lstCells;

    }
    public String toString(){
        return "" + beginRow + ";" + beginColumn +":" +endRow +";"+endColumn; 
    }
}