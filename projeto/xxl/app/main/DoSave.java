package xxl.app.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import xxl.app.exception.FileOpenFailedException;
import xxl.core.Calculator;
// FIXME import classes
import xxl.core.exception.MissingFileAssociationException;

/**
 * Save to file under current name (if unnamed, query for name).
 */
class DoSave extends Command<Calculator> {

  DoSave(Calculator receiver) {
    super(Label.SAVE, receiver, xxl -> xxl.getSpreadsheet() != null);
  }
  
  @Override
  protected final void execute() throws CommandException{
	try
	{
		_receiver.save();
	}
	catch(MissingFileAssociationException exMiss)
	{
		String filename = Form.requestString(Message.newSaveAs());
		try
		{
			_receiver.saveAs(filename);
		}
		catch (Exception ex)
		{
			throw new FileOpenFailedException(ex);
		}
	}
	catch (Exception ex2)
	{
		throw new FileOpenFailedException(ex2);
	}
  }
}
