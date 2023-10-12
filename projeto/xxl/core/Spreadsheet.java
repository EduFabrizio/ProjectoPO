package xxl.core;

// FIXME import classes

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


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
  public void copy(){

  }
  public void clear(){

  }
  public void addUser(User u){

  }
  public void insert(int linha, int coluna , Content conteudo){

  }
  Range buildRange(String range) throws UnrecognizedEntryException {
    String[] rangeCoordinates;
    int firstRow, firstColumn, lastRow, lastColumn;
    try{
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
    }}
    catch(UnrecognizedEntryException ex){
      System.out.println("O argumento é invalido");

    }
    // check if coordinates are valid
    // if yes
    return new Range(firstRow, firstColumn, lastRow, lastColumn, this);
  }
  /**
   * Insert specified content in specified address.
   *
   * @param row the row of the cell to change 
   * param column the column of the cell to change
   * @param contentSpecification the specification in a string format of the content to put
   *        in the specified cell.
   */
  public void insertContent(int row, int column, String contentSpecification) throws UnrecognizedEntryException /* FIXME maybe add exceptions */ {
    //FIXME implement method
  }
}
