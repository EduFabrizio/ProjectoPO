package xxl.app.search;

import pt.tecnico.uilib.menus.Command;
import xxl.core.LiteralString;
import xxl.core.Spreadsheet;
import xxl.core.exception.DivideByZeroException;

import java.util.ArrayList;

import xxl.app.exception.OurCommandException;
import xxl.core.Cell;
// FIXME import classes

/**
 * Command for searching content values.
 */
class DoShowValues extends Command<Spreadsheet> {

  DoShowValues(Spreadsheet receiver) {
    super(Label.SEARCH_VALUES, receiver);
    addStringField("showValue", Message.searchValue());
  }
  
  @Override
  protected final void execute() {
    String str = stringField("showValue");
	ArrayList<Cell> list = (ArrayList<Cell>)_receiver.getEqualValue(str);
	
	for (Cell c : list)
	{
		_display.addLine(c.toString());
	}
	_display.display();
  }
}
