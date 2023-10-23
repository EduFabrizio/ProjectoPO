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
import xxl.core.Range;

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
	int r = 0, l = 0;
	List<Cell> cells = null;
	Range range;
	String _range = stringField("show_gama");
	try
	{	
		range = _receiver.buildRange(_range);		
		cells = range.getCells();
		r = range.getBeginRow();
		l = range.getBeginColumn();
		for (Cell c : cells)
		{
			if (c != null)
			{
				_display.addLine(c.toString());
			}
			else
			{
				_display.addLine(Integer.toString(r) + ";" + Integer.toString(l) + "|");
			}	
			if (r == range.getEndRow())
				l++;
			if (l == range.getEndColumn())
				r++;
		}
	}
    catch (UnrecognizedEntryException ex)
	{
		throw new InvalidCellRangeException(stringField("show_gama"));
	}	
  }
}
