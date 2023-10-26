package xxl.app.edit;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import xxl.core.Spreadsheet;
import xxl.core.exception.UnrecognizedEntryException;
import xxl.core.exception.DivideByZeroException;

/**
 * Paste command.
 */
class DoPaste extends Command<Spreadsheet> {

  DoPaste(Spreadsheet receiver) {
    super(Label.PASTE, receiver);
    addStringField("Gama_paste", Message.address());
  }
  
  @Override
  protected final void execute() throws CommandException {
    try{
      _receiver.paste("Gama_paste");
    }
    catch(UnrecognizedEntryException e){

    }
    catch(DivideByZeroException e){

    }
  }
}
