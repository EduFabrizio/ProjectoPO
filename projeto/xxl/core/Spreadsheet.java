package xxl.core;

// FIXME import classes

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import xxl.app.exception.InvalidCellRangeException;
import xxl.core.exception.IncorrectBinaryFunctionException;
import xxl.core.exception.IncorrectIntervalFunctionException;
import xxl.core.exception.UnrecognizedEntryException;

/**
 * Class representing a spreadsheet.
 */
public class Spreadsheet implements Serializable {
  @Serial
  private static final long serialVersionUID = 202308312359L;
  
  private int _rows;

  private int _columns;

  private boolean _changed;

  private CutBuffer _cutBuffer;

  private Cell[][] _matrizCells;


    public Spreadsheet(int rows, int columns){
      _rows = rows;
      _columns = columns;
      _changed = false;
	  _matrizCells = new Cell[_rows][_columns];
  }

  public List<Cell> getCutBufferSpreadsheet(){
    return _cutBuffer.getCutBuffer();
  }

  public void copy(String range) throws UnrecognizedEntryException
  {}

  public void cut(String range)
  {}

  public void paste(String range)
  {}

  public void clear(String range) throws UnrecognizedEntryException, InvalidCellRangeException
  {
	Range newRange = buildRange(range);
	List<Cell> cells = newRange.getCells();
	int row = newRange.getBeginRow(), col = newRange.getBeginColumn();
	for (Cell c : cells)
  	{
		if (c == null)
		{
			c = new Cell(row, col, new NullContent());
		}
		else
		{
			c.setContent(new NullContent());
		}
		if (row == newRange.getEndRow())
			col++;
		if (col == newRange.getEndColumn())
			row++;
	}
  }

  public void clear(Range range)
  {
	List<Cell> cells = range.getCells();
	int row = range.getBeginRow(), col = range.getBeginColumn();
	for (Cell c : cells)
  	{
		if (c == null)
		{
			c = new Cell(row, col, new NullContent());
		}
		else
		{
			c.setContent(new NullContent());
		}
		if (row == range.getEndRow())
			col++;
		if (col == range.getEndColumn())
			row++;
	}
  }
  }

  public void addUser(User u){

  }

  public void insert(int linha, int coluna , Content conteudo){
    _matrizCells[linha - 1][coluna - 1] = new Cell(linha, coluna, conteudo);
	_changed = true;
  }

  public void insertContent(int linha, int coluna, String conteudo) throws UnrecognizedEntryException, IncorrectBinaryFunctionException, IncorrectIntervalFunctionException, InvalidCellRangeException{
    Parser parser = new Parser(this);
    Content newConteudo = parser.parseContent(conteudo);
    insert(linha, coluna, newConteudo);
  }

public Cell[][] getMatrizCells(){
  return _matrizCells;
}

public Range buildRange(String range) throws UnrecognizedEntryException, InvalidCellRangeException {
    String[] rangeCoordinates;
    int firstRow, firstColumn, lastRow, lastColumn;
    if (range.indexOf(':') != -1) {
      rangeCoordinates = range.split("[:;]");
      firstRow = Integer.parseInt(rangeCoordinates[0]);
      firstColumn = Integer.parseInt(rangeCoordinates[1]);
      lastRow = Integer.parseInt(rangeCoordinates[2]);
      lastColumn = Integer.parseInt(rangeCoordinates[3]);

      
    } else {
      rangeCoordinates = range.split(";");
      firstRow = lastRow = Integer.parseInt(rangeCoordinates[0]);
      firstColumn = lastColumn = Integer.parseInt(rangeCoordinates[1]);
    }
    
    if (firstRow <= _matrizCells.length && lastRow <= _matrizCells.length && firstColumn <= _matrizCells[0].length && lastColumn <= _matrizCells[0].length)
        return new Range(firstRow, firstColumn, lastRow, lastColumn, this);
    else
      throw new InvalidCellRangeException(range);
  }

  public boolean getChanged()
  {
	return _changed;
  }

  public void setChanged(boolean valor)
  {
	_changed = valor;
  }

  public int getRow()
  {
	return _rows;
  }

  public int getColumn()
  {
	return _columns;
  }
  /**
   * Insert specified content in specified address.
   *
   * @param row the row of the cell to change 
   * param column the column of the cell to change
   * @param contentSpecification the specification in a string format of the content to put
   *        in the specified cell.
   */
}
