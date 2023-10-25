package xxl.app.edit;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import xxl.core.Spreadsheet;
import xxl.core.exception.UnrecognizedEntryException;
import xxl.core.Range;
import xxl.core.Cell;
import xxl.core.Content;

import java.util.List;
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
    int r = 0, l = 0;
    String novaStringRange = stringField("Gama_del");
    Range novaRange = _receiver.buildRange(novaStringRange);
    List<Cell> lstCells = novaRange.getCells();
    r = novaRange.getBeginRow();
    l = novaRange.getBeginColumn();
    for(Cell c: lstCells){
      if (c != null){
        c.setContent(new NullContent());
      }else {
        c = new Cell(r, l, null);
      }
      if (r == novaRange.getEndRow())
				l++;
			if (l == novaRange.getEndColumn())
				r++;
    }
  }
  catch(UnrecognizedEntryException e){
  }
  }
}
