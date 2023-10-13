package xxl.core;

// FIXME import classes

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import xxl.core.exception.IncorrectBinaryFunctionException;
import xxl.core.exception.IncorrectIntervalFunctionException;
import xxl.core.exception.UnrecognizedEntryException;

/**
 * Class representing a spreadsheet.
 */
public class Spreadsheet implements Serializable {
  @Serial
  private static final long serialVersionUID = 202308312359L;
  
  // FIXME define attributes
  private int _rows;
  private int _columns;
  private boolean _changed;
  private CutBuffer _cutBuffer;
  private Cell[][] _matrizCells;
  // FIXME define contructor(s)
    public Spreadsheet(int rows, int columns){
      _rows = rows;
      _columns = columns;
      _changed = false;
  }
  // FIXME define methods
  public List<Cell> getCutBuffer(){
    return _cutBuffer.getCells();
  }
  public void copy(String range) throws UnrecognizedEntryException{
  
  }
  public void clear(String range){

  }
  public void addUser(User u){

  }
  public void insert(int linha, int coluna , Content conteudo){
    _matrizCells[linha][coluna].setContent(conteudo);
	_changed = true;
  }
  public void insertContent(int linha, int coluna, String conteudo) throws UnrecognizedEntryException, IncorrectBinaryFunctionException, IncorrectIntervalFunctionException{
    Parser parser = new Parser(this);
    Content newConteudo = parser.parseContent(conteudo);
    insert(linha, coluna, newConteudo);
  }

public Cell[][] getMatrizCells(){
  return _matrizCells;
}


public Range buildRange(String range) throws UnrecognizedEntryException {
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
    // check if coordinates are valid
    // if yes
    return new Range(firstRow, firstColumn, lastRow, lastColumn, this);
  }

  public boolean getChanged()
  {
	return _changed;
  }

  public void setChanged(boolean valor)
  {
	_changed = valor;
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
