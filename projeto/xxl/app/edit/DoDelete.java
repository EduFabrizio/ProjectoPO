package xxl.app.edit;

import javax.smartcardio.CommandAPDU;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import xxl.core.Spreadsheet;
import xxl.core.exception.UnrecognizedEntryException;
import xxl.app.exception.InvalidCellRangeException;

import xxl.core.exception.DivideByZeroException;

// FIXME import classes

/**
 * Delete command.
 */
class DoDelete extends Command<Spreadsheet> {

  DoDelete(Spreadsheet receiver) {
    super(Label.DELETE, receiver);
    addStringField("Gama_del", Message.address());
  }
  
  @Override
  protected final void execute() throws CommandException{
    
    try{
      _receiver.clear("Gama_del");
    
  }
  catch(UnrecognizedEntryException e){
    
  }
  }
}
