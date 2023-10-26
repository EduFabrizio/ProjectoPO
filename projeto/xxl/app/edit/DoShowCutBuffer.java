package xxl.app.edit;

import pt.tecnico.uilib.menus.Command;
import xxl.core.Spreadsheet;
import xxl.core.exception.DivideByZeroException;

import java.util.ArrayList;
import xxl.core.Cell;
// FIXME import classes

/**
 * Show cut buffer command.
 */
class DoShowCutBuffer extends Command<Spreadsheet> {

  DoShowCutBuffer(Spreadsheet receiver) {
    super(Label.SHOW_CUT_BUFFER, receiver);
  }
  
  @Override
  protected final void execute() {
    ArrayList<Cell> cutBuffer = (ArrayList<Cell>)_receiver.getCutBufferSpreadsheet();
	for (Cell c : cutBuffer)
	{
		try
		{
			_display.addLine(Integer.toString(c.getRow()) + ";" + Integer.toString(c.getColumn()) + "|" + c.getContent().showCont());
		}
		catch(DivideByZeroException e)
		{}
	}
	_display.display();
  }
}
