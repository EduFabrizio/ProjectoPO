package xxl.core;

// FIXME import classes

import java.io.Serial;
import java.io.Serializable;

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
  // FIXME define contructor(s)
    public Spreadsheet(int rows, int columns){
      _rows = rows;
      _columns = columns;
      _changed = false;
  }
  // FIXME define methods
  
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
