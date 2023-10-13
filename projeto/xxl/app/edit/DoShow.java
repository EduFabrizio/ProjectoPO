package xxl.app.edit;

import pt.tecnico.uilib.Display;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import xxl.core.Spreadsheet;
import xxl.core.exception.DivideByZeroException;
import xxl.core.exception.UnrecognizedEntryException;
import xxl.app.exception.InvalidCellRangeException;
import xxl.core.Cell;
import java.util.List;

// FIXME import classes

/**
 * Class for searching functions.
 */
class DoShow extends Command<Spreadsheet> {

  DoShow(Spreadsheet receiver) {
    super(Label.SHOW, receiver);
    addStringField("show_gama", Message.address());
  }
  
  @Override
  protected final void execute() throws CommandException {
	List<Cell> cells = null;
	try
	{
		cells = _receiver.buildRange(stringField("show_gama")).getCells();
	}
    catch (UnrecognizedEntryException ex)
	{
		throw new InvalidCellRangeException(stringField("show_gama"));
	}
	for (Cell c : cells)
	{
		if (c.getContent() != null)
		{
			try
			{
				_display.addLine(Integer.toString(c.getRow()) + ";" + Integer.toString(c.getColumn()) + "|" + c.getContent().showCont());
			}
			catch(Exception ex)
			{}
		}
		else
		{
			_display.addLine(Integer.toString(c.getRow()) + ";" + Integer.toString(c.getColumn()) + "|");
		}	
		_display.display();	
	}
  }
}
