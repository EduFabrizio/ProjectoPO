package xxl.core;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Range{
    private int beginRow;
    private int beginColumn;
    private int endRow;
    private int endColumn;
    private Spreadsheet _spreadsheet;

    public Range(int firstRow, int firstColumn, int lastRow, int lastColumn, Spreadsheet spreadsheet){
        if (beginRow <= spreadsheet.getRow())
			beginRow = firstRow;
		else
			beginRow = spreadsheet.getRow();
		if (beginColumn <= spreadsheet.getColumn())
			beginColumn = firstColumn;
		else
			beginColumn = spreadsheet.getColumn();
		if (endColumn <= spreadsheet.getColumn())
			endColumn = lastColumn;
		else
			endColumn = spreadsheet.getColumn();
		if (endRow <= spreadsheet.getRow())
			endRow = lastRow;
		else
			endRow = spreadsheet.getRow();
		_spreadsheet = spreadsheet;
    }
    public List<Cell> getCells(){
        int i =0;
		int j;
        Cell[][] matCells = _spreadsheet.getMatrizCells();
        List<Cell> lstCells = new ArrayList<Cell>();
		for (i = beginRow;  i <= endRow; i++){
			for (j = beginColumn; j <= endColumn; j++ ){
				lstCells.add(matCells[i-1][j-1]);
			}
		}
        return lstCells;
	}

    public String toString(){
        return "" + beginRow + ";" + beginColumn + ":" + endRow + ";" + endColumn; 
    }

	public int getBeginRow()
	{
		return beginRow;
	}

	public int getBeginColumn()
	{
		return beginColumn;
	}

	public int getEndRow()
	{
		return endRow;
	}

	public int getEndColumn()
	{
		return endColumn;
	}

	public List<Cell> copyRange()
	{
		ArrayList<Cell> cells = (ArrayList<Cell>)getCells();
		ArrayList<Cell> copia = new ArrayList<Cell>();

		for (Cell c : cells)
		{
			copia.add(new Cell(c.getRow(), c.getColumn(), c.getContent()));
		}
		return copia;
	}
}